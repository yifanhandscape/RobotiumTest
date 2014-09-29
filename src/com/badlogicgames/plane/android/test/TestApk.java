package com.badlogicgames.plane.android.test;


import com.robotium.solo.*;
//import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import java.util.Random;
import android.util.DisplayMetrics;
import android.util.Log;
import android.graphics.Rect;

@SuppressWarnings("unchecked")
public class TestApk extends ActivityInstrumentationTestCase2 {
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.badlogicgames.plane.android.AndroidLauncher";
	private static Class launcherActivityClass;
	static {
		try {
			launcherActivityClass = Class
					.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
			} catch (ClassNotFoundException e) {
					throw new RuntimeException(e);
			}
}
	public TestApk() throws ClassNotFoundException {
		super(launcherActivityClass);
	}

	private Solo solo;

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testClick() throws InterruptedException{
		//Thread.sleep(6000);
        DisplayMetrics ty=new DisplayMetrics();
        //getActivity().getWindowManager().getDefaultDisplay().getMetrics(ty);
        Rect frame=new Rect();
        solo.getCurrentActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight=frame.top;
        solo.getCurrentActivity().getWindowManager().getDefaultDisplay().getMetrics(ty);
        int x2=ty.widthPixels;
        int y2=ty.heightPixels;
        //Log.e("baih", "x="+x2);
        //Log.e("baih", "y="+y2);
        while(true)
        {
            //Thread.sleep(2000);
            Random setindex=new Random();
            int setId=setindex.nextInt(20);
            //Log.e(logtag, "==="+setId);
            switch (setId) {
          case 2:
              //Log.e(logtag, "scroll left");
              solo.scrollToSide(solo.LEFT, (float) 0.8);     
              break;              
          case 5:
              //Log.e(logtag, "scroll right");
              solo.scrollToSide(solo.RIGHT, (float) 0.8);   
              break;              
          case 10:
              //Log.e(logtag, "go back");
              solo.goBack();       
              break;
          }
            Random x=new Random();
            int Rxindex=x.nextInt(x2);
            int xIndex=Rxindex+10;
            Random y=new Random();
            int Ryindex=y.nextInt(y2);
            int yIndex=Ryindex+statusBarHeight+5;
            if(yIndex>=y2 ||  xIndex>=x2)
            {
                continue;
            }
            else
            {
              solo.clickOnScreen(xIndex, yIndex);
            }
        }
	
		
		}
	@Override
	public void tearDown() throws Exception {
	solo.finishOpenedActivities();
	}
}
