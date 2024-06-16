package com.soapdemo.demo;

import com.soapdemo.demo.config.CountryClient;
import com.soapdemo.demo.jaxbmodel.ListOfCountryNamesByNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryClient countryClient;

    public ListOfCountryNamesByNameResponse getCountries(String name) {
        ListOfCountryNamesByNameResponse capitalCityResponse = countryClient.getCountry("AX");

        System.out.println(capitalCityResponse.getListOfCountryNamesByNameResult());
        return capitalCityResponse;
    }

}
