package com.cognizant.spring_rest_validation.dao;

import com.cognizant.spring_rest_validation.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CountryDao {

    private static ArrayList<Country> COUNTRY_LIST;

    public CountryDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        COUNTRY_LIST = new ArrayList<>();

        COUNTRY_LIST.add(context.getBean("country1", Country.class));
        COUNTRY_LIST.add(context.getBean("country2", Country.class));
        COUNTRY_LIST.add(context.getBean("country3", Country.class));
    }

    public ArrayList<Country> getAllCountries() {
        return COUNTRY_LIST;
    }

    public void addCountry(Country country) {
        COUNTRY_LIST.add(country);
    }
}