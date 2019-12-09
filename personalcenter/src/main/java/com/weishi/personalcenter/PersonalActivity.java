package com.weishi.personalcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 *
 * @Author wangrui
 * @Date 2019/12/9 0009 17:11
 * @Description
 *
 */
@Route(path = "/personal/PersonalActivity")
public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }
}
