package com.project.bicicoletivo.dto;


import com.project.bicicoletivo.entities.Bike;

public class BikeDTO {

    private Long id;
    private String marca;
    private String modelo;
    private String color;

    private UserDTO proprietary;

    public BikeDTO() {
    }

    public BikeDTO(Long id, String marca, String modelo, String color, UserDTO proprietary){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.proprietary = proprietary;
    }
    public BikeDTO(Bike entity){
        this.id = entity.getId();
        this.marca = entity.getMarca();
        this.modelo = entity.getModelo();
        this.modelo = entity.getColor();
        this.proprietary = new UserDTO(entity.getProprietary());

    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public UserDTO getProprietary() {
        return proprietary;
    }
}
