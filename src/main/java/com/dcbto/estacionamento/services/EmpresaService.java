package com.dcbto.estacionamento.services;

import com.dcbto.estacionamento.dto.EmpresasDTO;
import com.dcbto.estacionamento.entities.Empresas;
import com.dcbto.estacionamento.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repo;

    @Transactional(readOnly = true)
    public Page<EmpresasDTO> findAll(Pageable pageable) {
        Page<Empresas> result =  repo.findAll(pageable);
        return result.map(x -> new EmpresasDTO(x));
    }

    @Transactional(readOnly = true)
    public EmpresasDTO findById(Long id) {
        Empresas result = repo.getReferenceById(id);
        return new EmpresasDTO(result);
    }

    @Transactional
    public EmpresasDTO create(EmpresasDTO dto) {
        Empresas emp = new Empresas();
        copyDtoToEntity(dto, emp);
        emp = repo.save(emp);
        return new EmpresasDTO(emp);
    }

    @Transactional
    public EmpresasDTO update(Long id, EmpresasDTO dto) {
        Empresas entity = repo.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        entity = repo.save(entity);
        return new EmpresasDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }

    private void copyDtoToEntity(EmpresasDTO dto, Empresas entity) {
        entity.setNome(dto.getNome());
        entity.setCnpj(dto.getCnpj());
        entity.setEndereco(dto.getEndereco());
        entity.setTelefone(dto.getTelefone());
        entity.setQntVagasMotos(dto.getQntVagasMotos());
        entity.setQntVagasCarros(dto.getQntVagasCarros());
    }
}
