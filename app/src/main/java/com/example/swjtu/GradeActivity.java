package com.example.swjtu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个返回按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Button btn_grade_query = (Button)findViewById(R.id.btn_grade_query);

        btn_grade_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GradeActivity.this,"你该科的成绩为 100 分！",Toast.LENGTH_SHORT).show();
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
