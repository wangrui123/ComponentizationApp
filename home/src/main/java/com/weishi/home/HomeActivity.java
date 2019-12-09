package com.weishi.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 
 * @Author wangrui
 * @Date 2019/12/9 0009 17:04
 * @Description
 * 
 */
@Route(path = "/home/HomeActivity")
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
