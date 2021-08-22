package com.tom.FOF;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FishDetailActivity extends AppCompatActivity {


    ImageView fishImage;
    TextView fishName;
    TextView description;
    TextView hyperlinkID;
    TextView linkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_detail);
        linkTextView= findViewById(R.id.testing_hyperlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        fishImage = findViewById(R.id.img_fish);
        fishName=findViewById(R.id.txt_fishname);
        hyperlinkID=findViewById(R.id.txtbox_hyperlinkDisplay);
        description =findViewById(R.id.txt_description);
        if(getIntent()!=null)
        {
            int imageId = getIntent().getIntExtra(FishListActivity.FISH_IMAGE,0);
            String  name= getIntent().getStringExtra("Name");
            String descriptionText = getIntent().getStringExtra("description");
            String hyperlink= getIntent().getStringExtra("hlink");


            fishName.setText(name);
            hyperlinkID.setText(Html.fromHtml(hyperlink));
            hyperlinkID.setMovementMethod(LinkMovementMethod.getInstance());
            hyperlinkID.setClickable(true);
            description.setText(descriptionText);
            description.setMovementMethod(new ScrollingMovementMethod());
            fishImage.setImageResource(imageId);
        }
    }
}
