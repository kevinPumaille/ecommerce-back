package com.tienda.handler;

import com.tienda.dto.ProductoDTO;
import com.tienda.mapper.GeneroMapper;
import com.tienda.mapper.ProductoMapper;
import com.tienda.model.Genero;
import com.tienda.model.Producto;
import com.tienda.service.IGeneroService;
import com.tienda.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component

public class ProductoHandler {

    @Autowired
    private ProductoMapper productoMapper;
    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private IProductoService service;
    @Autowired
    private IGeneroService generoService;
    public Mono<ServerResponse> findAll(ServerRequest req){

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.listAll().map(producto -> productoMapper.productoToProductoDTO(producto)), ProductoDTO.class);
    }

    public Mono<ServerResponse> save(ServerRequest req){

        Mono<Producto> productoMono = req.bodyToMono(Producto.class);

        return productoMono
                .flatMap( e -> service.save(e))
                .flatMap( e -> ServerResponse
                        .created(URI.create(req.uri().toString().concat("/").concat(String.valueOf(e.getId()))))
                        .body(BodyInserters.fromValue(e))
                );
    }
}
