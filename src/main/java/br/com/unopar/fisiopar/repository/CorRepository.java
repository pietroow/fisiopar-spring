package br.com.unopar.fisiopar.repository;

import br.com.unopar.fisiopar.domains.Cor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CorRepository extends JpaRepository<Cor, UUID> {


}
