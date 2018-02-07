package com.example.hello.inserttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, pwd, name, phone;
    String str_email, str_pwd, str_name, str_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.et_email);
        pwd = (EditText)findViewById(R.id.et_pwd2);
        name = (EditText)findViewById(R.id.et_name);
        phone = (EditText)findViewById(R.id.et_phone);
    }

    public void onReg(View view){
        str_email = email.getText().toString();
        str_pwd = pwd.getText().toString();
        str_name = name.getText().toString();
        str_phone = phone.getText().toString();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_email, str_pwd, str_name, str_phone);
    }
}
