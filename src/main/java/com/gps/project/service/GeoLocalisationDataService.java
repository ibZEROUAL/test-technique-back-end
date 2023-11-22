package com.gps.project.service;

import com.gps.project.dto.GeoLocalisationDataDto;
import com.gps.project.mapper.GeoLocalisationDataMapper;
import com.gps.project.repository.GeoLocalisationDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GeoLocalisationDataService {

    private final GeoLocalisationDataRepository repository;

    private final GeoLocalisationDataMapper mapper;

    public List<GeoLocalisationDataDto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

}
