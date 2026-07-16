package com.cognizant.spring_rest_learn.controller;

import com.cognizant.spring_rest_learn.model.Country;
import com.cognizant.spring_rest_learn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    // Returns India details
    @RequestMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");

        Country country = new Country("IN", "India");

        LOGGER.info("END");

        return country;
    }

    // Returns all countries
    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        List<Country> countryList = new ArrayList<>();

        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("DE", "Germany"));
        countryList.add(new Country("JP", "Japan"));

        LOGGER.info("END");

        return countryList;
    }

    // Returns country based on country code
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        LOGGER.info("START");

        Country country = countryService.getCountry(code);

        LOGGER.info("END");

        return country;
    }

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country) {

        LOGGER.info("Received Country: {}", country);

        return country;
    }
}