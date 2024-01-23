package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.Domains.Hourly;
import com.example.myapplication.R;

import java.util.ArrayList;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewHolder> {
    ArrayList<Hourly> items;
    Context context;

    public HourlyAdapters(ArrayList<Hourly> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HourlyAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly,parent,false);
        context=parent.getContext();
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
//        holder.hourTxt.setText(items.get(position).getHour());
//        holder.hourTxt.setText(items.get(position).getTemp()+"");
        holder.temp.setText(items.get(position).getTemp());
        holder.tempTxt.setText(items.get(position).getTempTxt()+"°");
//        holder.pic.setImageResource(R.drawable.snowy);

        int drawableResoureId=holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context).load(drawableResoureId).into(holder.pic);



//        Glide.with(context)
//                .load()
//                .into(holder.pic);

    }





    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView temp, tempTxt;
        ImageView pic;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            temp = itemView.findViewById(R.id.hourTxt);
            tempTxt=itemView.findViewById(R.id.tempTxt);
            pic= itemView.findViewById(R.id.pic);
        }
    }
}

