package com.gps.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "arch_1004901")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class GeoLocalisationData {

    @EmbeddedId
    private GeoLocalisationDataId id;

    @Column(name = "speed", nullable = false)
    private Integer speed;

    @Column(name = "fuel", nullable = false)
    private Integer fuel;

    @Column(name = "temp", nullable = false)
    private String temp;

    @Column(name = "X", nullable = false)
    private Integer x;

    @Column(name = "Y", nullable = false)
    private Integer y;

    @Column(name = "Z", nullable = false)
    private Integer z;

    @Column(name = "ignition", nullable = false)
    private Boolean ignition;

    @Column(name = "rpm", nullable = false)
    private Integer rpm;

    @Column(name = "fuel_rate", nullable = false)
    private Double fuelRate;

    @Column(name = "tfu", nullable = false)
    private Double tfu;

    @Column(name = "odo", nullable = false)
    private Double odo;

    @Column(name = "SatInView", nullable = false)
    private Integer satInView;

    @Column(name = "signal", nullable = false)
    private Integer signal;

    @Column(name = "heading", nullable = false)
    private Integer heading;

    @Column(name = "charger", nullable = false)
    private Boolean charger;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "state")
    private Integer state;

    @Column(name = "tram_id")
    private Integer tramId;

    @Column(name = "validity")
    private Integer validity;

    @Column(name = "temp_engine")
    private Integer tempEngine;

    @Column(name = "accum_odo")
    private Float accumOdo;

    @Column(name = "do1")
    private Integer do1;

    @Column(name = "do2")
    private Integer do2;

    @Column(name = "do3")
    private Integer do3;

    @Column(name = "do4")
    private Integer do4;

    @Column(name = "di1")
    private Integer di1;

    @Column(name = "di2")
    private Integer di2;

    @Column(name = "di3")
    private Integer di3;

    @Column(name = "di4")
    private Integer di4;

    @Column(name = "an1")
    private Integer an1;

    @Column(name = "an2")
    private Integer an2;

    @Column(name = "an3")
    private Integer an3;

    @Column(name = "an4")
    private Integer an4;

}
