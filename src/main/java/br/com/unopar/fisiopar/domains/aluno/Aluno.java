package br.com.unopar.fisiopar.domains.aluno;

import br.com.unopar.fisiopar.domains.pessoafisica.*;
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
public class Aluno extends PessoaFisica {

    @Column(name = "ra")
    private String ra;

//    @Column(name = "curso")
//    private Curso curso;

    @Column(name = "curso")
    private String curso;

    @Column(name = "coordenador")
    private String coordenador;

    private Aluno() {
    }

    public Aluno(@NotEmpty String nome,
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
                 String ra,
//                 Curso curso,
                 String curso,
                 String coordenador) {
        super(nome, dataNascimento, genero, estadoCivil, etnia, cpf, rg, nomeResponsavel, nomeDaMae, email, telefone);
        this.ra = ra;
        this.curso = curso;
        this.coordenador = coordenador;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
}
