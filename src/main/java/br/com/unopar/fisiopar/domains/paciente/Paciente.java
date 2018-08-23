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
    }

    public Paciente(@NotEmpty String nome,
                    @NotEmpty LocalDate dataNascimento,
                    @NotEmpty Genero genero,
                    @NotEmpty EstadoCivil estadoCivil,
                    @NotEmpty Etnia etnia,
                    @CPF @NotEmpty String cpf,
                    @NotEmpty String rg,
                    @NotEmpty String nomeResponsavel,
                    @NotEmpty String nomeDaMae,
                    @Email @NotEmpty String email,
                    @NotEmpty @Digits(fraction = 0, integer = 11) String telefone,
                    String convenio, Long cartaoSus,
                    String observacoes) {
        super(nome, dataNascimento, genero, estadoCivil, etnia, cpf, rg, nomeResponsavel, nomeDaMae, email, telefone);
        this.convenio = convenio;
        this.cartaoSus = cartaoSus;
        this.observacoes = observacoes;
    }
}
