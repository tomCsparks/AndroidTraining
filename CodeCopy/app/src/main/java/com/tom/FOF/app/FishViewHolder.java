package com.tom.FOF.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tom.FOF.R;

public class FishViewHolder extends RecyclerView.ViewHolder {

    ImageView fishImage;
    TextView title,description;

    public FishViewHolder(View itemView) {
        super(itemView);
        title =itemView.findViewById(R.id.fish_name);
        fishImage = itemView.findViewById(R.id.fish_image);




    }
    public void onBind(Fish fish)
    {
        title.setText(fish.fishName);
        fishImage.setImageResource(fish.fishimage);

    }
}
