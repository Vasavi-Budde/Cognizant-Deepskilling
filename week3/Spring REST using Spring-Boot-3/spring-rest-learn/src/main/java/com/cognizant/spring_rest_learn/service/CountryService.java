package com.cognizant.spring_rest_learn.service;

import com.cognizant.spring_rest_learn.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.cognizant.spring_rest_learn.exception.CountryNotFoundException;

@Service
public class CountryService {

    private List<Country> countryList = new ArrayList<>();

    public CountryService() {

        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("DE", "Germany"));
        countryList.add(new Country("JP", "Japan"));
    }
    public Country getCountry(String code) {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        throw new CountryNotFoundException("Country not found");
    }
}