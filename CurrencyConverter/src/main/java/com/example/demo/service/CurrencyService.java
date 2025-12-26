package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CurrencyService {

    private static final String API_URL =
            "https://api.exchangerate-api.com/v4/latest/";

    public double convert(String from, String to, double amount) {

        RestTemplate restTemplate = new RestTemplate();
        Map response = restTemplate.getForObject(API_URL + from, Map.class);

        Map<String, Double> rates =
                (Map<String, Double>) response.get("rates");

        double rate = rates.get(to);

        return amount * rate;
    }
}
