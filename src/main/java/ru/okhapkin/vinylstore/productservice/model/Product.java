package ru.okhapkin.vinylstore.productservice.model;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private Type typeOfProduct;

    public enum Type {
        VINYL
    }

    public Product() {}

    public Product(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
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

    public Type getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(Type typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
}
