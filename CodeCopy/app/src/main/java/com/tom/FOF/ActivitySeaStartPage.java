package com.tom.FOF;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActivitySeaStartPage<buttonSeaImagesView, SeaImagesView, imageButtonSpecies> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea_start_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton imageButtonSpecies;


  // activate imageButtonSpecies to open ActivityScrollSeaFish Images
 imageButtonSpecies = findViewById(R.id.imageButtonSpecies);
 imageButtonSpecies.setOnClickListener(new View.OnClickListener()    {
     @Override
     public void onClick(View v) {
        Intent newIntent = new Intent(getApplicationContext(), ActivityScrollSeaFishImages.class);
        startActivity(newIntent);
    }});
    }
//Menu Item return
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return true;
    }
}

