package br.com.unopar.fisiopar.domains.pessoafisica.documento;

import br.com.unopar.fisiopar.domains.pessoafisica.PessoaFisica;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "documento", schema = "fisiopar")
public class Documento {

    @Id
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private UUID id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "numero")
    private String numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_fk")
    private PessoaFisica pessoa;

    public Documento() {
        this.id = UUID.randomUUID();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

    @JsonIgnore
    public PessoaFisica getPessoa() {
        return pessoa;
    }

}

