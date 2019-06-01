package br.com.unopar.fisiopar.repository;

import br.com.unopar.fisiopar.domains.fisioterapeuta.Fisioterapeuta;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FisioterapeutaRepository extends PagingAndSortingRepository<Fisioterapeuta, UUID> {

}
