
package com.reactlibrary;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNOmronConnectModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNOmronConnectModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNOmronConnect";
  }

  @ReactMethod
  public void sayHello(String name, Callback callBack) {
    Log.d("RNOmronConnectModule", "sayHello with name: " + name);
    String result = "ok";

    callBack.invoke(result);
  }
}