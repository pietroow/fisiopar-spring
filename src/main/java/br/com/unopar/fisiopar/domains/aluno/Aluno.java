package br.com.unopar.fisiopar.domains.aluno;

import br.com.unopar.fisiopar.domains.pessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {

    @Column(name = "ra")
    private String ra;

    @Column(name = "curso")
    private String curso;

    @Column(name = "coordenador")
    private String coordenador;

}
