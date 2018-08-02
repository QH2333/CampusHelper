package com.example.swjtu;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                this.finish();
                break;
            default:
                break;
        }
        return true;
    }

    public void get_help(View view){
        Intent intent = new Intent(this,helpActivity.class);
        startActivity(intent);
    }

    public void send_feedback(View view){
        Intent intent = new Intent(this,feedbackActivity.class);
        startActivity(intent);
    }

    public void check_update(View view){
        Intent intent = new Intent(this,updateActivity.class);
        startActivity(intent);
    }

    public void about_us(View view){
        Intent intent = new Intent(this,about_usActivity.class);
        startActivity(intent);
    }
}
