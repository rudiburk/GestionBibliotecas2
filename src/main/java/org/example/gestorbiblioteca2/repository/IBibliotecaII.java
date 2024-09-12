package org.example.gestorbiblioteca2.repository;

import org.example.gestorbiblioteca2.entity.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBibliotecaII extends JpaRepository<Biblioteca, Long> {
}