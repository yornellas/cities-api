package com.github.yornellas.citiesapi.repository;

import com.github.yornellas.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
