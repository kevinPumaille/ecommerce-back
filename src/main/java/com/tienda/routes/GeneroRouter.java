package com.tienda.routes;

import com.tienda.handler.GeneroHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GeneroRouter {

    @Bean
    public RouterFunction<ServerResponse> generoRoutes(GeneroHandler handler){
        return route(GET("/generos"),request -> handler.findAll(request))
                .andRoute(POST("/generos"), request -> handler.save(request));
    }
}
