package com.primeirotrempodev.exerciciosObjetos.controller;

import com.primeirotrempodev.exerciciosObjetos.service.RetanguloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retangulo-controller")
public class RetanguloController {

    @Autowired
    private RetanguloService retanguloService;

    @GetMapping("/retangulo")
    public String retangulo(){
        return retanguloService.areaEPerimetro();

    }
}
