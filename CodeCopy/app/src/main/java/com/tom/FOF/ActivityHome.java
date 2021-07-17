package com.tom.FOF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHome extends AppCompatActivity
{
    public ActivityHome() {
    }
    @Override
    //seapagebutton
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        ImageButton imageButtonSea,tom;
        tom= findViewById(R.id.imageButtonCoarse);
        tom.setOnClickListener(new View.OnClickListener() {
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

