package com.example.darazinternassignment2.daraz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.darazinternassignment2.ProductAdapter;
import com.example.darazinternassignment2.ProductAdapter3;
import com.example.darazinternassignment2.ProductAdapter4;
import com.example.darazinternassignment2.R;
import com.example.darazinternassignment2.adapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Home extends Fragment {
View root;
ViewFlipper v1;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Product2> productList = new ArrayList<>();
    private ArrayList<Product3> productList3 = new ArrayList<>();
    private ArrayList<Product4> productList4 = new ArrayList<>();

    ImageView scan, se, top;
    CircleImageView daraz;
    TextView scant, darazt, toput;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root= inflater.inflate(R.layout.home, container, false);

        scan = root.findViewById(R.id.scan_icon);
        se = root.findViewById(R.id.sb);
        top = root.findViewById(R.id.topup);
        daraz = root.findViewById(R.id.ci);
        scant = root.findViewById(R.id.scantext1);
        darazt = root.findViewById(R.id.darazt);
        toput = root.findViewById(R.id.topupt);
        ImageView imageView5 = root.findViewById(R.id.i5);

        ImageView imageView6 = root.findViewById(R.id.i6);
        v1=root.findViewById(R.id.vflip);
        Animation in= AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left);
        Animation out= AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_out_right);
        v1.setInAnimation(in);
        v1.setOutAnimation(out);
        ImageView imageView1 = root.findViewById(R.id.i1);
        ImageView imageView2 = root.findViewById(R.id.i2);
        ImageView imageView3 = root.findViewById(R.id.i3);
        ImageView imageView4 = root.findViewById(R.id.i4);
        ImageView imageView7=root.findViewById(R.id.i7);
        ImageView imageView9=root.findViewById(R.id.i9);

        Glide.with(this)
                .asGif()
                .load(R.drawable.darazshopnow2)
                .into(imageView6);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/megascenario/bd/eid-festival-24/eid-hot-deals?spm=a2a0e.home.top.dbr1.735212f7d7obIf&pfilter=1010Badge_679978&scm=1003.4.icms-zebra-100031732-2885620.OTHER_6502960451_7765981");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/megascenario/bd/eid-festival-24/eid-kitchen-prep?spm=a2a0e.home.top.dbr9.573712f7QukZqh&pfilter=1010Badge_679978&scm=1003.4.icms-zebra-100031732-2885620.OTHER_6502960457_7765981");
            }

        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/channel/bd/bpg/bpg?spm=a2a0e.home.top.dbr8.573712f7Sw22QH&pfilter=1010Badge_206524&scm=1003.4.icms-zebra-100031732-2885620.OTHER_6502960455_7765981");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/channel/bd/elp/elp?spm=a2a0e.home.top.dbr2.573712f7sP2MrM&scm=1003.4.icms-zebra-100031732-2885620.OTHER_6502960454_7765981");
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/megascenario/bd/eid-festival-24/grand-eid-fest?spm=a2a0e.home.campaignbanner.1.735212f7M7X48g&pfilter=1010Badge_679978&scm=1003.4.icms-zebra-100031732-2924311.OTHER_6502962411_7766196");
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.daraz.com.bd/wow/i/bd/landingpage/flash-sale?spm=a2a0e.home.flashSale.1.7a0712f7458JP6&wh_weex=true&amp;wx_navbar_transparent=true&amp;scm=1003.4.icms-zebra-100031732-2896540.OTHER_5530854870_2643759&skuIds=269957914,114576067,303900154,188825716,228551004,315976956,321683577");
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/megascenario/bd/global-fiesta-2024-bd/global-fiesta?spm=a2a0e.home.top.dbr1.576112f7a5kBau&pfilter=1010Badge_679978&scm=1003.4.icms-zebra-100031732-2885620.OTHER_6502964453_7766365");
            }
        });

        imageView1.setClickable(true);
        imageView1.setFocusable(true);

        imageView2.setClickable(true);
        imageView2.setFocusable(true);

        imageView3.setClickable(true);
        imageView3.setFocusable(true);

        imageView4.setClickable(true);
        imageView4.setFocusable(true);
       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.showNext();
            }
        });*/

        products.add(new Product(R.drawable.recyclerimage1, "৳560", "3.0/5(2)",  "11.8K Sold"));
        products.add(new Product(R.drawable.recyclerimage2, "৳205", "5.0/5(2)",  "677 Sold"));
        products.add(new Product(R.drawable.recyclerimage3, "৳560", "3.1/5(38)",  "3K Sold"));
        products.add(new Product(R.drawable.recyclerimage4, "৳143", "4.0/5(27)",  "1.9K Sold"));
        products.add(new Product(R.drawable.recyclerimage5, "৳460", "3.7/5(3)",  "1.9K Sold"));
        products.add(new Product(R.drawable.recyclerimage6, "৳205", "3.9/5(23)",  "7.4K Sold"));
        products.add(new Product(R.drawable.recyclerimage7, "৳143", "4.0/5(14)",  "1.9K Sold"));
        products.add(new Product(R.drawable.recyclerimage8, "৳380", "4.2/5(11)",  "373 Sold"));
        products.add(new Product(R.drawable.recyclerimage9, "৳290", "3.6/5(37)",  "309 Sold"));
        products.add(new Product(R.drawable.recyclerimage10, "৳205", "3.7/5(71)",  "1.6K Sold"));


        RecyclerView recyclerView = root.findViewById(R.id.r1);
        adapter adapter = new adapter(getActivity(), products);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        productList.add(new Product2(R.drawable.rv1, "Trimmers,Groomers & Cli..."));
        productList.add(new Product2(R.drawable.rv2, "Chino"));
        productList.add(new Product2(R.drawable.rv3, "Modelling & Sculpting"));
        productList.add(new Product2(R.drawable.rv4, "Smart Watches"));
        productList.add(new Product2(R.drawable.rv5, "Fairy Lights"));
        productList.add(new Product2(R.drawable.rv6, "In-Ear Headphones"));
        productList.add(new Product2(R.drawable.rv7, "Face"));
        productList.add(new Product2(R.drawable.rv8, "Wardrobe Organisers"));






        RecyclerView recyclerView1 = root.findViewById(R.id.r2);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        ProductAdapter productAdapter = new ProductAdapter(getActivity(), productList);
        recyclerView1.setAdapter(productAdapter);


        productList3.add(new Product3(R.drawable.recyclerview1, "৳461"));
        productList3.add(new Product3(R.drawable.recyclerview2, "৳566"));
        productList3.add(new Product3(R.drawable.recyclerview3, "৳1312"));
        productList3.add(new Product3(R.drawable.recyclerview4, "৳470"));
        productList3.add(new Product3(R.drawable.recyclerview5, "৳273"));
        productList3.add(new Product3(R.drawable.recyclerview6, "৳105"));
        productList3.add(new Product3(R.drawable.recyclerview7, "৳598"));






        RecyclerView recyclerView3 = root.findViewById(R.id.r3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        ProductAdapter3 productAdapter3 = new ProductAdapter3(getActivity(), productList3);
        recyclerView3.setAdapter(productAdapter3);

        productList4.add(new Product4(R.drawable.rv9, "৳330"));
        productList4.add(new Product4(R.drawable.rv10, "৳500"));
        productList4.add(new Product4(R.drawable.rv11, "৳1200"));
        productList4.add(new Product4(R.drawable.rv12, "৳700"));
        productList4.add(new Product4(R.drawable.rv13, "৳273"));
        productList4.add(new Product4(R.drawable.rv14, "৳430"));






        RecyclerView recyclerView4 = root.findViewById(R.id.r4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        ProductAdapter4 productAdapter4 = new ProductAdapter4(getActivity(), productList4);
        recyclerView4.setAdapter(productAdapter4);


        ViewCompat.setOnApplyWindowInsetsListener(root.findViewById(R.id.home1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        return root;
    }
    public void onResume() {
        super.onResume();
        FloatingActionButton fab = requireActivity().findViewById(R.id.fab);
        fab.setVisibility(View.VISIBLE);
    }
    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}