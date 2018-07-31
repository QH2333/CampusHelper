package com.example.swjtu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ELePayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ele_pay);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        String[] strBuilding = new String[]{"请选择楼栋", "天佑斋19栋", "天佑斋20栋", "其他"};
        ArrayAdapter<String> Buidingadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strBuilding);  //创建一个数组适配器
        Buidingadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式

        Spinner Buildingspinner = super.findViewById(R.id.spnerBuilding);
        Buildingspinner.setAdapter(Buidingadapter);

        String[] strDorm = new String[]{"请选择寝室号", "4050", "4060", "4070", "其他"};
        ArrayAdapter<String> Dormadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strDorm);  //创建一个数组适配器
        Dormadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式

        Spinner Dormspinner = super.findViewById(R.id.spnerDorm);
        Dormspinner.setAdapter(Dormadapter);
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
