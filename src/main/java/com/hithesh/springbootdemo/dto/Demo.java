package com.hithesh.springbootdemo.dto;

public class Demo {
    private Long id;
    private String name;
    private String role;


    public Demo() {
        super();
    }

    public Demo(Long id, String name, String role) {
        super();
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Demo(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, role=%s]", id, name, role);
    }

}

