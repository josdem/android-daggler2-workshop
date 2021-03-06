package com.jos.dem.dagger;

import android.app.Application;
import android.content.Context;

import com.jos.dem.dagger.component.ApplicationComponent;
import com.jos.dem.dagger.component.DaggerApplicationComponent;
import com.jos.dem.dagger.module.ApplicationModule;

public class DemoApplication extends Application {

  protected ApplicationComponent applicationComponent;

  public static DemoApplication get(Context context) {
    return (DemoApplication) context.getApplicationContext();
  }

  @Override
  public void onCreate() {
    super.onCreate();
    applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(new ApplicationModule(this))
            .build();
    applicationComponent.inject(this);
  }

  public ApplicationComponent getComponent(){
    return applicationComponent;
  }

}
