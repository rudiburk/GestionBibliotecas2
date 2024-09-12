package org.example.gestorbiblioteca2.service.impl;

import org.example.gestorbiblioteca2.entity.Biblioteca;
import org.example.gestorbiblioteca2.repository.IBibliotecaII;
import org.example.gestorbiblioteca2.service.IBibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bibliotecaimpl")
public class Bibliotecaimpl implements IBibliotecaService {

    @Autowired
    private IBibliotecaII iBibliotecaII;

    @Override
    public Biblioteca getBiblioteca(Long id) {
        return iBibliotecaII.findById(id).orElse(null);
    }

    @Override
    public List<Biblioteca> getAllBibliotecas() {
        return iBibliotecaII.findAll();
    }

    @Override
    public Biblioteca saveBiblioteca(Biblioteca biblioteca) {
        return iBibliotecaII.save(biblioteca);
    }

    @Override
    public Biblioteca UpdateBiblioteca(Biblioteca biblioteca) {
        return iBibliotecaII.save(biblioteca);
    }

    @Override
    public void deleteBiblioteca(Biblioteca biblioteca) {
        iBibliotecaII.delete(biblioteca);
    }

    @Override
    public void deleteBiblioteca(Long id) {
        iBibliotecaII.deleteById(id);
    }
}
