package br.com.unopar.fisiopar.domains.pessoafisica;

import br.com.unopar.fisiopar.domains.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
@Table(name = "endereco")
public class Endereco extends BaseEntity {

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cep")
    private String CEP;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaFisica pessoaFisica;

    public Endereco() {
    }

    public Endereco(String logradouro,
                    Integer numero,
                    String bairro,
                    String estado,
                    String cidade,
                    String complemento,
                    String CEP,
                    PessoaFisica pessoaFisica) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.complemento = complemento;
        this.CEP = CEP;
        this.pessoaFisica = pessoaFisica;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
