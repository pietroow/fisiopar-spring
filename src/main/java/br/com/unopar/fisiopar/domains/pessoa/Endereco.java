package br.com.unopar.fisiopar.domains.pessoa;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

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

}
