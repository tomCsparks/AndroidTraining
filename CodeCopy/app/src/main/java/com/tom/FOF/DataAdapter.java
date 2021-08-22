package com.tom.FOF;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataHolder> {



    String[] fisheNames = new String[]{"One","Two","Three","Four","One","Two","Three","Four","One","Two","Three","Four","One","Two","Three","Four","One","Two","Three","Four",};

    @Override
    public DataHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdata,parent,false);

        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder( DataHolder holder, int position) {
        holder.onBind(fisheNames[position]);


    }

    @Override
    public int getItemCount() {
        return fisheNames.length;
    }
}
