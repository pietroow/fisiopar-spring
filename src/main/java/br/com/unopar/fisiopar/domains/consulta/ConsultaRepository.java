package br.com.unopar.fisiopar.domains.consulta;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaRepository extends PagingAndSortingRepository<Consulta, UUID> {
}
