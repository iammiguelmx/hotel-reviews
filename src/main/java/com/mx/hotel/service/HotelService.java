package com.mx.hotel.service;

import com.mx.hotel.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel>  findAll();
    void insert(Hotel hotel);
    void save(Hotel hotel);
    List<Hotel> findByPricePerNightLessThan(int maxPrice);
    List<Hotel> findByCity(String city);

}
