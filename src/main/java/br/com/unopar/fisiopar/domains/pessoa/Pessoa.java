package br.com.unopar.fisiopar.domains.pessoa;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Pessoa {

    @Id
    private UUID id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula")
    private Long matricula;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "sexo")
    private Enum<Sexo> sexoEnum;

    @Column(name = "estado_civil")
    private Enum<EstadoCivil> estadoCivilEnum;

    @Column(name = "etnia")
    private Enum<Etnia> etniaEnum;

    @CPF
    @Column(name = "cpf")
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

    @Column(name = "nome_mae")
    private String nomeDaMae;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "cartao_sus")
    private Long cartaoSus;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "telefone", joinColumns = @JoinColumn(name = "telefone_id"))
    private Telefone telefone;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "endereco", joinColumns = @JoinColumn(name = "endereco_id"))
    private Endereco endereco;


}
