package ru.okhapkin.vinylstore.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;


@Document(value = "vinyl")
public class Vinyl extends Product {
    @Id
    private String id;
    private String musician;
    private String label;
    private List<String> listOfSongs;

    public Vinyl() {
    }

    public Vinyl(String id,
                 String name,
                 String description,
                 BigDecimal price,
                 String musician,
                 String label,
                 List<String> listOfSongs) {
        super(name, description, price);
        this.id = id;
        this.musician = musician;
        this.label = label;
        this.listOfSongs = listOfSongs;
        this.setTypeOfProduct(Type.VINYL);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<String> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(List<String> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }
}
