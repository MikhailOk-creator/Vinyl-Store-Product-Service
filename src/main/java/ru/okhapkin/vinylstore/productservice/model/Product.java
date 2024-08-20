package ru.okhapkin.vinylstore.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(value = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private String musician;
    private String label;
    private String description;
    private BigDecimal price;
    private List<String> listOfSongs;

    public Product() {}

    public Product(String name, String musician, String label, String description, BigDecimal price, List<String> listOfSongs) {
        this.id = id;
        this.name = name;
        this.musician = musician;
        this.label = label;
        this.description = description;
        this.price = price;
        this.listOfSongs = listOfSongs;
    }

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

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public List<String> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(List<String> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }
}
