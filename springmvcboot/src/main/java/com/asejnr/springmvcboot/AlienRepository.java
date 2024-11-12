package com.asejnr.springmvcboot;

import com.asejnr.springmvcboot.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlienRepository extends JpaRepository<Alien, Integer> {

    List<Alien> findByName(String name); // Query DSL
}
