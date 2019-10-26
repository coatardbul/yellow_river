package com.example.yellow_river.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.yellow_river.model.BedcAreamMapping;

public interface BedcAreamMappingMapper {
    int deleteByPrimaryKey(String areamCode);

    int insert(BedcAreamMapping record);

    int insertSelective(BedcAreamMapping record);

    BedcAreamMapping selectByPrimaryKey(String areamCode);

    int updateByPrimaryKeySelective(BedcAreamMapping record);

    int updateByPrimaryKey(BedcAreamMapping record);

    int updateSubAreamCodeByAreamCode(@Param("updatedSubAreamCode")String updatedSubAreamCode,@Param("areamCode")String areamCode);



    List<BedcAreamMapping> selectByAll(BedcAreamMapping bedcAreamMapping);


}