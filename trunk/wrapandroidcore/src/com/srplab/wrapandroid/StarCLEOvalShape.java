package com.srplab.wrapandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.shapes.OvalShape;

import com.srplab.www.starcore.StarObjectClass;

		class StarCLEOvalShape implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;    
			public OvalShape ovalshape;
			private List<Object> RefList;
			public StarCLEOvalShape(Context ctx,StarObjectClass In_Object){
				ovalshape = new OvalShape();
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return ovalshape;}
			public void SetAndroidObject(Object object){ovalshape=(OvalShape)object;}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}