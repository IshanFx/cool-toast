package com.ishanfernando.cooltoastlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ishanfernando.cooltoast.CoolToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //CoolToast.builder(this).message("This is the toast message").show();
    }

    public void showToast(View view) {
        if(view.getTag().equals("success")){
            CoolToast.success(this,"This is the toast message");
        }

        if(view.getTag().equals("warning")){
            CoolToast.warning(this,"This is the toast message");
        }
        if(view.getTag().equals("error")){
            CoolToast.error(this,"This is the toast message");
        }
        if(view.getTag().equals("info")){
            CoolToast.info(this,"This is the toast message");
        }
    }
}
