package com.example.yellow_river.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.yellow_river.model.BedcCityMapping;

public interface BedcCityMappingMapper {
    int insert(BedcCityMapping record);

    int insertSelective(BedcCityMapping record);


    List<BedcCityMapping> selectAllByCityNameLike(@Param("likeCityName")String likeCityName);


}