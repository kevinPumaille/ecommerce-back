package com.tienda.handler;

import com.tienda.dto.UsuarioDTO;
import com.tienda.mapper.UsuarioMapper;
import com.tienda.model.Usuario;
import com.tienda.service.IUsuarioService;
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
public class UsuarioHandler {
    @Autowired
    private IUsuarioService service;
    @Autowired
    private UsuarioMapper usuarioMapper;

    public Mono<ServerResponse> listAll(ServerRequest req){
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.listAll().map(usuario -> usuarioMapper.UsuarioToUsuarioDTO(usuario)), UsuarioDTO.class);
    }

    public Mono<ServerResponse> save(ServerRequest req){

        Mono<Usuario> monoUsuario = req.bodyToMono(Usuario.class);

        return monoUsuario
                .flatMap( e -> service.save(e))
                .flatMap( p -> ServerResponse
                        .created(URI.create(req.uri().toString().concat("/").concat(String.valueOf(p.getId()))))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(p))
                );
    }
}
