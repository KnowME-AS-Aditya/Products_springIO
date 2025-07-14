package com.helloWorld.demo.service;

import com.helloWorld.demo.model.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> products= Arrays.asList(new Products(101,"ToothBrush", 27.50), new Products(102, "Black pen", 17.00), new Products(105, "Hair gel", 300.0));

    public List<Products> getProducts(){
        return products;

    }
}
