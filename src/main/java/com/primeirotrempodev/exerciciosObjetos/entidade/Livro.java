package com.primeirotrempodev.exerciciosObjetos.entidade;


public class Livro {

    private String titulo;
    private String autor;
    private Integer numeroDepaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroDepaginas() {
        return numeroDepaginas;
    }

    public void setNumeroDepaginas(Integer numeroDepaginas) {
        this.numeroDepaginas = numeroDepaginas;
    }
}
