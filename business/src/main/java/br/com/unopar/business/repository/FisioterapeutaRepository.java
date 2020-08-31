package br.com.unopar.business.repository;

import br.com.unopar.business.domains.fisioterapeuta.Fisioterapeuta;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FisioterapeutaRepository extends PagingAndSortingRepository<Fisioterapeuta, UUID> {

}
