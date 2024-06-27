package br.com.api.fatec.apifatec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.api.fatec.apifatec.entities.Transportadora;
import br.com.api.fatec.apifatec.domain.transportadora.TransportadoraService;

@RestController
@RequestMapping("/transportadoras")
public class TransportadoraController {

    @Autowired
    private TransportadoraService service;

    @PostMapping
    public ResponseEntity<Transportadora> create(@RequestBody Transportadora transportadora) {
        Transportadora createdTransportadora = service.create(transportadora);
        return ResponseEntity.ok(createdTransportadora);
    }

    @GetMapping
    public ResponseEntity<List<Transportadora>> findAll() {
        List<Transportadora> transportadoras = service.findAll();
        return ResponseEntity.ok(transportadoras);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transportadora> findById(@PathVariable Long id) {
        Transportadora transportadora = service.findById(id).orElseThrow();
        return ResponseEntity.ok(transportadora);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transportadora> update(@PathVariable Long id, @RequestBody Transportadora transportadora) {
        Transportadora updatedTransportadora = service.update(id, transportadora);
        return ResponseEntity.ok(updatedTransportadora);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
