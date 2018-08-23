package br.com.unopar.fisiopar.domains.fisioterapeuta;

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
@Table(name = "fisioterapeuta")
@DiscriminatorValue("FISIOTERAPEUTA")
public class Fisioterapeuta extends PessoaFisica {

    @Column(name = "especialidade")
    private String especialidade;

    @Column(name = "crefito")
    private String crefito;

    private Fisioterapeuta() {
    }

    public Fisioterapeuta(@NotEmpty String nome,
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
                          String especialidade,
                          String crefito) {
        super(
                nome,
                dataNascimento,
                genero,
                estadoCivil,
                etnia,
                cpf,
                rg,
                nomeResponsavel,
                nomeDaMae,
                email,
                telefone);
        this.especialidade = especialidade;
        this.crefito = crefito;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrefito() {
        return crefito;
    }

    public void setCrefito(String crefito) {
        this.crefito = crefito;
    }
}


//
//enum Especialidade {
//
//    ORTOPEDIA("Ortopedia"),
//    CARDIOVASCULAR("Cardiovascular"),
//    PNEUMOFUNCIONAL("Pneumofuncional"),
//    PEDIATRIA("Pediatria"),
//    NEUROFUNCIONAL("Neurofuncional"),
//    GINECOLOGIA("Ginecologia");
//
//    private String especialidade;
//
//    Especialidade(String especialidade) {
//        this.especialidade = especialidade;
//    }
//
//    String getEspecialidade() {
//        return especialidade;
//    }
//
//}
