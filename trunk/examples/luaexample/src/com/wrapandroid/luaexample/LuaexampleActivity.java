package com.wrapandroid.luaexample;

import android.os.Bundle;
import com.srplab.wrapandroid.*; 

public class LuaexampleActivity extends WrapAndroidActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	DumpInfoFlag = true;
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        //StarActivity._Call("DoAssetsFile", "lua", "code.lua");    /*first example*/
        //StarActivity._Call("DoAssetsFile", "lua", "code1.lua");     /*second example*/
        //StarActivity._Call("DoAssetsFile", "lua", "code2.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code3.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code4.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code5.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code6.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code7.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code8.lua");
        //StarActivity._Call("DoAssetsFile", "lua", "code9.lua");
        StarActivity._Call("DoAssetsFile", "lua", "code10.lua");
    }
}