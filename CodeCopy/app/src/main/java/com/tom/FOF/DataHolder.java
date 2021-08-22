package com.tom.FOF;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DataHolder  extends RecyclerView.ViewHolder {

    TextView title;
    public DataHolder( View itemView) {
        super(itemView);
        title =itemView.findViewById(R.id.textView);



    }
    void onBind(String name)
    {
        title.setText(name);
    }
}
