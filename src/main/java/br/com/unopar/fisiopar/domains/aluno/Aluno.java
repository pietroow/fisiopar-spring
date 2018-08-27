package br.com.unopar.fisiopar.domains.aluno;

import br.com.unopar.fisiopar.domains.pessoafisica.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends PessoaFisica {

    @Column(name = "ra")
    private String ra;

    @Column(name = "coordenador")
    private String coordenador;

    private Aluno() {
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
}
