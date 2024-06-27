package br.com.api.fatec.apifatec.domain.transportadora;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.fatec.apifatec.entities.Transportadora;
import br.com.api.fatec.apifatec.domain.transportadora.TransportadoraRepository;

@Service
public class TransportadoraService {

    @Autowired
    private TransportadoraRepository repository;

    public Transportadora create(Transportadora transportadora) {
        return repository.save(transportadora);
    }

    public List<Transportadora> findAll() {
        return repository.findAll();
    }

    public Optional<Transportadora> findById(Long id) {
        return repository.findById(id);
    }

    public Transportadora update(Long id, Transportadora transportadora) {
        Transportadora existingTransportadora = repository.findById(id).orElseThrow();
        existingTransportadora.setNome(transportadora.getNome());
        existingTransportadora.setTelefone(transportadora.getTelefone());
        return repository.save(existingTransportadora);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

