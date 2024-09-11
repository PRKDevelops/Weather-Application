package com.example.weather_app.controller;

import com.example.weather_app.model.WeatherResponse;
import com.example.weather_app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/current")
    public ResponseEntity<WeatherResponse> getCurrentWeather(
            @RequestParam double lat,
            @RequestParam double lon) {
        WeatherResponse response = weatherService.getCurrentWeather(lat, lon);
        return ResponseEntity.ok(response);
    }
}