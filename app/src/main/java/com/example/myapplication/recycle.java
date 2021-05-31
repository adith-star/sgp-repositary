package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recycle extends RecyclerView.Adapter<recycle.ViewHolder> {
    private List<datacl> list;
    recycle(List<datacl> mylist){
        list = mylist;
    }
    @NonNull
    @Override
    public recycle.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent, false);
        return new ViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull recycle.ViewHolder holder, int position) {
        datacl data = list.get(position);
        holder.namee.setText(data.name);
        holder.you.setBackgroundResource(data.imgnme);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView namee;
        ImageView you;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namee = itemView.findViewById(R.id.namee);
            you = itemView.findViewById(R.id.you);

        }
    }
}
