package com.example.ecommerce_backend.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping()
    public String getAllProducts() {

        return "MEOW";
    }

    @GetMapping("{id}")
    public String getProduct(@PathVariable int id) {

        return "Mew" + id;
    }

}
