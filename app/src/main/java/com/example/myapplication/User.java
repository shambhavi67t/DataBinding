package com.example.myapplication;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
  String name;
  int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }
@Bindable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    notifyPropertyChanged(BR.name);
  }
@Bindable
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
    notifyPropertyChanged(BR.age);
  }
}
