package com.example.darazinternassignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class adapter2 extends RecyclerView.Adapter<adapter2.ViewHolder> {



    private ArrayList<String> mImageNames2;
    private ArrayList<String> mImages2;
    private Context mContext;

    public adapter2(Context context, ArrayList<String> imageNames, ArrayList<String> images) {
        mImageNames2 = imageNames;
        mImages2 = images;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout2, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imageName.setText(mImageNames2.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(mImages2.get(position))
                .error(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mImageNames2.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView imageName;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            imageName = itemView.findViewById(R.id.name);
        }
    }
}
