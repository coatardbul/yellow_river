package com.example.yellow_river.model;

import lombok.Data;

@Data
public class BedcCityMapping {
    /**
    * 城市编码主键
    */
    private String cityCode;

    /**
    * 城市编码名称
    */
    private String cityName;

    /**
    * 城市所在省编码
    */
    private String provinceCode;

    /**
    * 城市所在省名称
    */
    private String provinceName;
}