package br.com.unopar.fisiopar.domains.pessoafisica;

import br.com.unopar.fisiopar.domains.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa_fisica")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class PessoaFisica extends BaseEntity implements Serializable {

    @NotEmpty
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private Genero genero;

    @NotNull
    @Column(name = "estado_civil")
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @NotNull
    @Column(name = "etnia")
    @Enumerated(EnumType.STRING)
    private Etnia etnia;

    @NotEmpty
    @Column(name = "cpf")
    private String cpf;

    @NotEmpty
    @Column(name = "rg")
    private String rg;

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

    @NotEmpty
    @Column(name = "nome_mae")
    private String nomeDaMae;

    @Email
    @NotEmpty
    @Column(name = "email")
    private String email;

    @NotEmpty
    @Digits(fraction = 0, integer = 11)
    @Column(name = "telefone")
    private String telefone;

    public PessoaFisica() {
        super();
        System.out.println("Construtor chamando super 'PessoaFisica'");
    }


    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
