package br.com.unopar.fisiopar.domains.pessoafisica;

import br.com.unopar.fisiopar.domains.pessoafisica.documento.Documento;
import br.com.unopar.fisiopar.domains.pessoafisica.enums.EstadoCivil;
import br.com.unopar.fisiopar.domains.pessoafisica.enums.Etnia;
import br.com.unopar.fisiopar.domains.pessoafisica.enums.Genero;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Sets;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "pessoa_fisica", schema = "fisiopar")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class PessoaFisica {

    @Id
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private UUID id;

    @NotEmpty
    @Column(name = "nome")
    private String nome;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
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

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

    @NotEmpty
    @Column(name = "nome_mae")
    private String nomeDaMae;

    @Email
    @NotEmpty
    @Column(name = "email")
    private String email;

    @CollectionTable(joinColumns = @JoinColumn(name = "pessoa_id"), name = "endereco", schema = "fisiopar")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<EnderecoVO> enderecos;

    @CollectionTable(joinColumns = @JoinColumn(name = "pessoa_id"), name = "telefone", schema = "fisiopar")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<TelefoneVO> telefones;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Set<Documento> documentos;

    public PessoaFisica() {
        this.id = UUID.randomUUID();
        this.enderecos = Sets.newHashSet();
        this.telefones = Sets.newHashSet();
        this.documentos = Sets.newHashSet();
    }

    public UUID getId() {
        return id;
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

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public String getEmail() {
        return email;
    }

    public Set<EnderecoVO> getEnderecos() {
        return Collections.unmodifiableSet(enderecos);
    }

    public Set<TelefoneVO> getTelefones() {
        return Collections.unmodifiableSet(telefones);
    }

    public Set<Documento> getDocumentos(){ return Collections.unmodifiableSet(documentos); }

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

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnderecos(Set<EnderecoVO> enderecos) {
        this.enderecos = enderecos;
    }

    public void setTelefones(Set<TelefoneVO> telefones) {
        this.telefones = telefones;
    }

    public void setDocumentos(Set<Documento> documentos){ this.documentos = documentos; }

}