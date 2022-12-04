package com.hithesh.springbootdemo.controller;

import com.hithesh.springbootdemo.Repository.DemoRepository;
import com.hithesh.springbootdemo.dto.Demo;
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
    public String getDemoResponse(){
        return " This is an demo response ";
    }

    @GetMapping("/getDemoDbResponse")
    public List<Demo> getDemoDbResponse(){
        return repository.getDemoDetails();
    }

}
