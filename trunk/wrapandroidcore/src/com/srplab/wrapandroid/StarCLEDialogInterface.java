package com.srplab.wrapandroid;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

import com.srplab.www.starcore.StarObjectClass;

class StarCLEDialogInterface implements BasicAndroidInterface,DialogInterface.OnClickListener,DialogInterface.OnCancelListener,DialogInterface.OnDismissListener,DialogInterface.OnKeyListener,DialogInterface.OnMultiChoiceClickListener{
	private BasicAndroidClass BasicAndroidObject;      
	private List<Object> RefList;
	public StarCLEDialogInterface(Context ctx,StarObjectClass In_Object){
		super();
		BasicAndroidObject = new BasicAndroidClass();
		BasicAndroidObject.setStarObject(In_Object);
		RefList = new ArrayList<Object>();
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
	}	
	/**
	 * <div class="memproto">
	 *   <table class="memname">
	 *     <tr><td class="memname">Event : onCancel(Hashtable Ev) </td></tr>
	 *   </table>
	 * </div>
	 */			
	public void  onCancel(DialogInterface dialog){
		StarObjectClass self = ((BasicAndroidInterface)dialog).getBasicAndroid().getStarObject();
		self._ProcessEvent("onCancel");
	}
	/**
	 * <div class="memproto">
	 *   <table class="memname">
	 *     <tr><td class="memname">Event : onClick(Hashtable Ev, int which) </td></tr>
	 *   </table>
	 * </div>
	 */			
	public void onClick (DialogInterface dialog, int which){
		StarObjectClass self = ((BasicAndroidInterface)dialog).getBasicAndroid().getStarObject();
		self._ProcessEvent("onClick",which);							
	}
	/**
	 * <div class="memproto">
	 *   <table class="memname">
	 *     <tr><td class="memname">Event : onDismiss(Hashtable Ev) </td></tr>
	 *   </table>
	 * </div>
	 */				
	public void  onDismiss(DialogInterface dialog){
		StarObjectClass self = ((BasicAndroidInterface)dialog).getBasicAndroid().getStarObject();
		self._ProcessEvent("onDismiss");							
	}
	/**
	 * <div class="memproto">
	 *   <table class="memname">
	 *     <tr><td class="memname">Event : onKey(Hashtable Ev,int keyCode, KeyEvent event) </td></tr>
	 *   </table>
	 * </div>
	 * @param event  not support current
	 */					
	public boolean  onKey(DialogInterface dialog, int keyCode, KeyEvent event){
		StarObjectClass self = ((BasicAndroidInterface)dialog).getBasicAndroid().getStarObject();
		self._ProcessEvent("onKey",keyCode,null);											
		return false;
	}
	/**
	 * <div class="memproto">
	 *   <table class="memname">
	 *     <tr><td class="memname">Event : onClick(Hashtable Ev, int which, boolean isChecked) </td></tr>
	 *   </table>
	 * </div>
	 */				
	public void onClick (DialogInterface dialog, int which, boolean isChecked){
		StarObjectClass self = ((BasicAndroidInterface)dialog).getBasicAndroid().getStarObject();
		self._ProcessEvent("onClick",which,isChecked);											
		return;
	}
	/**
	 * <div class="memproto">
	 *   <table class="memname">
	 *     <tr><td class="memname">Event : onShow(Hashtable EvonShow) </td></tr>
	 *   </table>
	 * </div>
	 */				
	public void onShow (DialogInterface dialog){
		StarObjectClass self = ((BasicAndroidInterface)dialog).getBasicAndroid().getStarObject();
		self._ProcessEvent("onShow");											
		return;				
	}			
	public void  cancel(){}
	public void  dismiss(){} 			
}