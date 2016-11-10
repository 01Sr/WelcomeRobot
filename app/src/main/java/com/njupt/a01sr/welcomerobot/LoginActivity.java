package com.njupt.a01sr.welcomerobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etAccount;
    private EditText etPasswd;
    private CheckBox cbRemeberPasswd;
    private Button btnCancel;
    private Button btnOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etAccount= (EditText) findViewById(R.id.et_account);
        etPasswd = (EditText) findViewById(R.id.et_passwd);
        cbRemeberPasswd= (CheckBox) findViewById(R.id.cb_remeber_passwd);
        btnCancel= (Button) findViewById(R.id.btn_cancel);
        btnOk= (Button) findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ok:
                startActivity(new Intent(this,MainActivity.class));
                break;
            default:
        }
    }
}
