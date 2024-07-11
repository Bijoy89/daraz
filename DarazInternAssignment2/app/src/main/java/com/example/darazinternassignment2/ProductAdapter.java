package com.example.darazinternassignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darazinternassignment2.daraz.Product2;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context context;
    private ArrayList<Product2> productList;

    public ProductAdapter(Context context, ArrayList<Product2> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout3, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product2 Product2 = productList.get(position);
        holder.productImage.setImageResource(Product2.getImageResource());
        holder.productName.setText(Product2.getName());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName;

        ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productName = itemView.findViewById(R.id.product_name);
        }
    }
}
