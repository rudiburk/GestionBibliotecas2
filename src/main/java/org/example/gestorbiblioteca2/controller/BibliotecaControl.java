package org.example.gestorbiblioteca2.controller;


import org.example.gestorbiblioteca2.entity.Biblioteca;

import org.example.gestorbiblioteca2.service.IBibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/biblioteca")
public class BibliotecaControl {

    @Autowired
    private IBibliotecaService iBibliotecaService;

    @GetMapping
    public String getAllPatients(Model model) {
        List<Biblioteca> bibliotecas = iBibliotecaService.getAllBibliotecas();
        model.addAttribute("libros", bibliotecas);
        return "bibliotecaii";
    }
}
