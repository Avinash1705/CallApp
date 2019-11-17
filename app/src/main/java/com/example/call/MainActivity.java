package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mobile;
    TextView adm;
    CheckBox chk;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk=(CheckBox)findViewById(R.id.checkBox);
        mobile=(EditText)findViewById(R.id.editText);
        adm=(TextView)findViewById(R.id.textView);
        reg=findViewById(R.id.reg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Navbar.class);
                startActivity(intent);
            }
        });

        adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AdminLogin.class);
                startActivity(intent);
            }
        });

    }
}

