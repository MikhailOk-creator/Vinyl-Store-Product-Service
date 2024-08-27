package ru.okhapkin.vinylstore.productservice.dto;

import java.math.BigDecimal;
import java.util.List;

public class VinylDTO {
    private String name;
    private String musician;
    private String label;
    private String description;
    private BigDecimal price;
    private List<String> listOfSongs;

    public String getName() {
        return name;
    }

    public String getMusician() {
        return musician;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<String> getListOfSongs() {
        return listOfSongs;
    }
}
