package com.Carreira.PA_ListaDeSpring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_BOOK")
public class BookModel {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Nome Livro")
    private String titulo;
    @Column(name = "Nome Autor")
    private String autor;
    @Column(name = "Ano de Publicacao do Livro")
    private Integer anoPublicacao;

    public BookModel() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}