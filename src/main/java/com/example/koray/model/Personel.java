package com.example.koray.model;

import io.swagger.annotations.ApiModelProperty;

public class Personel {

    @ApiModelProperty(notes = "ID of the Personel", name="name")
    private Long id;

    @ApiModelProperty(notes = "Name of the Personel", name="name")
    private String name;

    @ApiModelProperty(notes = "Surname of the Personel", name="surname")
    private String surname;

    public Personel(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
