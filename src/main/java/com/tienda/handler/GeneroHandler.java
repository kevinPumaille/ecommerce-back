package com.tienda.handler;

import com.tienda.dto.GeneroDTO;
import com.tienda.mapper.GeneroMapper;
import com.tienda.model.Genero;
import com.tienda.service.IGeneroService;
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
public class GeneroHandler {
    @Autowired
    private IGeneroService service;
    @Autowired
    private GeneroMapper generoMapper;

    public Mono<ServerResponse> findAll(ServerRequest req){

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.listAll().map(genero -> generoMapper.generoToGeneroDTO(genero)), GeneroDTO.class);
    }

    public Mono<ServerResponse> save(ServerRequest req){

        Mono<Genero> generoMono = req.bodyToMono(Genero.class);

        return generoMono
                .flatMap( e -> service.save(e))
                .flatMap( e -> ServerResponse
                        .created(URI.create(req.uri().toString().concat("/").concat(String.valueOf(e.getId()))))
                        .body(BodyInserters.fromValue(e))
                );

    }
}
