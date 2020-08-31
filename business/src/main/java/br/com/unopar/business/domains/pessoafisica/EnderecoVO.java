package br.com.unopar.business.domains.pessoafisica;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class EnderecoVO {

    @ApiModelProperty(hidden = true)
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

    public EnderecoVO(String logradouro,
                      String numero,
                      String bairro,
                      String uf,
                      String cidade,
                      String complemento,
                      String cep) {
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

    public UUID getId() {
        return id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
