package com.primeirotrempodev.exerciciosObjetos.service;

import org.springframework.stereotype.Service;

@Service
public class RetanguloService {

    public String areaEPerimetro(){

        Double altura = 10.2;
        Double base = 5.0;

        Double perimetro = 2 * (altura + base);
        Double area = base * altura;

        return "Área: " + area + '\n' + "Perímetro: " + perimetro;


    }
}
