package com.project.bicicoletivo.dto;


import com.project.bicicoletivo.entities.Bike;

public class BikeDTO {

    private Long id;
    private String marca;
    private String modelo;
    private String color;

    private UserDTO proprietario;

    public BikeDTO() {
    }

    public BikeDTO(Long id, String marca, String modelo, String color, UserDTO proprietario){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.proprietario = proprietario;
    }
    public BikeDTO(Bike entity){
        this.id = entity.getId();
        this.marca = entity.getMarca();
        this.modelo = entity.getModelo();
        this.modelo = entity.getColor();
        this.proprietario = new UserDTO(entity.getProprietario());

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

    public UserDTO getProprietario() {
        return proprietario;
    }
}
