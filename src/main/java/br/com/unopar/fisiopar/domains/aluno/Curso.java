package br.com.unopar.fisiopar.domains.aluno;

import br.com.unopar.fisiopar.domains.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "aluno_curso")
public class Curso extends BaseEntity {

    @NotNull
    @Column(name = "nome")
    private String nome;

    private Curso() {
        System.out.println("Construtor vazio 'Curso'");
    }

    public Curso(@NotNull String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
