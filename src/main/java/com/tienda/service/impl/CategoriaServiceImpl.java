package com.tienda.service.impl;

import com.tienda.model.Categoria;
import com.tienda.repo.IGenericRepo;
import com.tienda.repo.ICategoriaRepo;
import com.tienda.service.ICategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class CategoriaServiceImpl extends CRUDImpl<Categoria,Integer> implements ICategoriaService {
    @Autowired
    private ICategoriaRepo repo;

    @Override
    protected IGenericRepo<Categoria, Integer> getRepo() {
        return repo;
    }
}
