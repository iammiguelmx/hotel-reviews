package com.mx.hotel.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Hotels")
public class Hotel {

    @Id @Getter @Setter
    private String id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePerNight;

    @Getter @Setter
    private Address address;

    @Getter @Setter
    private List<Review> reviews;

    protected Hotel() {
        this.reviews = new ArrayList<>();
    }

    public Hotel(String name, int pricePerNight, Address address, List<Review> reviews) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.address = address;
        this.reviews = reviews;
    }

}
