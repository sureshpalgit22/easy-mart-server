package com.easy_mart.landing.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "easymart_products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private String brandName;
    private String productCategory;
    private int quantity;
    private String sellerId;
    private String imageUrl;

    // Constructors
    public Product() {}

    public Product(String name, String description, BigDecimal price, String brandName, String productCategory, int quantity, String sellerId, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brandName = brandName;
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.sellerId = sellerId;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
