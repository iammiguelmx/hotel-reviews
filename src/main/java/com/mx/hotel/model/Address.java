package com.mx.hotel.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Address {

    @Getter @Setter
    private String city;

    @Getter @Setter
    private String country;

}
