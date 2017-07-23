package com.jos.dem.daggler.component;

import android.app.Application;
import android.content.Context;

import com.jos.dem.daggler.ApplicationContext;
import com.jos.dem.daggler.DemoApplication;
import com.jos.dem.daggler.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  void inject(DemoApplication daggerApplication);

  @ApplicationContext
  Context getContext();

  Application getApplication();

}