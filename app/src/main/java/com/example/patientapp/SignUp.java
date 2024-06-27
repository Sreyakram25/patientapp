package com.example.patientapp;

import static com.example.patientapp.R.id.cpass;
import static com.example.patientapp.R.id.passw;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    AppCompatButton b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ed1=(EditText)findViewById(R.id.patname);
        ed2=(EditText)findViewById(R.id.ageno);
        ed3=(EditText)findViewById(R.id.hname);
        ed4=(EditText)findViewById(R.id.pcode);
        ed5=(EditText)findViewById(R.id.mobno);
        ed6=(EditText)findViewById(R.id.uname);
        ed7=(EditText)findViewById(R.id.passw);
        ed8=(EditText) findViewById(R.id.cpass);

        b1=(AppCompatButton) findViewById(R.id.regbtn);
        b2=(AppCompatButton) findViewById(R.id.loginbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPatientName=ed1.getText().toString();
                String getAge=ed2.getText().toString();
                String getHouseName=ed3.getText().toString();
                String getPinCode=ed4.getText().toString();
                String getMobNo=ed5.getText().toString();
                String getUserName=ed6.getText().toString();
                String getPassWord=ed7.getText().toString();
                String getConfirmPass=ed8.getText().toString();
                Toast.makeText(getApplicationContext(), getPatientName+" "+getAge+" "+getHouseName+" "+getPinCode+" "+getMobNo+" "+getUserName+" "+getPassWord+" "+getConfirmPass, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(p);
            }
        });
    }
}