package com.Carreira.PA_ListaDeSpring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_Fornecedores")
public class FornecedorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Nome Fantasia Fornecedor")
    private String nomeFantasiaFornecedor;
    @Column(name=" CNPJ Fornecedor")
    private String cnpjFornecedor;
    @Column(name=" Contato Fornecedor")
    private String contatoFornecedor;

    public FornecedorModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasiaFornecedor() {
        return nomeFantasiaFornecedor;
    }

    public void setNomeFantasiaFornecedor(String nomeFantasiaFornecedor) {
        this.nomeFantasiaFornecedor = nomeFantasiaFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        this.contatoFornecedor = contatoFornecedor;
    }
}
