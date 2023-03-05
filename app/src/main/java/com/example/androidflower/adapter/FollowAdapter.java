package com.example.androidflower.adapter;

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

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.FollowViewHolder> {

    private List<Flower> list ;

    @NonNull
    @Override
    public FollowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite,parent,false);
        return new FollowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FollowViewHolder holder, int position) {
        Flower flower = list.get(position);
        if(flower == null){
            return;
        }
        holder.imageView.setImageResource(flower.getImage());
        holder.tvName.setText(flower.getName());
        holder.tvPrice.setText(Double.toString(flower.getPrice()));

    }

    @Override
    public int getItemCount() {
        if (list != null){
            return list.size();
        }
        return 0;
    }

    public class FollowViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tvName;
        private TextView tvPrice;

        public FollowViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item_image_favorite);
            tvName = itemView.findViewById(R.id.item_name_favorite);
            tvPrice = itemView.findViewById(R.id.item_price_favorite);

        }
    }
}
