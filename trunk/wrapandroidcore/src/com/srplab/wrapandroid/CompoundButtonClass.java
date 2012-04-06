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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import com.srplab.www.starcore.*;

/**
 * 
 * @author srplab
 *
 */

public class CompoundButtonClass{
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init CompoundButtonClass");

		class StarCLECompoundButton extends CompoundButton implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;   
			private List<Object> RefList;
			public StarCLECompoundButton(Context ctx,StarObjectClass In_Object){
				super(ctx);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "CompoundButtonClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}	
        /* CompoundButtonClass Body */
        Service._GetObject("CompoundButtonClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		

        		StarCLECompoundButton layout = new StarCLECompoundButton((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)layout);
        		if( parent != null ){
        			if( activity == parent ){
        				Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_activity.setContentView(layout);
        			}else{
        				ViewGroup android_viewgroup = (ViewGroup)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_viewgroup.addView(layout);
        			}
        			self._LockGC();
        			self._Call("decAndroidRef");  // release with parent
        		}
        		return;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean isChecked(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean isChecked(StarObjectClass self){
        		CompoundButton button = (CompoundButton)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( button == null )
        			return false;
        		return button.isChecked();
        	}        	          	
        });  
        
		return true;
	}	
}