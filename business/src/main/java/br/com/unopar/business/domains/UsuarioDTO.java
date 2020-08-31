package br.com.unopar.business.domains;

import java.util.UUID;

public class UsuarioDTO {

    private UUID id;
    private String nome;
    private String email;

    public UsuarioDTO(UUID id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
