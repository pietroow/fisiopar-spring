package br.com.unopar.fisiopar.domains.fisioterapeuta;

import br.com.unopar.fisiopar.domains.pessoafisica.PessoaFisica;

import javax.persistence.*;

@Entity
@Table(name = "fisioterapeuta", schema = "fisiopar")
@DiscriminatorValue("FISIOTERAPEUTA")
public class Fisioterapeuta extends PessoaFisica {

    @Enumerated(EnumType.STRING)
    @Column(name = "especialidade")
    private Especialidade especialidade;

    @Column(name = "crefito")
    private String crefito;

    private Fisioterapeuta() {
        super();
    }

    public String getCrefito() {
        return crefito;
    }

    public void setCrefito(String crefito) {
        this.crefito = crefito;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}

