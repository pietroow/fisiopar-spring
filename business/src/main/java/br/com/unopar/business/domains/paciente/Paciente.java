package br.com.unopar.business.domains.paciente;

import br.com.unopar.business.domains.pessoafisica.PessoaFisica;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paciente", schema = "fisiopar")
@DiscriminatorValue("PACIENTE")
public class Paciente extends PessoaFisica {

    @Column(name = "convenio")
    private String convenio;

    @Column(name = "observacoes")
    private String observacoes;

    public Paciente() {
        super();
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}