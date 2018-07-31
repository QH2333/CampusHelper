package com.example.swjtu;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class LivePayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_pay);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public void btnCardPay(View v1)
    {
        Intent CardPayintent=new Intent(this,CardPayActivity.class);
        startActivity(CardPayintent);
    }
    public void PayEle(View v2)
    {
        Intent PayEleintent=new Intent(this,ELePayActivity.class);
        startActivity(PayEleintent);
    }
    public void PayWater(View v3)
    {
        Intent PayWaterintent=new Intent(this,WaterPayActivity.class);
        startActivity(PayWaterintent);
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
