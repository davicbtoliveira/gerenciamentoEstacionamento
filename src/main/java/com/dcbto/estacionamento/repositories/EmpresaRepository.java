package com.dcbto.estacionamento.repositories;

import com.dcbto.estacionamento.entities.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresas, Long> {
}
