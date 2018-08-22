package br.com.unopar.fisiopar.domains.paciente;

import br.com.unopar.fisiopar.domains.pessoa.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente extends Pessoa {

    @Column(name = "convenio")
    private String convenioEnum;

    @Column(name = "cartao_sus")
    private Long cartaoSus;

    @Column(name = "observacoes")
    private String observacoes;


    public Paciente(EntityId id,
                    Long matricula,
                    @NotEmpty String nome,
                    @NotEmpty LocalDate dataNascimento,
                    @NotEmpty Enum<Sexo> sexoEnum,
                    @NotEmpty Enum<EstadoCivil> estadoCivilEnum,
                    @NotEmpty Enum<Etnia> etniaEnum,
                    @CPF @NotEmpty String cpf,
                    @NotEmpty String rg,
                    @NotEmpty String nomeResponsavel,
                    @NotEmpty String nomeDaMae,
                    @Email @NotEmpty String email,
                    @NotEmpty @Digits(fraction = 0, integer = 11) String telefone,
                    @NotEmpty Endereco endereco) {
        super(
                id,
                matricula,
                nome,
                dataNascimento,
                sexoEnum,
                estadoCivilEnum,
                etniaEnum,
                cpf,
                rg,
                nomeResponsavel,
                nomeDaMae,
                email,
                telefone,
                endereco
        );
    }

    public String getConvenioEnum() {
        return convenioEnum;
    }

    public void setConvenioEnum(String convenioEnum) {
        this.convenioEnum = convenioEnum;
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
