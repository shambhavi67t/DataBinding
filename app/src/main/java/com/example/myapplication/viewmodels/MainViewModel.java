package com.example.myapplication.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.myapplication.User;

public class MainViewModel extends AndroidViewModel {
  private User muser;

  //android view model is used to pass contex
  public MainViewModel(@NonNull Application application) {
    super(application);
    muser= new User("shambhavi",24);
  }
  public User getUser()
  {
    return this.muser;
  }
}
