package com.example.swjtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    AutoCompleteTextView email_input;
    EditText password_input;
    String str_email;
    String str_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email_input = (AutoCompleteTextView)findViewById(R.id.email);
        password_input = (EditText)findViewById(R.id.password);

    }

    public void signing_in(View view){
        str_email = email_input.getText().toString();
        str_password = password_input.getText().toString();
        if (TextUtils.isEmpty(str_email)){
            email_input.setError("邮箱不能为空");
        }
        else if(!isEmailValid(str_email)){
            email_input.setError("邮箱无效");
        }else if(!isPasswordValid(str_password)){
            password_input.setError("密码长度需大于4位");
        }else
        {
            Toast.makeText(this,"登录成功！",Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

}
