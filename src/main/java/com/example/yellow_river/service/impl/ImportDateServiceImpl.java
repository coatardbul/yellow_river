package com.example.yellow_river.service.impl;

import com.example.yellow_river.mapper.BedcAreamMappingMapper;
import com.example.yellow_river.mapper.BedcCityMappingMapper;
import com.example.yellow_river.model.BedcAreamMapping;
import com.example.yellow_river.model.BedcCityMapping;
import com.example.yellow_river.service.ImportDateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ImportDateServiceImpl implements ImportDateService {
    @Autowired
    BedcCityMappingMapper bedcCityMappingMapper;
    @Autowired
    BedcAreamMappingMapper bedcAreamMappingMapper;
    @Override
    public void importDate() {
        List<BedcAreamMapping> bedcAreamMappingList = bedcAreamMappingMapper.selectByAll(new BedcAreamMapping());
        for(BedcAreamMapping b:bedcAreamMappingList){
            List<BedcCityMapping> bedcCityMappings = bedcCityMappingMapper.selectAllByCityNameLike(b.getAreamName());
            if(bedcCityMappings.size()>0){
                bedcAreamMappingMapper.updateSubAreamCodeByAreamCode(bedcCityMappings.get(0).getCityCode(),b.getAreamCode());
            }

        }


    }
}
