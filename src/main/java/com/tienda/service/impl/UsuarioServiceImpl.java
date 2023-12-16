package com.tienda.service.impl;

import com.tienda.model.Usuario;
import com.tienda.repo.IGenericRepo;
import com.tienda.repo.IUsuarioRepo;
import com.tienda.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class UsuarioServiceImpl extends CRUDImpl<Usuario,Integer> implements IUsuarioService {
    @Autowired
    private IUsuarioRepo repo;

    @Override
    protected IGenericRepo<Usuario, Integer> getRepo() {
        return repo;
    }
}
