package br.com.unopar.fisiopar.domains.documento;

import br.com.unopar.fisiopar.domains.pessoafisica.PessoaFisica;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.UUID;

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
@ApiModel(subTypes = {Cpf.class, Rg.class, CartaoSus.class}, discriminator = "tipo")
public abstract class Documento {

    @Id
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private UUID id;

    @Column(name = "numero")
    private String numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
    private PessoaFisica pessoa;

    public Documento() {
        this.id = UUID.randomUUID();
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

