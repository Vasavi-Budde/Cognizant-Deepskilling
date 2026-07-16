package com.cognizant.spring_rest_validation.service;

import com.cognizant.spring_rest_validation.dao.CountryDao;
import com.cognizant.spring_rest_validation.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public ArrayList<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }

    public Country addCountry(Country country) {
        countryDao.addCountry(country);
        return country;
    }
}