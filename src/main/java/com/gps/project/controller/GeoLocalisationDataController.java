package com.gps.project.controller;

import com.gps.project.dto.GeoLocalisationDataDto;
import com.gps.project.service.GeoLocalisationDataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("")
public class GeoLocalisationDataController {

    private final GeoLocalisationDataService service;

    @GetMapping("/data")
    public List<GeoLocalisationDataDto> findAll() {
        return service.findAll();
    }

}
