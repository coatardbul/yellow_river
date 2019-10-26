package com.example.yellow_river.controller;

import com.example.yellow_river.service.ImportDateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@Api(value = "BEDCSystem")
@Slf4j
@RestController

@RequestMapping(value ="test")
public class ImportDateController {
    @Autowired
    ImportDateService importDateService;


    @ApiOperation(value = "下载明细文件", notes = "")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public void downlodDetailFile() {

        importDateService.importDate();
    }

}
