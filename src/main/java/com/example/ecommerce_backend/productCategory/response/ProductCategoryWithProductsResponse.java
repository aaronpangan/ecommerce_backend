package com.example.ecommerce_backend.productCategory.response;

import java.util.Set;

import com.example.ecommerce_backend.product.Product;
import com.example.ecommerce_backend.productCategory.ProductCategory;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class ProductCategoryWithProductsResponse {

    private Long id;

    private String categoryName;

    private Set<Product> products;

    public ProductCategoryWithProductsResponse(ProductCategory productCategory) {

        this.id = productCategory.getId();
        this.categoryName = productCategory.getCategoryName();
        this.products = productCategory.getProducts();

    }

}
