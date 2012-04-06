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
import android.graphics.Matrix;

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

public class MatrixClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init MatrixClass");

        /* MatrixClass Body */
        Service._GetObject("MatrixClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEMatrix matrix = new StarCLEMatrix((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)matrix);
        		return;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  invert(StarObjectClass self,StarObjectClass inverse) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  invert(StarObjectClass self,StarObjectClass inverse){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLEMatrix inversematrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(inverse,"AndroidObject");
        		if( matrix == null || inversematrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).invert(((Matrix)inversematrix.GetAndroidObject()));
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  isIdentity(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  isIdentity(StarObjectClass self){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).isIdentity();
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  postConcat(StarObjectClass self,StarObjectClass other) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postConcat(StarObjectClass self,StarObjectClass other){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLEMatrix othermatrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(other,"AndroidObject");
        		if( matrix == null || othermatrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postConcat(((Matrix)othermatrix.GetAndroidObject()));
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  postRotate(StarObjectClass self,float degrees) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postRotate(StarObjectClass self,float degrees){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postRotate(degrees);
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  postRotate1(StarObjectClass self,float degrees, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postRotate1(StarObjectClass self,float degrees, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postRotate(degrees,px,py);
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  postScale(StarObjectClass self,float sx, float sy) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postScale(StarObjectClass self,float sx, float sy){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postScale(sx,sy);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">boolean  postScale1(StarObjectClass self,float sx, float sy, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postScale1(StarObjectClass self,float sx, float sy, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postScale(sx,sy,px,py);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  postSkew(StarObjectClass self,float kx, float ky) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postSkew(StarObjectClass self,float kx, float ky){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postSkew(kx,ky);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  postSkew1(StarObjectClass self,float kx, float ky, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postSkew1(StarObjectClass self,float kx, float ky, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postSkew(kx,ky,px,py);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  postTranslate(StarObjectClass self,float dx, float dy) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  postTranslate(StarObjectClass self,float dx, float dy){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).postTranslate(dx,dy);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preConcat(StarObjectClass self,Matrix other) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preConcat(StarObjectClass self,StarObjectClass other){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLEMatrix othermatrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(other,"AndroidObject");
        		if( matrix == null || othermatrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preConcat(((Matrix)othermatrix.GetAndroidObject()));
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preRotate(StarObjectClass self,float degrees) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preRotate(StarObjectClass self,float degrees){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preRotate(degrees);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preRotate1(StarObjectClass self,float degrees, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preRotate1(StarObjectClass self,float degrees, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preRotate(degrees,px,py);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preScale(StarObjectClass self,float sx, float sy) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preScale(StarObjectClass self,float sx, float sy){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preScale(sx,sy);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preScale1(StarObjectClass self,float sx, float sy, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preScale1(StarObjectClass self,float sx, float sy, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preScale(sx,sy,px,py);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preSkew(StarObjectClass self,float kx, float ky) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preSkew(StarObjectClass self,float kx, float ky){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preSkew(kx,ky);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preSkew1(StarObjectClass self,float kx, float ky, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preSkew1(StarObjectClass self,float kx, float ky, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preSkew(kx,ky,px,py);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  preTranslate(StarObjectClass self,float dx, float dy) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public boolean  preTranslate(StarObjectClass self,float dx, float dy){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return false;
        		return ((Matrix)matrix.GetAndroidObject()).preTranslate(dx,dy);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  reset(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  reset(StarObjectClass self){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).reset();
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  set(StarObjectClass self,StarObjectClass src) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  set(StarObjectClass self,StarObjectClass src){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLEMatrix srcmatrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(src,"AndroidObject");
        		if( matrix == null || src == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).set(((Matrix)srcmatrix.GetAndroidObject()));
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setRotate(StarObjectClass self,float degrees) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setRotate(StarObjectClass self,float degrees){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setRotate(degrees);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setRotate1(StarObjectClass self,float degrees, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setRotate1(StarObjectClass self,float degrees, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setRotate(degrees,px,py);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setScale1(StarObjectClass self,float sx, float sy, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setScale1(StarObjectClass self,float sx, float sy, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setScale(sx,sy,px,py);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setScale(StarObjectClass self,float sx, float sy) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setScale(StarObjectClass self,float sx, float sy){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setScale(sx,sy);
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setSinCos(StarObjectClass self,float sinValue, float cosValue) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setSinCos(StarObjectClass self,float sinValue, float cosValue){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setSinCos(sinValue,cosValue);
        	}     
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setSinCos1(StarObjectClass self,float sinValue, float cosValue, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setSinCos1(StarObjectClass self,float sinValue, float cosValue, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setSinCos(sinValue,cosValue,px,py);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setSkew1(StarObjectClass self,float kx, float ky, float px, float py) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setSkew1(StarObjectClass self,float kx, float ky, float px, float py){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setSkew(kx,ky,px,py);
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setSkew(StarObjectClass self,float kx, float ky) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setSkew(StarObjectClass self,float kx, float ky){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setSkew(kx,ky);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setTranslate(StarObjectClass self,float dx, float dy) </td></tr>
        	 *   </table>
        	 * </div>
        	 */    
        	public void  setTranslate(StarObjectClass self,float dx, float dy){
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( matrix == null )
        			return;
        		((Matrix)matrix.GetAndroidObject()).setTranslate(dx,dy);
        	} 
        	
        });    
        
		return true;
	}	
}