package com.example.swjtu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ELePayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ele_pay);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button btn_ele_pay = (Button)findViewById(R.id.btn_ele_pay);

        btn_ele_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ELePayActivity.this,"缴费成功！",Toast.LENGTH_SHORT).show();
            }
        });

        String[] strBuilding = new String[]{"请选择楼栋", "天佑斋19栋", "天佑斋20栋", "其他"};
        ArrayAdapter<String> adapter_building = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strBuilding);  //创建一个数组适配器
        adapter_building.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式

        Spinner spinner_building = super.findViewById(R.id.spinner_building);
        spinner_building.setAdapter(adapter_building);

        String[] strDorm = new String[]{"请选择寝室号", "4050", "4060", "4070", "其他"};
        ArrayAdapter<String> adapter_dorm = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strDorm);  //创建一个数组适配器
        adapter_dorm.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式

        Spinner spinner_dorm = super.findViewById(R.id.spinner_dorm);
        spinner_dorm.setAdapter(adapter_dorm);
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
