package com.project.bicicoletivo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateUserDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @NotNull(message = "Número de matrícula é obrigatório")
    private Long ra;

    @NotBlank(message = "Marca da bicicleta é obrigatória")
    private String marcabike;

    //@NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String password;

    @NotBlank(message = "Modelo da bicicleta é obrigatório")
    private String modelobike;

    @NotBlank(message = "Cor da bicicleta é obrigatória")
    private String corbike;

    public CreateUserDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMarcabike() {
        return marcabike;
    }

    public void setMarcabike(String marcabike) {
        this.marcabike = marcabike;
    }

    public String getModelobike() {
        return modelobike;
    }

    public void setModelobike(String modelobike) {
        this.modelobike = modelobike;
    }

    public String getCorbike() {
        return corbike;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorbike(String corbike) {
        this.corbike = corbike;
    }

    public Long getRa() {
        return ra;
    }

    public void setRa(Long ra) {
        this.ra = ra;
    }

}
