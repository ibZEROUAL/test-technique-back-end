package com.gps.project.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeoLocalisationDataDto implements Serializable {

    private Integer speed;
    private Integer fuel;
    private String temp;
    private Integer x;
    private Integer y;
    private Integer z;
    private Boolean ignition;
    private Integer rpm;
    private Double fuelRate;
    private Double tfu;
    private Double odo;
    private Integer satInView;
    private Integer signal;
    private Integer heading;
    private Boolean charger;
    private Double latitude;
    private Double longitude;
    private Integer state;
    private Integer tramId;
    private Integer validity;
    private Integer tempEngine;
    private Float accumOdo;
    private Integer do1;
    private Integer do2;
    private Integer do3;
    private Integer do4;
    private Integer di1;
    private Integer di2;
    private Integer di3;
    private Integer di4;
    private Integer an1;
    private Integer an2;
    private Integer an3;
    private Integer an4;
}
