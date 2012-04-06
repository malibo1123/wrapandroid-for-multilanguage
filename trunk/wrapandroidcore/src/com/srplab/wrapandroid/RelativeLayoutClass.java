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

public class RelativeLayoutClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init RelativeLayoutClass");

		class StarCLERelativeLayout extends RelativeLayout implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;       
			private List<Object> RefList;
			public StarCLERelativeLayout(Context ctx,StarObjectClass In_Object){
				super(ctx);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};  
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "RelativeLayoutClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}
        
        /* RelativeLayoutClass Body */
        Service._GetObject("RelativeLayoutClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		

        		StarCLERelativeLayout layout = new StarCLERelativeLayout((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);
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
        	 *     <tr><td class="memname">public void  requestLayout(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  requestLayout(StarObjectClass self){
        		RelativeLayout layout = (RelativeLayout)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( layout == null )
        			return;
       			layout.requestLayout();
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setGravity(StarObjectClass self,int gravity) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setGravity(StarObjectClass self,int gravity){
        		RelativeLayout layout = (RelativeLayout)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( layout == null )
        			return;
       			layout.setGravity(gravity);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setHorizontalGravity(StarObjectClass self,int horizontalGravity) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setHorizontalGravity(StarObjectClass self,int horizontalGravity){
        		RelativeLayout layout = (RelativeLayout)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( layout == null )
        			return;
       			layout.setHorizontalGravity(horizontalGravity);
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setVerticalGravity(StarObjectClass self,int verticalGravity) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setVerticalGravity(StarObjectClass self,int verticalGravity){
        		RelativeLayout layout = (RelativeLayout)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( layout == null )
        			return;
       			layout.setVerticalGravity(verticalGravity);
        	}          	
        });    
		return true;
	}	
}