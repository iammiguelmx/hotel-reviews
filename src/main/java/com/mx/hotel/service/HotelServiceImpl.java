package com.mx.hotel.service;

import com.mx.hotel.model.Hotel;
import com.mx.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository repository;

    @Override
    public List<Hotel> findAll() {
        return repository.findAll();
    }

    @Override
    public void insert(Hotel hotel) {
        repository.insert(hotel);
    }

    @Override
    public void save(Hotel hotel) {
        repository.save(hotel);
    }


    @Override
    public List<Hotel> findByPricePerNightLessThan(int maxPrice) {
        return repository.findByPricePerNightLessThan(maxPrice);
    }

    @Override
    public List<Hotel> findByCity(String city) {
        return repository.findByCity(city);
    }

}
