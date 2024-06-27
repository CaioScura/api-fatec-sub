package br.com.api.fatec.apifatec.domain.transportadora;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.api.fatec.apifatec.entities.Transportadora;

public interface TransportadoraRepository extends JpaRepository<Transportadora, Long> {
}