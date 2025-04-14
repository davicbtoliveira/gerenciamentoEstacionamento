package com.dcbto.estacionamento.services;

import com.dcbto.estacionamento.dto.VeiculosDTO;
import com.dcbto.estacionamento.entities.Veiculos;
import com.dcbto.estacionamento.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VeiculosService {

    @Autowired
    private VeiculoRepository repo;

    @Transactional(readOnly = true)
    public Page<VeiculosDTO> findAll(Pageable pageable) {
        Page<Veiculos> result = repo.findAll(pageable);
        return result.map(x -> new VeiculosDTO(x));
    }

    @Transactional(readOnly = true)
    public VeiculosDTO findById(Long id) {
        Veiculos result = repo.getReferenceById(id);
        return new VeiculosDTO(result);
    }

    @Transactional
    public VeiculosDTO insert(VeiculosDTO dto) {
        Veiculos entity = new Veiculos();
        copyDtoToEntity(dto, entity);
        entity = repo.save(entity);
        return new VeiculosDTO(entity);
    }

    @Transactional
    public VeiculosDTO update(Long id, VeiculosDTO dto){
        Veiculos entity = repo.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        entity = repo.save(entity);
        return new VeiculosDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }

    private void copyDtoToEntity(VeiculosDTO dto, Veiculos entity) {
        entity.setCor(dto.getCor());
        entity.setMarca(dto.getMarca());
        entity.setModelo(dto.getModelo());
        entity.setTipo(dto.getTipo());
        entity.setPlaca(dto.getPlaca());
    }
}
