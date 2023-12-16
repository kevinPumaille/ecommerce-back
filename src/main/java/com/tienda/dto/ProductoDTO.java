package com.tienda.dto;

import com.tienda.model.Categoria;
import com.tienda.model.Genero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ProductoDTO {

    private Integer id;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precioProducto;
    private Boolean estadoProducto;
    private Integer generoProducto;
    private GeneroDTO generoDTOProducto;
    private Integer categoriaProducto;

    public ProductoDTO() {
    }

    public ProductoDTO(Integer id, String nombreProducto, String descripcionProducto, Double precioProducto, Boolean estadoProducto, Integer generoProducto, GeneroDTO generoDTOProducto, Integer categoriaProducto) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.estadoProducto = estadoProducto;
        this.generoProducto = generoProducto;
        this.generoDTOProducto = generoDTOProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Boolean getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Integer getGeneroProducto() {
        return generoProducto;
    }

    public void setGeneroProducto(Integer generoProducto) {
        this.generoProducto = generoProducto;
    }

    public GeneroDTO getGeneroDTOProducto() {
        return generoDTOProducto;
    }

    public void setGeneroDTOProducto(GeneroDTO generoDTOProducto) {
        this.generoDTOProducto = generoDTOProducto;
    }

    public Integer getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(Integer categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
}
