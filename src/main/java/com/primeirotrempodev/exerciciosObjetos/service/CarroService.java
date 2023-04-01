package com.primeirotrempodev.exerciciosObjetos.service;

import com.primeirotrempodev.exerciciosObjetos.entidade.Carro;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    public Carro carro(){

        Carro carro = new Carro();
        carro.setMarca("Audi");
        carro.setModelo("A3");
        carro.setAno(2023);

        return carro;


    }
}
