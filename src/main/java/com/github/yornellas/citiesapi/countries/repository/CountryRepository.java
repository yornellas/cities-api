package com.github.yornellas.citiesapi.countries.repository;

import com.github.yornellas.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
