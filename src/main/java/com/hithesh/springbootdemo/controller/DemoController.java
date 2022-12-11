package com.hithesh.springbootdemo.controller;

import com.hithesh.springbootdemo.Repository.DemoRepository;
import com.hithesh.springbootdemo.dto.Demo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoRepository repository;

    @GetMapping("/getDemoResponse")
    @ApiOperation(value="This Endpoint is used to get the static response")
    public String getDemoResponse(){
        return " This is an demo response ";
    }

    @GetMapping("/getDemoDbResponse")
    @ApiOperation(value="This Endpoint is used to get the  data stored in database")
    public List<Demo> getDemoDbResponse(){
        return repository.getDemoDetails();
    }

}
