//
//  Robotium Test
//
//  Created by Yifan Chen on 9/29/2014.
//

# Handscape
Robotium documentations.

## Platform
 - Mac
 - Nexus 7
 - Eclipse ADT

## Install Robotium

 1. Download robotium. Download here: https://code.google.com/p/robotium/wiki/Downloads?tm=2
 2. Create a new Android test project
        File -> New -> Other -> Android Test Project
    Type in the project name, best use the projectname.test, in the next page, select this project for test target
 3. Modify the AndroidManifest.xml
        change the target package name to the package you want to test
 4. Under Src folder, create a new package and under the package create new Junit Test Case
 5. Create a new folder lib under the root project and Put the robotium-solo-5.2.1.jar which you downloaded from the website into the lib 
 6. Right click on robotium-solo-5.2.1.jar and click build path and then click add to Build Path
 7. Right click on the project and click properties, in the java build path click the tab library and add the robotium-solo-5.2.1.jar into library and then click the Order and Export tab , select the robotium-solo-5.2.1.jar
 8. Modify you scipt in the new Junit test case you just created
 9. When you run it, just right click on the project and select run as -> Android Junit Test

https://code.google.com/p/robotium/wiki/Getting_Started
http://www.vogella.com/tutorials/Robotium/article.html
https://code.google.com/p/robotium/wiki/RobotiumTutorials


  
