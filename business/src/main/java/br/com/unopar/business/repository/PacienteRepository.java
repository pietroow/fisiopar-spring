package br.com.unopar.business.repository;

import br.com.unopar.business.domains.paciente.Paciente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteRepository extends PagingAndSortingRepository<Paciente, UUID> {
}
