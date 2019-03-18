package br.com.unopar.fisiopar.domains.paciente;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteRepository extends PagingAndSortingRepository<Paciente, UUID> {
}
