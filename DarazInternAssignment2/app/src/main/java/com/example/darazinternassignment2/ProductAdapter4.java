package com.example.darazinternassignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darazinternassignment2.daraz.Product3;
import com.example.darazinternassignment2.daraz.Product4;

import java.util.ArrayList;

public class ProductAdapter4 extends RecyclerView.Adapter<ProductAdapter4.ProductViewHolder> {

    private Context context;
    private ArrayList<Product4> productList4;

    public ProductAdapter4(Context context, ArrayList<Product4> productList4) {
        this.context = context;
        this.productList4 = productList4;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout5, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product4 Product4 = productList4.get(position);
        holder.productImage.setImageResource(Product4.getImageResource());
        holder.productprice.setText(Product4.getPrice());
    }

    @Override
    public int getItemCount() {
        return productList4.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productprice;

        ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.image2);
            productprice = itemView.findViewById(R.id.price_text2);
        }
    }
}
