package com.srplab.wrapandroid;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.AssetFileDescriptor;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import android.content.Intent;
import android.view.WindowManager;
import android.view.Display;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.graphics.drawable.*;

import java.util.Hashtable;
import java.util.Stack;
import java.io.IOException;
import java.io.InputStream;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.SocketException;
import java.lang.System;

import com.srplab.www.starcore.*;

/**
 * 
 * @author srplab
 *
 */

public class ActivityClass{
	static private  WifiManager.WifiLock mWifiLock;
    static boolean opened = false;	
	/**
	 * @note do not call Init method directly
	 */
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init ActivityClass");
		
        /* ActivityClass Body */
        Service._GetObject("ActivityClass")._Assign(new StarObjectClass(){
        	/*_OnCreate Event */
        	public Object[] _OnCreate(Hashtable Ev){
        		StarObjectClass self = (StarObjectClass)Ev.get("_DesObject");  
        		
        		//---resource table
        		Hashtable<String,Integer> ResourceTale;        		
       			ResourceTale = new Hashtable<String,Integer>();
       			self._Set("ResourceTable",ResourceTale);
       			
        		//---activityclass stack, global
        		Stack<StarObjectClass> stack;
        		StarObjectClass activityclass = Service._GetObject("ActivityClass");        		        		
        		stack = (Stack<StarObjectClass>)activityclass._Get("ActivityStack");
        		if( stack == null ){
        			stack = new Stack<StarObjectClass>();
        			activityclass._Set("ActivityStack",stack);
        		}           		    			
    			return null;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void onStart(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note this function can be override
        	 */        	
        	public void onStart(StarObjectClass self){
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass getSaveInstanceState(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @return the returned object should be freed
        	 */
        	public StarObjectClass getSaveInstanceState(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return null;
        		Bundle bundle = (Bundle)self._Get("savedInstanceState");
        		if( bundle == null )
        			return null;
        		StarObjectClass star_bundle = Service._GetObject("BundleClass")._New();
        		StarCLEBundle starcle_bundle = (StarCLEBundle)WrapAndroidClass.GetAndroidObject(star_bundle,"AndroidObject");
        		starcle_bundle.bundle = bundle;
        		return star_bundle;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void onSaveInstanceState(StarObjectClass self,StarObjectClass savedInstanceState) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note this function can be override
        	 */
        	public void onSaveInstanceState(StarObjectClass self,StarObjectClass savedInstanceState){
        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void onRestoreInstanceState(StarObjectClass self,StarObjectClass savedInstanceState) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note this function can be override
        	 */
        	public void onRestoreInstanceState(StarObjectClass self,StarObjectClass savedInstanceState){
        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void onPause(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note this function can be override
        	 */
        	public void onPause(StarObjectClass self){
        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void onResume(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note this function can be override
        	 */
        	public void onResume(StarObjectClass self){
        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void onDestroy(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note this function can be override
        	 */
        	public void onDestroy(StarObjectClass self){
        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void exit(StarObjectClass self,int code) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void exit(StarObjectClass self,int code){
        		System.exit(code);
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void pushActivity(StarObjectClass self,StarObjectClass activity) </td></tr>
        	 *   </table>
        	 * </div>
        	 * for new activity, the first step is call this function to push
        	 * the activity to stack, then it can be referenced by cle objects
        	 */
        	public void pushActivity(StarObjectClass self,StarObjectClass activity){
               	StarObjectClass activityclass = Service._GetObject("ActivityClass");
               	Stack<StarObjectClass> stack;
               	stack = (Stack<StarObjectClass>)activityclass._Get("ActivityStack");
               	stack.push(activity);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass popActivity(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * this method should be called before exit.
        	 */
        	public StarObjectClass popActivity(StarObjectClass self){
               	StarObjectClass activityclass = Service._GetObject("ActivityClass");
               	Stack<StarObjectClass> stack;
               	stack = (Stack<StarObjectClass>)activityclass._Get("ActivityStack");
               	return stack.pop();
        	}         	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass getCurrent(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * get current activity object
        	 */
        	public StarObjectClass getCurrent(StarObjectClass self){
               	StarObjectClass activityclass = Service._GetObject("ActivityClass");
               	Stack<StarObjectClass> stack;
               	stack = (Stack<StarObjectClass>)activityclass._Get("ActivityStack");
               	return stack.lastElement();
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setResource(StarObjectClass self,String ResourceName,int ResourceID)</td></tr>
        	 *   </table>
        	 * </div>
        	 * expose resources defined in project to other languages
        	 * 
        	 * @param self   Set by CLE automatically 
        	 * @param ResourceName like "R.drawable.ic_launcher"
        	 * @param ResourceID id of android resources      	 
        	 */
        	public void setResource(StarObjectClass self,String ResourceName,int ResourceID){
        		Hashtable<String,Integer> ResourceTale;
        		
        		ResourceTale = (Hashtable<String,Integer>)self._Get("ResourceTable");
        		ResourceTale.put(ResourceName,ResourceID);
        	}          	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int getResource(StarObjectClass self,String ResourceName)</td></tr>
        	 *   </table>
        	 * </div>
        	 * get resource id from resource name
        	 * 
        	 * @param self   Set by CLE automatically 
        	 * @param ResourceName : 1. name used in  setResource, 2: name such as : "drawable/girl"  or "android:drawable/progress_horizontal", please refer to  getIdentifier function
        	 * @param ResourceName : "android:layout/simple_spinner_dropdown_item","android:attr/progressBarStyleHorizontal",etc
        	 * @return        	 
        	 */
        	public int getResource(StarObjectClass self,String ResourceName){
        		Hashtable<String,Integer> ResourceTale;
        		        		
        		ResourceTale = (Hashtable<String,Integer>)self._Get("ResourceTable");
        		Integer res = ResourceTale.get(ResourceName);
        		if( res != null )
        			return (int)res;
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return 0;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		Resources resources = android_activity.getResources();
        		int intres;
        		if( ResourceName.indexOf(':') == -1 )
        			intres = resources.getIdentifier(android_activity.getPackageName()+":"+ResourceName, null, null);
        		else
        			intres = resources.getIdentifier(ResourceName, null, null);
        		if( intres == 0 )
        			SrvGroup._Print("resources ["+ResourceName+"] not found");
        		return (int)intres;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass getAssetFileDescriptor(StarObjectClass self,String path)</td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public StarObjectClass getAssetFileDescriptor(StarObjectClass self,String path){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return null;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		try{
        		    AssetFileDescriptor afd = android_activity.getAssets().openFd(path);
        		    StarObjectClass assetfiledescriptor = Service._GetObject("AssetFileDescriptorClass")._New();
        		    StarCLEAssetFileDescriptor android_assetfiledescriptor = (StarCLEAssetFileDescriptor)WrapAndroidClass.GetAndroidObject(assetfiledescriptor,"AndroidObject");
        		    android_assetfiledescriptor.assetfiledescriptor = afd;
        		    return assetfiledescriptor;
        		}catch(IOException e){
        			SrvGroup._Print(e.toString());
        			return null;
        		}
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public String getWifiMacAddress(StarObjectClass self)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public String getWifiMacAddress(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return null;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
                WifiManager wifi = (WifiManager) android_activity.getSystemService(android_activity.WIFI_SERVICE);   
                WifiInfo info = wifi.getConnectionInfo();   
                return info.getMacAddress();  
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public String getLocalIpAddress(StarObjectClass self)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public String getLocalIpAddress(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return null;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
                try {   
                    for (Enumeration<NetworkInterface> en = NetworkInterface   
                            .getNetworkInterfaces(); en.hasMoreElements();) {   
                        NetworkInterface intf = en.nextElement();   
                        for (Enumeration<InetAddress> enumIpAddr = intf   
                                .getInetAddresses(); enumIpAddr.hasMoreElements();) {   
                            InetAddress inetAddress = enumIpAddr.nextElement();   
                            if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address) ) {   
                                return inetAddress.getHostAddress().toString();   
                            }   
                        }   
                    }   
                } catch (SocketException ex) {   
                    SrvGroup._Print(ex.toString());   
                }   
                return null;    
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean openWifi(StarObjectClass self)</td></tr>
        	 *   </table>
        	 * </div>     	
        	 * @note <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />   
        	 */
        	public boolean openWifi(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return false;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		try{
        			WifiManager wm = (WifiManager) android_activity.getSystemService(android_activity.WIFI_SERVICE);
        			if(wm == null )
        				return false;
        			if( !wm.isWifiEnabled()){  
        				wm.setWifiEnabled(true);
        				opened = true;
        			}
        			if(mWifiLock==null){
        				mWifiLock = wm.createWifiLock(3,"wrapandroid"); //WifiManager.WIFI_MODE_FULL 
        				mWifiLock.setReferenceCounted(true);
        			}
        			if(!mWifiLock.isHeld())mWifiLock.acquire();
        			
        			return true;
        		}catch(Exception e){
        			SrvGroup._Print("<uses-permission android:name=\"android.permission.ACCESS_WIFI_STATE\" /> should be set");
        			return false;
        		}
        	}     
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void closeWifi(StarObjectClass self)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public void closeWifi(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
                if(mWifiLock != null && mWifiLock.isHeld()){mWifiLock.release(); mWifiLock = null;}
                if(opened){
                    WifiManager wm = (WifiManager) android_activity.getSystemService(android_activity.WIFI_SERVICE);
                    if(wm == null )
                    	return;
                    if(wm != null)wm.setWifiEnabled(false);
                    opened = false;
                }
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  keepScreenOn(StarObjectClass self,boolean flag)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */        	
        	public void  keepScreenOn(StarObjectClass self,boolean flag){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		if( flag == true )
        			android_activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        		else
        			android_activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        	}        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  startActivity(StarObjectClass self,StarObjectClass intent)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */        	
        	public void  startActivity(StarObjectClass self,StarObjectClass intent){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"); 
        		Intent android_intent = (Intent)WrapAndroidClass.GetAndroidObject(intent,"AndroidObject");
        		try{
        		    android_activity.startActivity(android_intent);
        		}
        		catch(Exception e){
        			SrvGroup._Print(e.toString());
        		}
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  requestWindowFeature(StarObjectClass self,int featureId)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */          	
        	public boolean  requestWindowFeature(StarObjectClass self,int featureId){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return false;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		return android_activity.requestWindowFeature(featureId);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setDefaultKeyMode(StarObjectClass self,int mode)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public void  setDefaultKeyMode(StarObjectClass self,int mode){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		android_activity.setDefaultKeyMode(mode);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getHeight(StarObjectClass self)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public int  getHeight(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return 0;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
                WindowManager manage=android_activity.getWindowManager();
                Display display=manage.getDefaultDisplay();        		
        		return display.getHeight();
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getWidth(StarObjectClass self)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public int  getWidth(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return 0;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
                WindowManager manage=android_activity.getWindowManager();
                Display display=manage.getDefaultDisplay();        		
        		return display.getWidth();
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  runScript(StarObjectClass self,String scriptInterface,String script)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public boolean  runScript(StarObjectClass self,String scriptInterface,String script){
                Object[] Result = (Object[])Service._RunScript(scriptInterface,script,"cmd","");
                if( (Boolean)Result[0] != true ){
                	SrvGroup._PrintError(1, (String)Result[1]);
                	return false;
                }
                return true;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  DoFile(StarObjectClass self,String scriptInterface,String path)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public boolean  DoFile(StarObjectClass self,String scriptInterface,String path){
                Object[] Result = (Object[])Service._DoFile(scriptInterface,path,"");
                if( (Boolean)Result[0] != true ){
                	SrvGroup._PrintError(1, (String)Result[1]);
                	return false;
                }
                return true;
        	}         	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  DoAssetsFile(StarObjectClass self,String scriptInterface,String path)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public boolean  DoAssetsFile(StarObjectClass self,String scriptInterface,String path){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return false;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
                try{
                	String scriptbuf;
                	
            		AssetManager assetmanager = android_activity.getAssets();                	
        	       	InputStream dataSource = assetmanager.open(path);
        	       	int size=dataSource.available();
        	       	byte[] buffer=new byte[size]; 
        	       	dataSource.read(buffer); 
        	       	dataSource.close();        
        	       	scriptbuf=new String(buffer);
                    Object[] Result = (Object[])Service._RunScript(scriptInterface,scriptbuf,"cmd","");
                    if( (Boolean)Result[0] != true ){
                    	SrvGroup._PrintError(1, (String)Result[1]);
                    	return false;
                    }
                    return true;
                }
        	    catch(IOException e ){
        	    	SrvGroup._PrintError(1, e.toString());
        	    	return false;
        	    }  
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setTitle(StarObjectClass self,String title)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public void setTitle(StarObjectClass self,String title){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
        		android_activity.setTitle(title);
        		return;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setTitleColor(StarObjectClass self,int textColor)</td></tr>
        	 *   </table>
        	 * </div>     	 
        	 */
        	public void setTitleColor(StarObjectClass self,int textColor){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
        		android_activity.setTitleColor(textColor);
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  onTouchEvent(StarObjectClass self,StarObjectClass event)</td></tr>
        	 *   </table>
        	 * </div>  
        	 * @note this function can be override   	 
        	 */
        	public boolean  onTouchEvent(StarObjectClass self,StarObjectClass event){
        		return false;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass getTransitionDrawable(StarObjectClass self,int resid)</td></tr>
        	 *   </table>
        	 * </div>     
        	 * @note getTransitionDrawable from resources. 	 
        	 */
        	public StarObjectClass getTransitionDrawable(StarObjectClass self,int resid){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return null;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
        		TransitionDrawable transition = (TransitionDrawable)android_activity.getResources().getDrawable(resid);
        		if( transition == null )
        			return null;
        		StarObjectClass transitiondrawable = Service._GetObject("TransitionDrawableClass")._New();
        		BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		androidinterface.SetAndroidObject(transition);
        		return transitiondrawable;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass getBitmapDrawable(StarObjectClass self,int resid)</td></tr>
        	 *   </table>
        	 * </div>     
        	 * @note getTransitionDrawable from resources. 	 
        	 */
        	public StarObjectClass getBitmapDrawable(StarObjectClass self,int resid){
        		StarObjectClass activity = (StarObjectClass)self._Call("getCurrent");
        		if( activity == null )
        			return null;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");        		
        		BitmapDrawable transition = (BitmapDrawable)android_activity.getResources().getDrawable(resid);
        		if( transition == null )
        			return null;
        		StarObjectClass transitiondrawable = Service._GetObject("TransitionDrawableClass")._New();
        		BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		androidinterface.SetAndroidObject(transition);
        		return transitiondrawable;
        	}        	
        });
        
		return true;
	}	
}