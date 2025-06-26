package ru.pervnenko.controller;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pervnenko.service.CityService;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final CityService cityService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam("enName") String enName) {
        return cityService.getRuName(enName);
    }
}
