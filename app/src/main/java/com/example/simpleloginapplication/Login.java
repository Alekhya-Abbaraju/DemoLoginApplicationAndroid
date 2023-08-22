package com.example.simpleloginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class Login extends AppCompatActivity {
    EditText et_username, et_password;
    Button btn_login;
 private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login();
    }
    void Login(){
        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        btn_login = (Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_username.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")){
                    Toast.makeText(Login.this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this,User.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}