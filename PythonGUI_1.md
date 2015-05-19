# Writing android gui using python(introduction) #

## Introduction ##

> PythonForAndroid provides support for python script language on android. CLE project supports interaction between python and java, gives a common interface for multiple programming languages. And wrapandroid project encapsulates android java class with cle objects. Using the three components, programmers can write android gui programs with python directly. This article is an introduction. There will have series of articles to further explain how to programming android applications using python.

## 1. Preparing environment. ##

a: install PythonForAndroid from http://code.google.com/p/android-scripting

b: CLE may install from network by application automatically, you need only include  starcore\_android\_r5.jar in the project. The file is in starcore\_devfiles\_r5.zip, which can be download from http://code.google.com/p/cle-for-android

c: Wrapandroid has two files: wrapandroid.jar and SRPWrapAndroidEngine.xml, which can be download from http:/code.google.com/p/wrapandroid-for-multilaguage/download/wrapandroid\_devfiles\_0\_8\_1.rar

## 2. Begin programming ##

a. Open eclipse, create a new android project, for example, “introduction”

b. Add Permission, which is used to download and install cle for the application

```
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"></uses-permission>
```

c. copy files : starcore\_android\_r5.jar and wrapandroid.jar into the project directory, and add them to java build path, as shown below.

http://www.srplab.com/android/wrapandroid/library.JPG

d. copy file : SRPWrapAndroidEngine.xml to assets directory.

e. edit IntroductionActivity.java

```
import com.srplab.wrapandroid.*;
public class IntroductionActivity extends WrapAndroidActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        StarActivity._Call("DoAssetsFile", "python", "code.py");
    }
}
```

f. create new text file code.py in assets directory.

## 3. code.py ##

a. get current service maintained by cle

```
SrvGroup = libstarpy._GetSrvGroup()
Service = SrvGroup._GetService("","")
```

b. get current activity, which is created by wrapandroid at init stage

```
StarActivity = Service.ActivityClass.getCurrent();
```

from now on, we can create gui elements. The first element should be layout element, which may be linear layout, absolute layout, etc. In this example, we create linear layout, which contains an edit text and buttons.

c. create root layout

```
MyLayout = Service.LinearLayoutClass._New(StarActivity);
MyLayout.setOrientation("VERTICAL");
```

d. create title layout and gui elements

```
MyTitleLayout = Service.LinearLayoutClass._New(MyLayout);
MyTitleLayout.setLinearLayoutParams(Service.FILL_PARENT,Service.WRAP_CONTENT);
UrlEdit = Service.EditTextClass._New(MyTitleLayout);
UrlEdit.setText("http://www.google.com");
UrlEdit.setLinearLayoutParams(StarActivity.getWidth()-200,Service.WRAP_CONTENT);
GoButton = Service.ButtonClass._New(MyTitleLayout);
GoButton.setText("go");
GoButton.setLinearLayoutParams(100,Service.FILL_PARENT);
def GoButton_onClick(self,ev) :
    global MyWebView;
    MyWebView.loadUrl(UrlEdit.getText());
GoButton.onClick = GoButton_onClick;    
 
ExitButton = Service.ButtonClass._New(MyTitleLayout);
ExitButton.setText("exit");
ExitButton.setLinearLayoutParams(100,Service.FILL_PARENT);
def ExitButton_onClick(self,ev) :
    global StarActivity;
    StarActivity.exit(0);
ExitButton.onClick = ExitButton_onClick;   
```

e. create webview layout and webview instance

```
MyTitleLayout1 = Service.LinearLayoutClass._New(MyLayout);
MyTitleLayout1.setLinearLayoutParams(Service.FILL_PARENT,Service.FILL_PARENT);
MyWebView = Service.WebViewClass._New(MyTitleLayout1)
MyWebView.setLinearLayoutParams(Service.FILL_PARENT,Service.FILL_PARENT);
MyWebSettings = MyWebView.getSettings();
MyWebSettings.setJavaScriptEnabled(True);
MyWebSettings._Free();
```

The screenshot is as shown below:

![http://www.srplab.com/android/wrapandroid/introduction_screenshot.png](http://www.srplab.com/android/wrapandroid/introduction_screenshot.png)

examples can be download from : http://www.srplab.com/android/pythongui_introduction.rar