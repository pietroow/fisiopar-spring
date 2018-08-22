package br.com.unopar.fisiopar.domains.pessoa;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {

    @Embedded
    private EntityId id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula")
    private Long matricula;

    @NotEmpty
    @Column(name = "nome")
    private String nome;

    @NotEmpty
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @NotEmpty
    @Column(name = "sexo")
    private Enum<Sexo> sexoEnum;

    @NotEmpty
    @Column(name = "estado_civil")
    private Enum<EstadoCivil> estadoCivilEnum;

    @NotEmpty
    @Column(name = "etnia")
    private Enum<Etnia> etniaEnum;

    @CPF
    @NotEmpty
    @Column(name = "cpf")
    private String cpf;

    @NotEmpty
    @Column(name = "rg")
    private String rg;

    @NotEmpty
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

    @NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    private Pessoa() {
    }

    public Pessoa(EntityId id,
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
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexoEnum = sexoEnum;
        this.estadoCivilEnum = estadoCivilEnum;
        this.etniaEnum = etniaEnum;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeResponsavel = nomeResponsavel;
        this.nomeDaMae = nomeDaMae;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Enum<Sexo> getSexoEnum() {
        return sexoEnum;
    }

    public Enum<EstadoCivil> getEstadoCivilEnum() {
        return estadoCivilEnum;
    }

    public Enum<Etnia> getEtniaEnum() {
        return etniaEnum;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexoEnum(Enum<Sexo> sexoEnum) {
        this.sexoEnum = sexoEnum;
    }

    public void setEstadoCivilEnum(Enum<EstadoCivil> estadoCivilEnum) {
        this.estadoCivilEnum = estadoCivilEnum;
    }

    public void setEtniaEnum(Enum<Etnia> etniaEnum) {
        this.etniaEnum = etniaEnum;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
