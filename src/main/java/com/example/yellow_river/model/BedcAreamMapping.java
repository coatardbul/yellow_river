package com.example.yellow_river.model;

import lombok.Data;

@Data
public class BedcAreamMapping {
    /**
    * 市编码
    */
    private String areamCode;

    /**
    * 根据银行联行号截取的区域码值
    */
    private String subAreamCode;

    /**
    * 市编码名称
    */
    private String areamName;
}