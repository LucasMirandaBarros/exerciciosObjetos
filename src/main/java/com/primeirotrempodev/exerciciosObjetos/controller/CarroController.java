package com.primeirotrempodev.exerciciosObjetos.controller;

import com.primeirotrempodev.exerciciosObjetos.entidade.Carro;
import com.primeirotrempodev.exerciciosObjetos.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carro-controller")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping("carro")
    public Carro carro(){
    return carroService.carro();

    }
}
