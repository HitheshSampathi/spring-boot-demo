package com.hithesh.springbootdemo.Repository;

import com.hithesh.springbootdemo.dto.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Demo> getDemoDetails() {
       return jdbcTemplate.query("select * from demo", new BeanPropertyRowMapper<>(Demo.class));
    }
}






