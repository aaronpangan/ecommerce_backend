package com.example.ecommerce_backend.productCategory;

import java.util.List;

import com.example.ecommerce_backend.productCategory.response.ProductCategoryResponse;
import com.example.ecommerce_backend.productCategory.response.ProductCategoryWithProductsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product-category")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping
    public List<ProductCategoryResponse> getCategories() {

        return productCategoryService.getCategories();

    }

    @GetMapping("/product")
    public List<ProductCategoryWithProductsResponse> getCategoriesWithProducts() {
        return productCategoryService.getCategoriesWithProducts();
    }
    // @GetMapping("{id}")
    // public ProductCategory getCategory(@PathVariable long id){

    // }

}
