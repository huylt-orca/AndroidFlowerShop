package com.example.androidflower.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidflower.R;
import com.example.androidflower.model.Flower;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {

    private List<Flower> flowerList;
    public FlowerAdapter(List<Flower> flowerList){
        this.flowerList = flowerList;
    }
    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_layout , parent , false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        holder.mImageview.setImageResource(flowerList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return flowerList.size();
    }

    public class FlowerViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageview;
        public FlowerViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageview = itemView.findViewById(R.id.imageView);
        }
    }

    public static class FlowerHomeApdater extends RecyclerView.Adapter<FlowerHomeApdater.FlowerHomeViewHolder> {

        private List<Flower> listFlower;
        private Context context;

        public FlowerHomeApdater(Context context, List<Flower> listFlower) {
            this.context = context;
            this.listFlower = listFlower;
        }

        @NonNull
        @Override
        public FlowerHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flower,parent,false);
            return new FlowerHomeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull FlowerHomeViewHolder holder, int position) {
            Flower flowerHome = listFlower.get(position);
            if (flowerHome == null){
                return;
            }
    //        holder.tvNameFlowerHome.setText(flowerHome.getName());
            holder.imgFlowerHome.setImageResource(flowerHome.getImage());
        }

        @Override
        public int getItemCount() {
            if (listFlower != null){
                return listFlower.size();
            }
            return 0;
        }

        public class FlowerHomeViewHolder extends RecyclerView.ViewHolder{
            private ImageView imgFlowerHome;
            private TextView tvNameFlowerHome;

            public FlowerHomeViewHolder(@NonNull View itemView) {
                super(itemView);
                imgFlowerHome = itemView.findViewById(R.id.img_flower_home);
                tvNameFlowerHome = itemView.findViewById(R.id.tv_name_flower_home);
            }


        }
    }
}
