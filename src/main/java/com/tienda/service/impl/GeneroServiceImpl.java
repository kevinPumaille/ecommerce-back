package com.tienda.service.impl;

import com.tienda.model.Genero;
import com.tienda.repo.IGenericRepo;
import com.tienda.repo.IGeneroRepo;
import com.tienda.service.IGeneroService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class GeneroServiceImpl extends CRUDImpl<Genero,Integer> implements IGeneroService {
    @Autowired
    private IGeneroRepo repo;

    @Override
    protected IGenericRepo<Genero, Integer> getRepo() {
        return repo;
    }
}
