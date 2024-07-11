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

import java.util.ArrayList;

public class ProductAdapter3 extends RecyclerView.Adapter<ProductAdapter3.ProductViewHolder> {

    private Context context;
    private ArrayList<Product3> productList3;

    public ProductAdapter3(Context context, ArrayList<Product3> productList3) {
        this.context = context;
        this.productList3 = productList3;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout4, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product3 Product3 = productList3.get(position);
        holder.productImage.setImageResource(Product3.getImageResource());
        holder.productprice.setText(Product3.getPrice());
    }

    @Override
    public int getItemCount() {
        return productList3.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productprice;

        ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.image1);
            productprice = itemView.findViewById(R.id.price_text1);
        }
    }
}
