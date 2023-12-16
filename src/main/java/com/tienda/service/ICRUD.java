package com.tienda.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICRUD<T,ID>{

    Mono<T> save(T t);
    Mono<T> update(T t);
    Flux<T> listAll();
    Mono<T> listById(ID id);
    Mono<Void> delete(ID id);

}
