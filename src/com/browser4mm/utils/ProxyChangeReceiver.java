package com.browser4mm.utils;

import com.browser4mm.ui.activities.MainActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ProxyChangeReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent) 
    {
    	Log.d("ProxyChangeReceiver", "Proxy change receiver called: " + intent.toString());
    	
    	if (MainActivity.INSTANCE != null)
    	{
    		Log.d("ProxyChangeReceiver", "Refresh system preferences");
    		MainActivity.INSTANCE.applyPreferences();
    	}
    }
}
