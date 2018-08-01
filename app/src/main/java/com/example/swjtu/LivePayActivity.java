package com.example.swjtu;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class LivePayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_pay);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button btn_ele_top_up = (Button)findViewById(R.id.btn_ele_top_up);
        Button btn_water_top_up = (Button)findViewById(R.id.btn_water_top_up);
        Button btn_card_top_up = (Button)findViewById(R.id.btn_card_top_up);

        btn_ele_top_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LivePayActivity.this,ELePayActivity.class);
                startActivity(intent);
            }
        });

        btn_water_top_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LivePayActivity.this,WaterPayActivity.class);
                startActivity(intent);
            }
        });

        btn_card_top_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LivePayActivity.this,CardPayActivity.class);
                startActivity(intent);
            }
        });


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
}
