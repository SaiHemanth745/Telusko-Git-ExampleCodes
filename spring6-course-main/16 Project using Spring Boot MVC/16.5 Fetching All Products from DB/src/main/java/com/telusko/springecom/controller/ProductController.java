package com.telusko.springecom.controller;

import com.telusko.springecom.model.Product;
import com.telusko.springecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
//
//    @GetMapping("/product/{id}")
//    public  Product productById(@PathVariable int id){
//        return productService.getProductById(id);
//    }

}
