package com.mx.hotel.controller;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.mx.hotel.service.HotelService;
import com.mx.hotel.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/all")
    public List<Hotel> getAll() {
        List<Hotel> hotels = this.hotelService.findAll();
        return hotels;
    }

    @PutMapping
    public void insert(@RequestBody Hotel hotel) {
        hotelService.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel) {
        hotelService.save(hotel);
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getByPricePerNight(@PathVariable("maxPrice") int maxPrice) {
        List<Hotel> hotels = this.hotelService.findByPricePerNightLessThan(maxPrice);
        return hotels;
    }

    @GetMapping("/address/{city}")
    public List<Hotel> getByCity(@PathVariable("city") String city) {
        List<Hotel> hotels = this.hotelService.findByCity(city);
        return hotels;
    }


}