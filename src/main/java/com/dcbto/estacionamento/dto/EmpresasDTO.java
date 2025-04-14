package com.dcbto.estacionamento.dto;

import com.dcbto.estacionamento.entities.Empresas;

public class EmpresasDTO {

    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private Integer qntVagasMotos;
    private Integer qntVagasCarros;

    public EmpresasDTO(Long id, String nome, String cnpj, String endereco, String telefone, Integer qntVagasMotos, Integer qntVagasCarros) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.qntVagasMotos = qntVagasMotos;
        this.qntVagasCarros = qntVagasCarros;
    }

    public EmpresasDTO(Empresas entity) {
        id = entity.getId();
        nome = entity.getNome();
        cnpj = entity.getCnpj();
        endereco = entity.getCnpj();
        telefone = entity.getTelefone();
        qntVagasMotos = entity.getQntVagasMotos();
        qntVagasCarros = entity.getQntVagasCarros();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Integer getQntVagasMotos() {
        return qntVagasMotos;
    }

    public Integer getQntVagasCarros() {
        return qntVagasCarros;
    }
}
