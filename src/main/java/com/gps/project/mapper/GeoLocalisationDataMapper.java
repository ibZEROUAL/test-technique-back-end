package com.gps.project.mapper;

import com.gps.project.dto.GeoLocalisationDataDto;
import com.gps.project.model.GeoLocalisationData;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GeoLocalisationDataMapper {

     GeoLocalisationDataDto toDto(GeoLocalisationData geoLocalisationData);
     GeoLocalisationData toEntity(GeoLocalisationDataDto geoLocalisationDataDto);
     List<GeoLocalisationDataDto> toDtoList(List<GeoLocalisationData> geoLocalisationDataList);
     List<GeoLocalisationData> toEntityList(List<GeoLocalisationDataDto> geoLocalisationDataDtoList);

}
