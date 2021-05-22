package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityDataBinding1Binding;
import com.example.myapplication.viewmodels.MainViewModel;

import java.security.Provider;

public class DataBinding1 extends AppCompatActivity {
 private MainViewModel mainViewModel;
 ActivityDataBinding1Binding activityDataBinding1Binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
   // setContentView(R.layout.activity_data_binding1);
    activityDataBinding1Binding= DataBindingUtil.setContentView(this,R.layout.activity_data_binding1);

    mainViewModel= ViewModelProviders.of(this).get(MainViewModel.class);

    // one way
    activityDataBinding1Binding.setUser(mainViewModel.getUser());

    //for included layout
//    activityDataBinding1Binding.includedLayout.age.setText("12");

    activityDataBinding1Binding.setMainviewModel(mainViewModel);


  }
}
