package com.dcbto.estacionamento.repositories;

import com.dcbto.estacionamento.entities.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculos, Long> {
}
