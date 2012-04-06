package com.srplab.wrapandroid;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.content.res.AssetManager;
import android.widget.*;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.util.*;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.net.Uri;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import com.srplab.www.starcore.*;

		class StarCLEGallery extends Gallery implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;      
			private List<Object> RefList;
			private StarObjectClass motionevent1,motionevent2;
			public StarCLEGallery(Context ctx,AttributeSet attrs,StarObjectClass In_Object){
				super(ctx);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
				motionevent1 = null;
				motionevent2 = null;
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return null;}
			public void SetAndroidObject(Object object){return;}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
				if( motionevent1 != null )
					motionevent1._Free();
				if( motionevent2 != null )
					motionevent2._Free();				
			}	
			/*------------------------override functions------------------------------*/
			@Override
		    public boolean onDown (MotionEvent e){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onDown");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
					return super.onDown(e);
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e;
				boolean Result = self._Tobool(self._Call("onDown", motionevent1));
				star_motionevent1.motionevent = null;
				return Result;
			}	
			public boolean onSuperDown (MotionEvent e){
				return super.onDown(e);				
			}			
						
			@Override
		    public boolean onFling (MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onFling");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
					return super.onFling(e1,e2,velocityX,velocityY);
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e1;
				if( motionevent2 == null )
					motionevent2 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent2 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent2,"AndroidObject");
				star_motionevent2.motionevent = e2;				
				boolean Result = self._Tobool(self._Call("onFling", motionevent1,motionevent2,velocityX,velocityY));
				star_motionevent1.motionevent = null;
				star_motionevent2.motionevent = null;
				return Result;
			}	
			public boolean onSuperFling (MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
				return super.onFling(e1,e2,velocityX,velocityY);				
			}
			
			@Override
		    public void onLongPress (MotionEvent e){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onLongPress");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) ){
					super.onLongPress(e);
					return;
				}
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e;
				self._Call("onLongPress", motionevent1);
				star_motionevent1.motionevent = null;
				return;
			}	
			public void onSuperLongPress(MotionEvent e){
				super.onLongPress(e);				
			}			

			@Override
		    public boolean onScroll (MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onScroll");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
					return super.onScroll(e1,e2,distanceX,distanceY);
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e1;
				if( motionevent2 == null )
					motionevent2 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent2 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent2,"AndroidObject");
				star_motionevent2.motionevent = e2;				
				boolean Result = self._Tobool(self._Call("onScroll", motionevent1,motionevent2,distanceX,distanceY));
				star_motionevent1.motionevent = null;
				star_motionevent2.motionevent = null;
				return Result;
			}	
			public boolean onSuperScroll (MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
				return super.onScroll(e1,e2,distanceX,distanceY);				
			}
			
			@Override
		    public void onShowPress (MotionEvent e){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onShowPress");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) ){
					super.onShowPress(e);
					return;
				}
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e;
				self._Call("onShowPress", motionevent1);
				star_motionevent1.motionevent = null;
				return;
			}	
			public void onSuperShowPress(MotionEvent e){
				super.onShowPress(e);				
			}			

			@Override
		    public boolean onSingleTapUp (MotionEvent e){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onSingleTapUp");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
					return super.onSingleTapUp(e);
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e;
				boolean Result = self._Tobool(self._Call("onSingleTapUp", motionevent1));
				star_motionevent1.motionevent = null;
				return Result;
			}	
			public boolean onSuperSingleTapUp(MotionEvent e){
				return super.onSingleTapUp(e);				
			}			

			@Override
		    public boolean onTouchEvent (MotionEvent e){
				StarObjectClass self = BasicAndroidObject.getStarObject();
				StarServiceClass Service = (StarServiceClass)self._Get("_Service");
				StarObjectClass definedclass = self._DefinedClass("onTouchEvent");
				StarObjectClass basicclass = Service._GetObject("GalleryClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
					return super.onTouchEvent(e);
				if( motionevent1 == null )
					motionevent1 = Service._GetObject("MotionEventClass")._New();
				StarCLEMotionEvent star_motionevent1 = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent1,"AndroidObject");
				star_motionevent1.motionevent = e;
				boolean Result = self._Tobool(self._Call("onTouchEvent", motionevent1));
				star_motionevent1.motionevent = null;
				return Result;
			}	
			public boolean onSuperTouchEvent(MotionEvent e){
				return super.onTouchEvent(e);				
			}			
			
		}