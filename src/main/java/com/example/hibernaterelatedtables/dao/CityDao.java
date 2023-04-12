package com.example.hibernaterelatedtables.dao;

import com.example.hibernaterelatedtables.model.City;

import java.util.List;

public interface CityDao {

    void addCity(City city);

    City findById(int id);

    List<City> getAllCity();

    void updateCity(City city);

    void deleteCity(City city);
}
