package br.com.unopar.fisiopar.domains.pessoafisica;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class EnderecoVO {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "logradouro")
    private String logradouro;


    @Column(name = "numero")
    private String numero;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "uf")
    private String uf;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cep")
    private String cep;

    private EnderecoVO() {
        this.id = UUID.randomUUID();
    }

    public EnderecoVO(String logradouro, String numero, String bairro, String uf, String cidade, String complemento, String cep) {
        this();
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.uf = uf;
        this.cidade = cidade;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoVO that = (EnderecoVO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(logradouro, that.logradouro) &&
                Objects.equals(numero, that.numero) &&
                Objects.equals(bairro, that.bairro) &&
                Objects.equals(uf, that.uf) &&
                Objects.equals(cidade, that.cidade) &&
                Objects.equals(complemento, that.complemento) &&
                Objects.equals(cep, that.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logradouro, numero, bairro, uf, cidade, complemento, cep);
    }
}
