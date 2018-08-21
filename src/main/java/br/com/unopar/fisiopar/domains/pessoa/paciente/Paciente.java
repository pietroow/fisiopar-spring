package br.com.unopar.fisiopar.domains.pessoa.paciente;

import br.com.unopar.fisiopar.domains.pessoa.Convenio;
import br.com.unopar.fisiopar.domains.pessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente extends Pessoa {

    @Column(name = "convenio")
    private Enum<Convenio> convenioEnum;

    @Column(name = "observacoes")
    private String observacoes;

}
