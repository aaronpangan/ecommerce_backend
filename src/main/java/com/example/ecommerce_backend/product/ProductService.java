package com.example.ecommerce_backend.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ecommerce_backend.product.response.ProductResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;

    public List<ProductResponse> getAllProducts() {

        List<Product> products = productRepo.findAll();
        List<ProductResponse> productList = new ArrayList<ProductResponse>();

        products.stream().forEach(product -> {
            productList.add(new ProductResponse(product));
        });

        return productList;
    }

    public ProductResponse getProduct(Long id) {

        Product product = productRepo.findById(id).get();

        return new ProductResponse(product);
    }

}
