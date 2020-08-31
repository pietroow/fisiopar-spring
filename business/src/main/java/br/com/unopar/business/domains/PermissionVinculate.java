package br.com.unopar.business.domains;

import java.util.UUID;

public class PermissionVinculate {

    private UUID idUsuario;
    private UUID idPermissao;

    public PermissionVinculate() {
    }

    public PermissionVinculate(UUID idUsuario, UUID idPermissao) {
        this.idUsuario = idUsuario;
        this.idPermissao = idPermissao;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public UUID getIdPermissao() {
        return idPermissao;
    }
}
