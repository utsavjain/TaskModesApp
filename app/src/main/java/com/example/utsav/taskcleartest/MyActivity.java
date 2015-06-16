package com.example.utsav.taskcleartest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MyActivity extends ActionBarActivity {
    Button b1, b2, b3;

    public void makeUI() {
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll);
        b1 = new Button(this);
        b2 = new Button(this);
        b3 = new Button(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity2.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity3.class);
                startActivity(i);


            }
        });
        b1.setText("Main Act ");
        b2.setText(" Act 2 ");
        b3.setText(" Act 3 ");
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayout.addView(b1, params);
        linearLayout.addView(b2, params);
        linearLayout.addView(b3, params);
        //addContentView(b1, params);
        //addContentView(b2,params);
        //addContentView(b3,params);
    }
}
