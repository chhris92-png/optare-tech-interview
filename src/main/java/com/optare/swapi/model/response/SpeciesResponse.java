package com.optare.swapi.model.response;

import com.optare.swapi.model.request.Species;

import java.util.List;

public class SpeciesResponse {
    private List<Species> results;

    public List<Species> getResults() {
        return results;
    }

    public void setResults(List<Species> results) {
        this.results = results;
    }
}
