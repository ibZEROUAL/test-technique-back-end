package com.gps.project.model;

import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@NoArgsConstructor
public class GeoLocalisationDataId implements Serializable {

    public LocalDateTime date;

    public int idDevice;

    public GeoLocalisationDataId(LocalDateTime date, int idDevice) {
        this.date = date;
        this.idDevice = idDevice;
    }

}
