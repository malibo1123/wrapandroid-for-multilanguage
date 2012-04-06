package com.srplab.wrapandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.shapes.RoundRectShape;

import com.srplab.www.starcore.StarObjectClass;

		class StarCLERoundRectShape implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;    
			public RoundRectShape roundrectshape;
			private List<Object> RefList;
			public StarCLERoundRectShape(Context ctx,StarObjectClass In_Object){
				roundrectshape = new RoundRectShape(null,null,null);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return roundrectshape;}
			public void SetAndroidObject(Object object){roundrectshape=(RoundRectShape)object;}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}