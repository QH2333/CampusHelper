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

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button btn_lesson_query2 = (Button)findViewById(R.id.btn_lesson_query2);

        btn_lesson_query2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LessonActivity.this,"该课程上课时间为：周一第一讲！",Toast.LENGTH_SHORT).show();
            }
        });

        String[] strGrade = new String[]{"请选择年级", "大一", "大二", "大三", "大四"};
        ArrayAdapter<String> Gradeadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strGrade);  //创建一个数组适配器
        Gradeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式

        Spinner Gradespinner = super.findViewById(R.id.spnerGrade);
        Gradespinner.setAdapter(Gradeadapter);

        String[] strSchool = new String[]{"请选择学院", "信息科学与技术学院", "建筑与设计学院", "交通运输与物流管理学院", "其他"};
        ArrayAdapter<String> Schooladapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strSchool);  //创建一个数组适配器
        Schooladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     //设置下拉列表框的下拉选项样式

        Spinner Schoolspinner = super.findViewById(R.id.spnerSchool);
        Schoolspinner.setAdapter(Schooladapter);
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
