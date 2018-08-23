package br.com.unopar.fisiopar.domains.aluno;

import br.com.unopar.fisiopar.domains.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso extends BaseEntity {

    @Column(name = "nome")
    private String nome;

    private Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
