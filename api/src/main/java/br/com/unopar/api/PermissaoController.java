package br.com.unopar.api;

import br.com.unopar.business.domains.Permissao;
import br.com.unopar.business.domains.PermissionVinculate;
import br.com.unopar.business.domains.Usuario;
import br.com.unopar.business.repository.PermissaoRepository;
import br.com.unopar.business.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permissao")
public class PermissaoController {

    @Autowired
    private PermissaoRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Permissao criarPermissao(@RequestBody Permissao permissao) {
        return repository.save(permissao);
    }

    @PostMapping("/permissao")
    public String vincularPermissao(@RequestBody PermissionVinculate permissionVinculate) {
        Usuario usuario = usuarioRepository.findById(permissionVinculate.getIdUsuario()).get();
        Permissao permissao = repository.findById(permissionVinculate.getIdPermissao()).get();
        usuario.getPermissoes().add(permissao);
        usuarioRepository.save(usuario);
        return "Permissao adicionada com sucesso";
    }


}
