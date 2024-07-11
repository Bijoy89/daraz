package com.example.darazinternassignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class adapter1 extends RecyclerView.Adapter<adapter1.ViewHolder> {



    private ArrayList<String> mImageNames1;
    private ArrayList<String> mImages1;
    private Context mContext;

    public adapter1(Context context, ArrayList<String> imageNames, ArrayList<String> images) {
        mImageNames1 = imageNames;
        mImages1 = images;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imageName.setText(mImageNames1.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(mImages1.get(position))
                .error(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mImageNames1.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView imageName;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
        }
    }
}