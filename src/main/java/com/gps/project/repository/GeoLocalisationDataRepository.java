package com.gps.project.repository;

import com.gps.project.model.GeoLocalisationData;
import com.gps.project.model.GeoLocalisationDataId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoLocalisationDataRepository extends JpaRepository<GeoLocalisationData, GeoLocalisationDataId> {
}
