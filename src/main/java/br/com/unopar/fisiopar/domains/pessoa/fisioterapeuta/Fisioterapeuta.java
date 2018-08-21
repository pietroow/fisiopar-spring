package br.com.unopar.fisiopar.domains.pessoa.fisioterapeuta;

import br.com.unopar.fisiopar.domains.pessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fisioterapeuta")
public class Fisioterapeuta extends Pessoa {

    @Column(name = "especialidade")
    private Enum<Especialidade> especialidade;

    @Column(name = "crefito")
    private String crefito;


}
