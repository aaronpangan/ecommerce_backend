package com.example.ecommerce_backend.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ecommerce_backend.product.response.ProductResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public List<ProductResponse> getAllProducts() {

        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public ProductResponse getProduct(@PathVariable Long id) {

        return productService.getProduct(id);
    }

}
