package com.tienda.service.impl;

import com.tienda.model.Producto;
import com.tienda.repo.IGenericRepo;
import com.tienda.repo.IProductoRepo;
import com.tienda.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class ProductoServiceImpl extends CRUDImpl<Producto,Integer> implements IProductoService {
    @Autowired
    private IProductoRepo repo;

    @Override
    protected IGenericRepo<Producto, Integer> getRepo() {
        return repo;
    }
}
