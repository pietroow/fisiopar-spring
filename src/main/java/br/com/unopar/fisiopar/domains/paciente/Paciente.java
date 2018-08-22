package br.com.unopar.fisiopar.domains.paciente;

import br.com.unopar.fisiopar.domains.pessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente extends Pessoa {

    @Column(name = "convenio")
    private String convenioEnum;

    @Column(name = "observacoes")
    private String observacoes;

}
