package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements DataBindingInterface{
ActivityMainBinding activityMainBinding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  //  setContentView(R.layout.activity_main);

//     different ways to inflate
//
   activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//
//   2) activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
//    setContentView(activityMainBinding.getRoot());
//
//   3) activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater(),viewgroup,false);
//
    activityMainBinding.setVariable(BR.name,"Shambhavi");
    activityMainBinding.executePendingBindings();
  }

  @Override
  public void print1(String name) {
    Toast.makeText(this,"make Toast",Toast.LENGTH_LONG).show();
    Log.d("data binding","shambhavi");
    activityMainBinding.button.setText("shambhavi");

  }
}
