package org.example.gestorbiblioteca2.service;

import org.example.gestorbiblioteca2.entity.Biblioteca;

import java.util.List;

public interface IBibliotecaService {

    Biblioteca getBiblioteca(Long id);
    List<Biblioteca> getAllBibliotecas();
    Biblioteca saveBiblioteca(Biblioteca biblioteca);
    Biblioteca UpdateBiblioteca(Biblioteca biblioteca);
    void deleteBiblioteca(Biblioteca biblioteca);
    void deleteBiblioteca(Long id);
}
