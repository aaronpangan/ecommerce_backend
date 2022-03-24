package com.example.ecommerce_backend.product.response;

import java.math.BigDecimal;
import java.util.Date;

import com.example.ecommerce_backend.product.Product;
import com.example.ecommerce_backend.productCategory.ProductCategory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {

    private Long id;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private boolean isActive;

    private int stock;

    private Date createdAt;

    private Date updatedAt;

    private ProductCategory category;

    public ProductResponse(Product product) {
        this.id = product.getId();
        this.sku = product.getSku();

        this.name = product.getName();

        this.description = product.getDescription();

        this.unitPrice = product.getUnitPrice();

        this.imageUrl = product.getImageUrl();

        this.isActive = product.isActive();

        this.stock = product.getStock();

        this.createdAt = product.getCreatedAt();

        this.updatedAt = product.getUpdatedAt();

        this.category = product.getCategory();
    }
}
