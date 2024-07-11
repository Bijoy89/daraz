package com.example.darazinternassignment2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.darazinternassignment2.daraz.Product;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {


    private Context mContext;
    private ArrayList<Product> mProducts;

    public adapter(Context context, ArrayList<Product> products) {
        mContext = context;
        mProducts = products;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = mProducts.get(position);
        holder.image.setImageResource(product.getImageResourceId());
        holder.price.setText(String.valueOf(product.getPrice()));
        holder.rating.setText(String.valueOf(product.getRating()));
        holder.orderDetails.setText(product.getOrderDetails());
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView   price, rating, orderDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            price = itemView.findViewById(R.id.price_text);
            rating = itemView.findViewById(R.id.rating_text);
            orderDetails = itemView.findViewById(R.id.order_details_text);
        }
    }
}
