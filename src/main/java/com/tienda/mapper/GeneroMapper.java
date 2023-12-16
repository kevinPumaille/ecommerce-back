package com.tienda.mapper;

import com.tienda.dto.GeneroDTO;
import com.tienda.dto.ProductoDTO;
import com.tienda.model.Genero;
import com.tienda.model.Producto;
import org.mapstruct.*;
import reactor.core.publisher.Mono;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GeneroMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "nombre",target = "nombreGenero"),
    })
    GeneroDTO generoToGeneroDTO(Genero genero);


}
