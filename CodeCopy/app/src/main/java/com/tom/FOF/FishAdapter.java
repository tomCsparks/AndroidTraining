package com.tom.FOF;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.tom.FOF.app.Fish;
import com.tom.FOF.app.FishViewHolder;

import java.util.List;

public class FishAdapter extends RecyclerView.Adapter<FishViewHolder> {

private List<Fish> fishNames;
    OnRecyclerViewClickListener onReceiveContentListener;


    public void setOnReceiveContentListener(OnRecyclerViewClickListener onReceiveContentListener) {
        this.onReceiveContentListener = onReceiveContentListener;
    }

    public  FishAdapter(List<Fish>fishes){
       this.fishNames=fishes;
   }

    @Override
    public FishViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fish,parent,false);

        return new FishViewHolder(view);
    }

    @Override
    public void onBindViewHolder( FishViewHolder holder, int position) {
       Fish fish = fishNames.get(position);
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(onReceiveContentListener!=null)
               {
                   onReceiveContentListener.onItemClickListener(position,fish);
               }
           }
       });
        holder.onBind(fish);


    }

    @Override
    public int getItemCount() {
        return fishNames.size();
    }
}
