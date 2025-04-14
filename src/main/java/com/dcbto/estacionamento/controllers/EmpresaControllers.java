package com.dcbto.estacionamento.controllers;

import com.dcbto.estacionamento.dto.EmpresasDTO;
import com.dcbto.estacionamento.repositories.EmpresaRepository;
import com.dcbto.estacionamento.services.EmpresaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/empresas")
public class EmpresaControllers {

    @Autowired
    private EmpresaService service;

    @GetMapping("/{id}")
    public ResponseEntity<EmpresasDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<EmpresasDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpresasDTO> update(@PathVariable Long id,@Valid @RequestBody EmpresasDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("")
    public ResponseEntity<EmpresasDTO> insert(@Valid @RequestBody EmpresasDTO dto) {
        dto = service.create(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmpresasDTO> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
