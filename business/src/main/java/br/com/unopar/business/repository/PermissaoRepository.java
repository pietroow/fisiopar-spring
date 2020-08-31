package br.com.unopar.business.repository;

import br.com.unopar.business.domains.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissaoRepository extends JpaRepository<Permissao, UUID> {
}
