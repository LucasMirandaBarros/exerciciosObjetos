package com.primeirotrempodev.exerciciosObjetos.service;

import com.primeirotrempodev.exerciciosObjetos.entidade.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {



    public Pessoa pegarPessoa(){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João da Silva");
        pessoa.setIdade(20);
        pessoa.setAltura(1.80);

        return pessoa;
    }



}
