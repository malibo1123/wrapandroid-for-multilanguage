package com.srplab.wrapandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;

import com.srplab.www.starcore.StarObjectClass;

		class StarCLEShapeDrawable implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;    
			public ShapeDrawable shapedrawable;
			private List<Object> RefList;
			public StarCLEShapeDrawable(Context ctx,StarObjectClass In_Object){
				shapedrawable = new ShapeDrawable();
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return shapedrawable;}
			public void SetAndroidObject(Object object){shapedrawable=(ShapeDrawable)object;}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}