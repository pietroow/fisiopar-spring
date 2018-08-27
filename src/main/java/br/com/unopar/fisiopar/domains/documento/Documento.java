package br.com.unopar.fisiopar.domains.documento;

import br.com.unopar.fisiopar.domains.BaseEntity;
import br.com.unopar.fisiopar.domains.pessoafisica.PessoaFisica;
import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "documento")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipo")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cpf.class, name = "CPF"),
        @JsonSubTypes.Type(value = CartaoSus.class, name = "CARTAO_SUS"),
        @JsonSubTypes.Type(value = Rg.class, name = "RG")
})
@ApiModel(subTypes = { Cpf.class, Rg.class, CartaoSus.class }, discriminator = "tipo")
public abstract class Documento extends BaseEntity {

    @Column(name = "value")
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
    private PessoaFisica pessoa;

    public Documento() {
        super();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

    @JsonIgnore
    public PessoaFisica getPessoa() {
        return pessoa;
    }
}

