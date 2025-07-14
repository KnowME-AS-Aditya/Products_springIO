package com.helloWorld.demo.controller;

import com.helloWorld.demo.model.Products;
import com.helloWorld.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService  service;
    @RequestMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }
}
