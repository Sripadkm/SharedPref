package com.example.sripad.sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button,move;
    EditText Name,Mobile,pass,email;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Name=findViewById(R.id.name);
        Mobile=findViewById(R.id.mobile);
        pass=findViewById(R.id.pass);
        email=findViewById(R.id.email);
        */

        Name=findViewById(R.id.name);
        Mobile=findViewById(R.id.mobile);
        pass=findViewById(R.id.pass);
        email=findViewById(R.id.email);

        button=findViewById(R.id.save);
        move=findViewById(R.id.move);
        preferences=
                getSharedPreferences
                        ("Basic",MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor=preferences.edit();
                editor.putString("UserName",Name.getText().toString());
                editor.putString("UserMobile",Mobile.getText().toString());
                editor.putString("Userpass",pass.getText().toString());
                editor.putString("Usermail",email.getText().toString());
                editor.commit();




            }
        });
        String s1=preferences.getString("Place",null);
        TextView textView=findViewById(R.id.place);
        textView.setText(s1);

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,
                        Next.class);
                startActivity(intent);
            }
        });
    }
}
