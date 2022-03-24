package com.example.ecommerce_backend.productCategory.response;

import com.example.ecommerce_backend.productCategory.ProductCategory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCategoryResponse {

    private Long id;

    private String categoryName;

    public ProductCategoryResponse(ProductCategory productCategory) {

        this.id = productCategory.getId();
        this.categoryName = productCategory.getCategoryName();

    }

}
