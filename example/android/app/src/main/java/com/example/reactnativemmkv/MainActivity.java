package com.example.reactnativemmkv;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.reactnativemmkv.MmkvModule;

public class MainActivity extends ReactActivity implements ReactInstanceManager.ReactInstanceEventListener {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "MmkvExample";
  }

  @Override
  public void onReactContextInitialized(ReactContext context) {
    MmkvModule.install(context);
  }
}
