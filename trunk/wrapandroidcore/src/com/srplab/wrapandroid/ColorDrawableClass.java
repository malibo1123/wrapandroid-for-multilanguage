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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Stack;

import com.srplab.www.starcore.*;

/**
 * 
 * @author srplab
 *
 */

public class ColorDrawableClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init ColorDrawableClass");

        /* ColorDrawableClass Body */
        Service._GetObject("ColorDrawableClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEColorDrawable colordrawable = new StarCLEColorDrawable((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)colordrawable);
        		return;
        	}       	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  draw(StarObjectClass self,StarObjectClass canvas) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  draw(StarObjectClass self,StarObjectClass canvas){
        		StarCLEColorDrawable colordrawable = (StarCLEColorDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLECanvas star_canvas = (StarCLECanvas)WrapAndroidClass.GetAndroidObject(canvas,"AndroidObject");
        		if( colordrawable != null && colordrawable.GetAndroidObject() != null )
        			((ColorDrawable)colordrawable.GetAndroidObject()).draw((Canvas)star_canvas.GetAndroidObject());        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getAlpha(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public int  getAlpha(StarObjectClass self){
        		StarCLEColorDrawable colordrawable = (StarCLEColorDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( colordrawable != null && colordrawable.GetAndroidObject() != null )
        			return ((ColorDrawable)colordrawable.GetAndroidObject()).getAlpha();
        		return 0;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getChangingConfigurations(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getChangingConfigurations(StarObjectClass self){
        		StarCLEColorDrawable colordrawable = (StarCLEColorDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( colordrawable != null && colordrawable.GetAndroidObject() != null )
        			return ((ColorDrawable)colordrawable.GetAndroidObject()).getChangingConfigurations();
        		return 0;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getOpacity(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getOpacity(StarObjectClass self){
        		StarCLEColorDrawable colordrawable = (StarCLEColorDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( colordrawable != null && colordrawable.GetAndroidObject() != null )
        			return ((ColorDrawable)colordrawable.GetAndroidObject()).getOpacity();
        		return 0;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setAlpha(StarObjectClass self,int alpha) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setAlpha(StarObjectClass self,int alpha){
        		StarCLEColorDrawable colordrawable = (StarCLEColorDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( colordrawable != null && colordrawable.GetAndroidObject() != null )
        			((ColorDrawable)colordrawable.GetAndroidObject()).setAlpha(alpha);
        	}         	
        });    
        
		return true;
	}	
}