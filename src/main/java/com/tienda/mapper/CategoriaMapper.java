package com.tienda.mapper;

import com.tienda.dto.CategoriaDTO;
import com.tienda.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoriaMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "nombre",target = "nombreCategoria"),
    })
    CategoriaDTO CategoriaToCategoriaDTO(Categoria Categoria);


}
