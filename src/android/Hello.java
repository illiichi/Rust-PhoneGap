package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.example.hellojni.HelloJni;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {
            String name = data.getString(0);
            String jni = HelloJni.stringFromJNI();
            String message = "Hello, " + name + ", " jni;
            callbackContext.success(message);

            return true;
        } else {
            return false;
        }
    }
}
