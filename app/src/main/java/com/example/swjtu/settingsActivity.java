package com.example.swjtu;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class settingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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

    public void data_usage(View view){
        Toast.makeText(this,"当前使用流量：20KB！",Toast.LENGTH_SHORT).show();
    }

    public void clear_cache(View view){
        Toast.makeText(this,"清理成功！",Toast.LENGTH_SHORT).show();
    }

    public void change_font(View view){
        Toast.makeText(this,"功能正在开发！",Toast.LENGTH_SHORT).show();
    }

    public void auxiliary_functions(View view){
        Toast.makeText(this,"功能正在开发！",Toast.LENGTH_SHORT).show();
    }

    public void change_account(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    public void exit_app(View view){
        System.exit(0);
    }
}
