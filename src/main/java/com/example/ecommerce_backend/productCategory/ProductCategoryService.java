package com.example.ecommerce_backend.productCategory;

import java.util.ArrayList;
import java.util.List;

import com.example.ecommerce_backend.productCategory.response.ProductCategoryResponse;
import com.example.ecommerce_backend.productCategory.response.ProductCategoryWithProductsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepo;

    public List<ProductCategoryResponse> getCategories() {

        List<ProductCategory> productCategory = productCategoryRepo.findAll();

        List<ProductCategoryResponse> productCategoryList = new ArrayList<ProductCategoryResponse>();
        productCategory.stream().forEach(product -> {
            productCategoryList.add(new ProductCategoryResponse(product));
        });

        return productCategoryList;

    }

    public List<ProductCategoryWithProductsResponse> getCategoriesWithProducts() {
        List<ProductCategory> productCategory = productCategoryRepo.findAll();

        List<ProductCategoryWithProductsResponse> productCategoryListWithProducts = new ArrayList<ProductCategoryWithProductsResponse>();
        productCategory.stream().forEach(productCategoryWithProducts -> {
            productCategoryListWithProducts.add(new ProductCategoryWithProductsResponse(productCategoryWithProducts));
        });
        return productCategoryListWithProducts;
    }

}
