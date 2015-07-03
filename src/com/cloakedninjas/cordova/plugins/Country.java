package com.cloakedninjas.cordova.plugins;

import java.util.Locale;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

import android.content.Context;

public class Country extends CordovaPlugin {

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("get")) {
            String result = Locale.getDefault().getCountry();
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, result));
            return true;
        }
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
        return false;
    }
}
