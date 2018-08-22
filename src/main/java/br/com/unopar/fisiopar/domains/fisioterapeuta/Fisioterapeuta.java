package br.com.unopar.fisiopar.domains.fisioterapeuta;

import br.com.unopar.fisiopar.domains.pessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fisioterapeuta")
public class Fisioterapeuta extends Pessoa {

    @Column(name = "especialidade")
    private String especialidade;

    @Column(name = "crefito")
    private String crefito;

}

enum Especialidade {

    ORTOPEDIA("Ortopedia"),
    CARDIOVASCULAR("Cardiovascular"),
    PNEUMOFUNCIONAL("Pneumofuncional"),
    PEDIATRIA("Pediatria"),
    NEUROFUNCIONAL("Neurofuncional"),
    GINECOLOGIA("Ginecologia");

    private String especialidade;

    Especialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    String getEspecialidade() {
        return especialidade;
    }

}
