package com.dcbto.estacionamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_empresas")
public class Empresas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private Integer qntVagasMotos;
    private Integer qntVagasCarros;

    public Empresas() {
    }

    public Empresas(Long id, String nome, String cnpj, String endereco, String telefone, Integer qntVagasMotos, Integer qntVagasCarros) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.qntVagasMotos = qntVagasMotos;
        this.qntVagasCarros = qntVagasCarros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getQntVagasMotos() {
        return qntVagasMotos;
    }

    public void setQntVagasMotos(Integer qntVagasMotos) {
        this.qntVagasMotos = qntVagasMotos;
    }

    public Integer getQntVagasCarros() {
        return qntVagasCarros;
    }

    public void setQntVagasCarros(Integer qntVagasCarros) {
        this.qntVagasCarros = qntVagasCarros;
    }
}

