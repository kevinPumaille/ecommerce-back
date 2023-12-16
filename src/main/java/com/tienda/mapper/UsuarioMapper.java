package com.tienda.mapper;

import com.tienda.dto.UsuarioDTO;
import com.tienda.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioMapper {

//    @Mappings({
//            @Mapping(source = "id",target = "id"),
//            @Mapping(source = "nombre",target = "nombreUsuario"),
//            @Mapping(source = "descripcion",target = "descripcionUsuario"),
//            @Mapping(source = "precio",target = "precioUsuario"),
//            @Mapping(source = "estado",target = "estadoUsuario"),
//            @Mapping(source = "id_genero",target = "generoUsuario"),
//            @Mapping(source = "id_categoria",target = "categoriaUsuario")
//    })
    UsuarioDTO UsuarioToUsuarioDTO(Usuario Usuario);


}
