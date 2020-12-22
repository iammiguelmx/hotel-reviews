package com.mx.hotel.model;

import lombok.Getter;
import lombok.Setter;

public class Review {

    @Getter @Setter
    private String userName;

    @Getter @Setter
    private int rating;

    @Getter @Setter
    private boolean approved;

    protected Review() {
    }

    public Review(String userName, int rating, boolean approved) {
        this.userName = userName;
        this.rating = rating;
        this.approved = approved;
    }

}
