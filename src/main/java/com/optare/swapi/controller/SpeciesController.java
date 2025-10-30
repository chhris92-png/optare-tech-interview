package com.optare.swapi.controller;

import com.optare.swapi.model.request.Species;
import com.optare.swapi.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;

    @GetMapping("/api/species/")
    public Species[] getSpecies() {
        return speciesService.getSpeciesWithPlanet().toArray(new Species[0]);
    }
}
