package com.github.yornellas.citiesapi.states.repository;

import com.github.yornellas.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}
