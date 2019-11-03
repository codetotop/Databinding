package com.example.mvvmexample;

import android.app.Application;
import android.content.Context;

import com.example.mvvmexample.Webservice.PeopleService;
import com.example.mvvmexample.Webservice.ServiceFactory;

import rx.Scheduler;
import rx.schedulers.Schedulers;

public class MvvmApp extends Application {
  private PeopleService mPeopleService;
  private Scheduler mScheduler;

  @Override
  public void onCreate() {
    super.onCreate();

  }

  public static MvvmApp get(Context context) {
    return (MvvmApp) context.getApplicationContext();
  }

  public static MvvmApp create(Context context) {
    return MvvmApp.get(context);
  }

  public PeopleService getPeopleService() {
    if (mPeopleService == null) mPeopleService = ServiceFactory.create();
    return mPeopleService;

  }

  public void setPeopleService(PeopleService peopleService) {
    mPeopleService = peopleService;
  }

  public Scheduler subscribleScheduler() {
    if (mScheduler == null) mScheduler = Schedulers.io();
    return mScheduler;
  }

  public void setScheduler(Scheduler scheduler) {
    mScheduler = scheduler;
  }
}
