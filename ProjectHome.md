For developers,android only presents java interface. Although ndk is provided, programmers can develop native c++ apps, but it is a hard work and they can not develop GUI applications. Not to mention to use script language such as lua or python.

This project wraps android classes based on cle( http://code.google.com/p/cle-for-android ) ,which enable programmers to write gui applications using lua, python, or c/c++. One android class is wrapped with one cle class, then, cle class exposes common interface to multi-languages. Functions presented by cle classes is nearly 80% same as android classes, and very easy to understand and use.

wrapandroid supports android version 2.2/3.0/3.2/4.0, and cle version above [r7](https://code.google.com/p/wrapandroid-for-multilanguage/source/detail?r=7)(1.6.1.0)
for version 0.9.0, android version 2.1 is not supported, and cle version should be above [r7](https://code.google.com/p/wrapandroid-for-multilanguage/source/detail?r=7)(1.6.1.0)

## Version 0.9.0 is uploaded ##

## The project is in progress, welcome to join, source code and examples can be obtained from download page ##

# Articles #

  * python:Introduction http://www.codeproject.com/Articles/367036/Writing-android-gui-using-python-introduction

  * python:list view and custom view http://www.codeproject.com/Articles/374083/Writing-android-gui-using-python-list-view-and-cus

  * python:basic gui elements http://www.codeproject.com/Articles/368985/Writing-android-gui-using-python-basic-gui-element

  * python:gallery http://www.codeproject.com/Articles/372095/Writing-an-Android-GUI-using-Python-Gallery

  * python:menu and popup window http://www.codeproject.com/Articles/377432/Writing-an-Android-GUI-using-Python

  * lua:Introduction http://www.codeproject.com/Articles/375293/Writing-Android-GUI-Using-LUA-Introduction

# Using wrapandroid #

develop lua,python, or c++ gui applications using ecllipse

add starcore\_android\_r7.jar, wrapandroid.jar to your project. As follows:

http://wrapandroid-for-multilanguage.googlecode.com/svn/wiki/images/wrapandroid_1.JPG

http://wrapandroid-for-multilanguage.googlecode.com/svn/wiki/images/wrapandroid_2.JPG

**for c++**

```
public class CexampleActivity extends WrapAndroidActivity {	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       StarActivity._Call("DoFile","",sharelib file name with full path);
    }
}
```


**for lua**

```
public class LuaexampleActivity extends WrapAndroidActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StarActivity._Call("DoAssetsFile", "lua", lua file in assets);
    }
}
```

**for python, (SL4A should be installed)**

```
public class PythonexampleActivity extends WrapAndroidActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StarActivity._Call("DoAssetsFile", "python", python file in assets);
    }
}
```

# Examples #

![http://wrapandroid-for-multilanguage.googlecode.com/svn/wiki/images/wrapandroid_screenshot.png](http://wrapandroid-for-multilanguage.googlecode.com/svn/wiki/images/wrapandroid_screenshot.png)

# layout : main.xml #
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/widget73"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical" >

    <TextView
        android:id="@+id/widget45"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:text="@string/hello" /> 
    <Button
        android:id="@+id/widget74"
        android:layout_width="220dp"
        android:layout_height="48dp"
        android:text="thank for your use"
        android:typeface="serif"
        android:textStyle="bold"
        android:textColor="#ffff0000"
        android:layout_x="284dp"
        android:layout_y="220dp"
        android:textSize="16dp"
    />        
</LinearLayout>

```

# 1: write in lua #

## activity ##

```
package com.wrapandroid.luaexample;

import android.os.Bundle;
import com.srplab.wrapandroid.*; 

public class LuaexampleActivity extends WrapAndroidActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	DumpInfoFlag = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        StarActivity._Call("DoAssetsFile", "lua", "code.lua");
    }
}
```

## code.lua ##
```
SrvGroup = libstarcore._GetSrvGroup()
Service = SrvGroup:_GetService("","")

--get activity
StarActivity = Service.ActivityClass:getCurrent();

--create Button
MyText = StarActivity:findViewById("TextViewClass",StarActivity:getResource("id/widget45"));
MyText:setText("from layout");

MyButton = StarActivity:findViewById("ButtonClass",StarActivity:getResource("id/widget74"));
function MyButton:onClick(Ev) 
    Service.ToastClass:_New():makeText("Button is click", 0):show();
end    
MyButton:setOnClickListener();
MyButton:setText("click me");

MyLinearLayout = StarActivity:findViewById("LinearLayoutClass",StarActivity:getResource("id/widget73"));

MyDynaButton = Service.ButtonClass:_New(MyLinearLayout);
print(MyDynaButton);
function MyDynaButton:onClick(Ev)
    Service.ToastClass:_New():makeText("Button is click", 0):show();
end    
MyDynaButton:setOnClickListener();
MyDynaButton:setText("created dynamically");
MyDynaButton:setLinearLayoutParams(100,50);

```



# 2: write in python #

## activity ##

```
package com.wrapandroid.pythonexample;

import android.app.Activity;
import android.os.Bundle;
import com.srplab.wrapandroid.*; 

public class PythonexampleActivity extends WrapAndroidActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	DumpInfoFlag = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        StarActivity._Call("DoAssetsFile", "python", "code.py");
    }
}
```

## code.py ##

```
SrvGroup = libstarpy._GetSrvGroup()
Service = SrvGroup._GetService("","")

#--get activity
StarActivity = Service.ActivityClass.getCurrent();

#--create Button
MyText = StarActivity.findViewById("TextViewClass",StarActivity.getResource("id/widget45"));
MyText.setText("from layout");

MyButton = StarActivity.findViewById("ButtonClass",StarActivity.getResource("id/widget74"));
def MyButton_onClick(self, Ev) :
    Service.ToastClass._New().makeText("Button is click", 0).show();
MyButton.onClick = MyButton_onClick;    
MyButton.setOnClickListener();
MyButton.setText("click me");

MyLinearLayout = StarActivity.findViewById("LinearLayoutClass",StarActivity.getResource("id/widget73"));

MyDynaButton = Service.ButtonClass._New(MyLinearLayout);
def MyDynaButton_onClick(self, Ev) :
    Service.ToastClass._New().makeText("Button is click", 0).show();
MyDynaButton.onClick = MyDynaButton_onClick;
MyDynaButton.setOnClickListener();
MyDynaButton.setText("created dynamically");
MyDynaButton.setLinearLayoutParams(100,50);

```

# 3: write in c++ #

## activity ##

```
package com.wrapandroid.cexample;

import android.os.Bundle;
import com.srplab.wrapandroid.*; 

public class CexampleActivity extends WrapAndroidActivity {	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	DumpInfoFlag = true; 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        StarActivity._Call("DoFile","","/data/data/com.wrapandroid.cexample/lib/libCode.so");
    }
}
```

## code.cpp ##

```
#include "SRPWrapAndroidEngine_VSClass.h"

static class ClassOfSRPInterface *SRPInterface;
static void *StarActivity;


static VS_INT32 MyButton_onClick(VS_ULONG FunctionChoice,void *EventPara)
{
	void *toast = SRPInterface->MallocObjectL(&VSOBJID_ToastClass,0,NULL);
	SRPInterface -> ScriptCall(toast,NULL,"makeText","(si)","Button is click", 0);
	SRPInterface -> ScriptCall(toast,NULL,"show","()");
    return 0;
}

static VS_INT32 MyButton1_onClick(VS_ULONG FunctionChoice,void *EventPara)
{
	void *toast = SRPInterface->MallocObjectL(&VSOBJID_ToastClass,0,NULL);
	SRPInterface -> ScriptCall(toast,NULL,"makeText","(si)","Button is click", 0);
	SRPInterface -> ScriptCall(toast,NULL,"show","()");
    return 0;
}

VS_BOOL StarCoreService_Init(class ClassOfStarCore *starcore)
{
	class ClassOfBasicSRPInterface *BasicSRPInterface;
	
	//--init star core
	BasicSRPInterface = starcore ->GetBasicInterface();	
	SRPInterface = BasicSRPInterface ->GetSRPInterface(BasicSRPInterface->QueryActiveService(NULL),"","");
	
	void *ActivityClass;
	ActivityClass = SRPInterface -> GetObjectEx(NULL,"ActivityClass");
	StarActivity = (void *)SRPInterface -> ScriptCall(ActivityClass,NULL,"getCurrent","()O");
	SRPInterface -> Print("Get Main Activity = %s", SRPInterface -> GetName(StarActivity));	

    int widget45 = SRPInterface -> ScriptCall(StarActivity,NULL,"getResource","(s)i","id/widget45");
    void *MyText = (void *)SRPInterface -> ScriptCall(StarActivity,NULL,"findViewById","(si)o","TextViewClass",widget45);
    SRPInterface -> ScriptCall(MyText,NULL,"setText","(s)","TextViewClass","from layout");

    int widget74 = SRPInterface -> ScriptCall(StarActivity,NULL,"getResource","(s)i","id/widget74");
    void *MyButton = (void *)SRPInterface -> ScriptCall(StarActivity,NULL,"findViewById","(si)o","ButtonClass",widget74);
    SRPInterface -> ScriptCall(MyButton,NULL,"setText","(s)","click me");
    SRPInterface -> ScriptCall(MyButton,NULL,"setOnClickListener","()");
    SRPInterface -> RegEventFunction(MyButton,&VSOUTEVENTID_ViewClass_onClick,MyButton,(void *)MyButton_onClick,0);
    
    int widget73 = SRPInterface -> ScriptCall(StarActivity,NULL,"getResource","(s)i","id/widget73");
	void *MyLinearLayout = (void *)SRPInterface -> ScriptCall(StarActivity,NULL,"findViewById","(si)o","LinearLayoutClass",widget73);
	
	void *MyDynaButton = SRPInterface->MallocObject(MyLinearLayout,VSATTRINDEX_VIEWGROUPCLASS_VIEWQUEUE,&VSOBJID_ButtonClass,0,NULL);
    SRPInterface -> ScriptCall(MyDynaButton,NULL,"setText","(s)","created dynamically");
    SRPInterface -> ScriptCall(MyDynaButton,NULL,"setOnClickListener","()");
    SRPInterface -> RegEventFunction(MyDynaButton,&VSOUTEVENTID_ViewClass_onClick,MyDynaButton,(void *)MyButton1_onClick,0);
    SRPInterface -> ScriptCall(MyDynaButton,NULL,"setLinearLayoutParams","(ii)",100,50);

	return VS_TRUE;
}

void StarCoreService_Term(class ClassOfStarCore *starcore)
{
	SRPInterface -> Release();
	return;
}
```

## Android.mk ##

```
LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

# Here we give our module name and sourcefile(s)
LOCAL_CFLAGS += -Wno-write-strings -DENV_ANDROID
LOCAL_CPPFLAGS += -Wno-write-strings -fexceptions -DENV_ANDROID
LOCAL_LDFLAGS += -Wno-write-strings -DENV_ANDROID

LOCAL_C_INCLUDES += ../../cle_files/include

#--------source file
MODULE_CXXSRCS := Code.cpp SRPWrapAndroidEngine_UUIDDef.cpp SRPWrapAndroidEngine_VSClass.cpp

LOCAL_SRC_FILES := ${MODULE_CXXSRCS}
LOCAL_LDLIBS := ../../cle_files/libs/armeabi/libstarlib.a

LOCAL_MODULE  := Code

include $(BUILD_SHARED_LIBRARY)
```

# Android objects being wrapped or partially wrapped #

## version 0.9.0 ##

  * BitmapFactory\_Options
  * TypedArray
  * ColorFilter
  * PorterDuffColorFilter
  * LightingColorFilter
  * ColorMatrixColorFilter
  * MaskFilter
  * BlurMaskFilter
  * EmbossMaskFilter
  * ComposeShader
  * PathEffect
  * ComposePathEffect
  * CornerPathEffect
  * DashPathEffect
  * DiscretePathEffect
  * PathDashPathEffect
  * SumPathEffect
  * Interpolator
  * AccelerateDecelerateInterpolator
  * AccelerateInterpolator
  * AnticipateInterpolator
  * AnticipateOvershootInterpolator
  * BounceInterpolator
  * CycleInterpolator
  * DecelerateInterpolator
  * LinearInterpolator
  * OvershootInterpolator
  * AlphaAnimation
  * AnimationSet
  * RotateAnimation
  * ScaleAnimation
  * TranslateAnimation
  * ContextMenuInfo
  * AdapterContextMenuInfo
  * ExpandableListContextMenuInfo
  * Editable
  * TypedValue
  * ViewConfiguration
  * MenuInflater
  * JsResult
  * JsPromptResult
  * WebChromeClient
  * BaseExpandableListAdapter
  * UriMatcher
  * Uri\_Builder
  * ContentUris
  * ExpandableListView
  * OsBuild
  * Display
  * AlarmManager
  * SystemClock
  * ComponentName
  * Ringtone
  * RingtoneManager
  * AudioManager
  * SurfaceHolder
  * EditorInfo
  * InputConnection
  * StatFs
  * Criteria
  * LocationProvider
  * GpsSatellite
  * IterableObject
  * GpsStatus
  * LocationManager
  * Location
  * SetObject
  * SmsMessage
  * ListObject
  * Locale
  * SetObject
  * SimpleTimeZone
  * TimeZone
  * Date
  * Calendar
  * GregorianCalendar
  * InputStream
  * OutputStream
  * VideoView
  * MediaController

## version 0.8.5 ##

  * Activity
  * View
  * LinearLayout
  * RadioGroup
  * AbsoluteLayout
  * TextView
  * EditText
  * Button
  * CompoundButton
  * RadioButton
  * CheckBox
  * ImageView
  * ImageButton
  * Adapter
  * AdapterView
  * AbsSpinner
  * Gallery
  * ProgressBar
  * Spinner
  * BaseAdapter
  * StringArrayAdapter
  * GridView
  * AutoCompleteTextView
  * AnalogClock
  * DigitalClock
  * FrameLayout
  * DatePicker
  * TimePicker
  * ListView
  * Paint
  * Path
  * Canvas
  * Bitmap
  * Matrix
  * BitmapFactory
  * Typeface
  * WebSettings
  * WebView
  * TableRow
  * TableLayout
  * FileOutputStream
  * FileInputStream
  * AssetFileDescriptor
  * MediaPlayer
  * SurfaceView
  * SoundPool
  * Intent
  * Window
  * AlertDialog
  * Dialog
  * RelativeLayout
  * Bundle
  * MotionEvent
  * Drawable
  * BitmapDrawable
  * ColorDrawable
  * GradientDrawable
  * ShapeDrawable
  * AnimationDrawable
  * TransitionDrawable
  * LayerDrawable
  * DrawableContainer
  * Shape
  * RectShape
  * OvalShape
  * ArcShape
  * RoundRectShape
  * ViewGroup
  * Toast
  * Menu
  * SubMenu
  * MenuItem
  * ContextMenu
  * IntentFilter
  * BroadcastReceiver
  * KeyEvent
  * ScrollView
  * HorizontalScrollView
  * ByteArrayInputStream
  * ByteArrayOutputStream
  * StateListDrawable
  * DatePickerDialog
  * TimePickerDialog
  * PopupWindow
  * File
  * Environment
  * ViewFactory
  * ViewSwitcher
  * TextSwitcher
  * AnimationUtils
  * Animation
  * ViewAnimator
  * ImageSwitcher
  * AbsSeekBar
  * RatingBar
  * SeekBar
  * TwoLineListItem
  * AndroidConstant
  * ToggleButton
  * ZoomButton
  * QuickContactBadge
  * ViewFlipper
  * LayoutInflater
  * SharedPreferences
  * Editor
  * SimplePackageManager
  * Vibrator
  * NotificationManager
  * Uri
  * PendingIntent
  * Notification
  * RemoteViews
  * NetworkInfo
  * ConnectivityManager
  * CdmaCellLocation
  * GsmCellLocation
  * TelephonyManager
  * Shader
  * BitmapShader
  * LinearGradient
  * RadialGradient
  * SweepGradient
  * GestureDetector
  * Configuration
  * ListActivity
  * IBinder
  * InputMethodManager
  * StringHashMap
  * StarSimpleAdapter
  * ProgressDialog
  * ViewGroup\_LayoutParams
  * WindowManager\_LayoutParams
  * SensorManager
  * Sensor
  * SensorEvent
  * MediaRecorder
  * AlertDialog\_Builder
  * Cursor
  * ContentObserver
  * DataSetObserver
  * ContentValues
  * ContentResolver
  * CursorAdapter
  * ResourceCursorAdapter
  * SimpleCursorAdapter
  * ContactsContract\_Contacts
  * ContactsContract\_PhoneLookup
  * CommonDataKinds\_Phone
  * CommonDataKinds\_Email
  * TabContentFactory
  * TabSpec
  * TabHost
  * XmlPullParser
  * XmlResourceParser
  * AssetManager
  * DisplayMetrics
  * Resources
  * ColorStateList
  * AbsListView
  * SlidingDrawer
  * CheckedTextView
  * WebViewClient
  * SmsManager