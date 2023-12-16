package com.tienda.mapper;

import com.tienda.dto.GeneroDTO;
import com.tienda.dto.ProductoDTO;
import com.tienda.model.Genero;
import com.tienda.model.Producto;
import com.tienda.service.IGeneroService;
import com.tienda.service.impl.GeneroServiceImpl;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductoMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "nombre",target = "nombreProducto"),
            @Mapping(source = "descripcion",target = "descripcionProducto"),
            @Mapping(source = "precio",target = "precioProducto"),
            @Mapping(source = "estado",target = "estadoProducto"),
            @Mapping(source = "id_genero",target = "generoProducto"),
            @Mapping(source = "id_categoria",target = "categoriaProducto")
    })
    ProductoDTO productoToProductoDTO(Producto producto);


}
