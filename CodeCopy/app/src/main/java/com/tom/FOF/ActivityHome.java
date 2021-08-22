package com.tom.FOF;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHome extends AppCompatActivity


{
    public ActivityHome(){}

    TextView linkTextView;

    @Override
    //seapagebutton
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        linkTextView = findViewById(R.id.txtbox_hyperlinkDisplay);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        ImageButton imageButtonSea,imageButtonCoarse;

        imageButtonCoarse= findViewById(R.id.imageButtonCoarse);
        imageButtonCoarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent=new Intent(getApplicationContext(), ActivityCoarseStartPage.class);
                startActivity(newIntent);
            }
        });
        imageButtonSea=findViewById(R.id.imageButtonSea);
        imageButtonSea.setOnClickListener(   new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent newIntent=new Intent(getApplicationContext(), ActivitySeaStartPage.class);
                startActivity(newIntent);
            }
        });



}}

