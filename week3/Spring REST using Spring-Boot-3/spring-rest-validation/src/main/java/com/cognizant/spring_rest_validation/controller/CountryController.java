package com.cognizant.spring_rest_validation.controller;

import com.cognizant.spring_rest_validation.model.Country;
import com.cognizant.spring_rest_validation.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ArrayList<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public Country addCountry(@RequestBody @Valid Country country) {

        LOGGER.info("START");

        LOGGER.debug("Country : {}", country);

        return countryService.addCountry(country);
    }
}