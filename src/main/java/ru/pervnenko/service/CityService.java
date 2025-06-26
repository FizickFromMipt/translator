package ru.pervnenko.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pervnenko.repository.CityRepository;

@Service @RequiredArgsConstructor public class CityService {
    private final CityRepository cityRepository;

    public String getRuName(String ruName) {
        return cityRepository.findByRuName(ruName).getEnName();
    }
}
