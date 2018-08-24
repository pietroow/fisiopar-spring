package br.com.unopar.fisiopar.domains.paciente;

import br.com.unopar.fisiopar.domains.pessoafisica.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "paciente")
@DiscriminatorValue("PACIENTE")
public class Paciente extends PessoaFisica {

    @Column(name = "convenio")
    private String convenio;

    @Column(name = "cartao_sus")
    private Long cartaoSus;

    @Column(name = "observacoes")
    private String observacoes;

    private Paciente() {
        super();
        System.out.println("Construtor 'Paciente' chamando super 'PessoaFisica'");
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public Long getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(Long cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
