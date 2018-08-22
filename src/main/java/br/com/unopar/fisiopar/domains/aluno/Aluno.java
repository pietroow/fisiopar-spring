package br.com.unopar.fisiopar.domains.aluno;

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
@Table(name = "aluno")
public class Aluno extends Pessoa {

    @Column(name = "ra")
    private String ra;

    @Column(name = "curso")
    private String curso;

    @Column(name = "coordenador")
    private String coordenador;

    public Aluno(EntityId id,
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
                endereco);
    }
}
