package com.primeirotrempodev.exerciciosObjetos.controller;

import com.primeirotrempodev.exerciciosObjetos.entidade.Pessoa;
import com.primeirotrempodev.exerciciosObjetos.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa-controller")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/pessoa")
    public Pessoa pessoa(){
        return pessoaService.pegarPessoa();

    }

}
