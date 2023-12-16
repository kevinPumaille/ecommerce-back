package com.tienda.routes;

import com.tienda.handler.UsuarioHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class UsuarioRouter {

    @Bean
    public RouterFunction<ServerResponse> usuarioRoutes(UsuarioHandler handler){
        return route(GET("/usuarios"),request -> handler.listAll(request))
                .andRoute(POST("/usuarios"),request -> handler.save(request));
    }
}
