package com.tienda.handler;

import com.tienda.dto.CategoriaDTO;
import com.tienda.mapper.CategoriaMapper;
import com.tienda.model.Categoria;
import com.tienda.service.ICategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
//@RequiredArgsConstructor
public class CategoriaHandler {
    @Autowired
    private ICategoriaService service;

    @Autowired
    private CategoriaMapper categoriaMapper;
    public Mono<ServerResponse> findAll(ServerRequest req){

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.listAll().map(categoria -> categoriaMapper.CategoriaToCategoriaDTO(categoria)), CategoriaDTO.class);
    }

    public Mono<ServerResponse> save(ServerRequest  req){

        Mono<Categoria> categoriaMono = req.bodyToMono(Categoria.class);

        return categoriaMono
                .flatMap( e -> service.save(e))
                .flatMap( e -> ServerResponse
                        .created(URI.create(req.uri().toString().concat("/").concat(String.valueOf(e.getId()))))
                        .body(BodyInserters.fromValue(e))
                );
    }
}
