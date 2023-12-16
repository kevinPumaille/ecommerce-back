package com.tienda.service.impl;

import com.tienda.repo.IGenericRepo;
import com.tienda.service.ICRUD;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class CRUDImpl <T,ID> implements ICRUD<T,ID> {

    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public Flux<T> listAll(){
        return getRepo().findAll();
    }

    @Override
    public Mono<T> listById(ID id) {
        return getRepo().findById(id);
    }

    @Override
    public Mono<T> save(T t){
        return getRepo().save(t);
    }

    @Override
    public Mono<T> update(T t){
        return getRepo().save(t);
    }

    @Override
    public Mono<Void> delete(ID id) {
        return getRepo().deleteById(id);
    }
}
