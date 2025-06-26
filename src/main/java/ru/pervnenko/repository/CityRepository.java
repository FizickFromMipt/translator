package ru.pervnenko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pervnenko.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByRuName(String ruName);
}
