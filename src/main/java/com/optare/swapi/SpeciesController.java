package com.optare.swapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpeciesController {

    @ResponseBody
    @GetMapping("/api/species/")
    public Species[] getSpecies() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SpeciesResponse> response = restTemplate.getForEntity("https://swapi.dev/api/species/", SpeciesResponse.class);
        SpeciesResponse speciesResponse = response.getBody();
        return speciesResponse.getResults();
    }
}