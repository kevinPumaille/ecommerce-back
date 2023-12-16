package com.tienda.routes;

import com.tienda.handler.CategoriaHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class CategoriaRouter {

    @Bean
    public RouterFunction<ServerResponse> categoriaRoutes(CategoriaHandler handler){
        return route(GET("/categorias"), request -> handler.findAll(request))
                .andRoute(POST("categorias"), request -> handler.save(request));
    }
}
