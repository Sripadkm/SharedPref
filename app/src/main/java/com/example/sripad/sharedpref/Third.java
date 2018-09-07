package com.example.sripad.sharedpref;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

/*
        SharedPreferences preferences=
                getSharedPreferences
                        ("Basic",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();*/

        SharedPreferences preferences=
                getSharedPreferences
                        ("Basic",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("Place","Hyderbad");
        editor.commit();
        String s1=preferences.getString("UserName",null);
        String s2=preferences.getString("UserMobile",null);
        String s3=preferences.getString("Userpass",null);
        String s4=preferences.getString("Usermail",null);

        TextView t=findViewById(R.id.tv2);
        t.setText(""+s1+s2+s3+s4);
    }
}
