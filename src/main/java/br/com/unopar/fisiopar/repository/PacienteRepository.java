package br.com.unopar.fisiopar.repository;

import br.com.unopar.fisiopar.domains.paciente.Paciente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteRepository extends PagingAndSortingRepository<Paciente, UUID> {
}
