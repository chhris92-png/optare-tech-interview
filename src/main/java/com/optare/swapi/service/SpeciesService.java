package com.optare.swapi.service;

import com.optare.swapi.model.request.Planet;
import com.optare.swapi.model.request.Species;
import com.optare.swapi.model.response.SpeciesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpeciesService {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Species> getSpeciesWithPlanet() {
        ResponseEntity<SpeciesResponse> response = restTemplate.getForEntity("https://swapi.dev/api/species/", SpeciesResponse.class);
        SpeciesResponse speciesResponse = response.getBody();

        if (speciesResponse == null || speciesResponse.getResults() == null) {
            return new ArrayList<>();
        }

        for (Species species : speciesResponse.getResults()) {
            String homeworldUrl = species.getHomeworld();
            if (homeworldUrl != null && !homeworldUrl.isEmpty()) {
                try {
                    ResponseEntity<Planet> planetResponse = restTemplate.getForEntity(homeworldUrl, Planet.class);
                    Planet planet = planetResponse.getBody();
                    if (planet != null && planet.getName() != null) {
                        species.setHomeworld(planet.getName());
                    } else {
                        species.setHomeworld("unknown");
                    }
                } catch (Exception e) {
                    species.setHomeworld("unknown");
                }
            } else {
                species.setHomeworld("Without a planet");
            }
        }

        return speciesResponse.getResults();
    }
}
