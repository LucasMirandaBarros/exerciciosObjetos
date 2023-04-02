package com.primeirotrempodev.exerciciosObjetos.service;

import com.primeirotrempodev.exerciciosObjetos.entidade.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {


    public Livro setlivro() {

        Livro livro = new Livro();
        livro.setAutor("Jorge Serrão");
        livro.setTitulo("A Casa de Barro do João de Barro");
        livro.setNumeroDepaginas(600);

        return livro;
    }
    public String getLivro(){

        Integer paginas = setlivro().getNumeroDepaginas();

        if (paginas > 500){
            return "Livro Grosso";
        }
        return getLivro();
    }
}


