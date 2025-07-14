package com.helloWorld.demo.model;


import lombok.Data;

@Data
public class Products {
    private int prodId;
    private String prod_name;
    private double prod_price;

    public Products(int p, String pname, double pr) {
        prodId=p;
        prod_name=pname;
        prod_price=pr;
    }
}
