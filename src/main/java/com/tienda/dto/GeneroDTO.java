package com.tienda.dto;

public class GeneroDTO {

    private Integer id;
    private String nombreGenero;

    public GeneroDTO() {
    }

    public GeneroDTO(Integer id, String nombreGenero) {
        this.id = id;
        this.nombreGenero = nombreGenero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}
