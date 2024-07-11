package com.example.darazinternassignment2.daraz;


public class Product {
    private int imageResourceId;
    private String price;
    private String rating;
    private String orderDetails;

    public Product(int imageResourceId,   String price, String rating, String orderDetails) {
        this.imageResourceId = imageResourceId;
        this.price = price;
        this.rating = rating;
        this.orderDetails = orderDetails;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }




    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public String getOrderDetails() {
        return orderDetails;
    }
}
