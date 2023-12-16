package com.tienda.routes;

import com.tienda.handler.ProductoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ProductoRouter {

    @Bean
    public RouterFunction<ServerResponse> productoRoutes(ProductoHandler handler){
        return route(GET("/productos"), request -> handler.findAll(request))
                .andRoute(POST("/productos"), request -> handler.save(request));
    }
}
