package com.dcbto.estacionamento.dto;

import com.dcbto.estacionamento.entities.Veiculos;

public class VeiculosDTO {

    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String tipo;

    public VeiculosDTO() {
    }

    public VeiculosDTO(Long id, String marca, String modelo, String cor, String placa, String tipo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.tipo = tipo;
    }

    public VeiculosDTO(Veiculos entity) {
        id = entity.getId();
        marca = entity.getMarca();
        modelo = entity.getModelo();
        cor = entity.getCor();
        placa = entity.getPlaca();
        tipo = entity.getTipo();
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }
}
