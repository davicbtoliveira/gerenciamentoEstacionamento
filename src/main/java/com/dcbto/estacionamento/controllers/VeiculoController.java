package com.dcbto.estacionamento.controllers;

import com.dcbto.estacionamento.dto.VeiculosDTO;
import com.dcbto.estacionamento.services.VeiculosService;
import jakarta.servlet.ServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculosService service;

    @GetMapping("/{id}")
    public ResponseEntity<VeiculosDTO> findById(@PathVariable Long id, ServletResponse servletResponse) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @GetMapping("")
    public ResponseEntity<Page<VeiculosDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @PostMapping("")
    public ResponseEntity<VeiculosDTO> insert(@Valid @RequestBody VeiculosDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri()
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VeiculosDTO> update(@PathVariable Long id,@Valid @RequestBody VeiculosDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<VeiculosDTO> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
