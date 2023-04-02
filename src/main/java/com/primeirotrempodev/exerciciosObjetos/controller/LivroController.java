package com.primeirotrempodev.exerciciosObjetos.controller;

import com.primeirotrempodev.exerciciosObjetos.entidade.Livro;
import com.primeirotrempodev.exerciciosObjetos.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro-controller")
public class LivroController {

    @Autowired
    private LivroService LivroService;

    @GetMapping("/paginas")
    public String livro(){
        return LivroService.getLivro();
    }

    @GetMapping("/livro")
    public Livro paginas(){
        return LivroService.setlivro();
    }
}

