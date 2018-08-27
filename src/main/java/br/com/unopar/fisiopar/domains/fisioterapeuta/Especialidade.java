package br.com.unopar.fisiopar.domains.fisioterapeuta;

import br.com.unopar.fisiopar.domains.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fisioterapeuta_especialidade")
public class Especialidade extends BaseEntity {
//
//    @NotNull
//    @Column(name = "descricao")
//    private String descricao;

}


//
//enum Especialidade {
//
//    ORTOPEDIA("Ortopedia"),
//    CARDIOVASCULAR("Cardiovascular"),
//    PNEUMOFUNCIONAL("Pneumofuncional"),
//    PEDIATRIA("Pediatria"),
//    NEUROFUNCIONAL("Neurofuncional"),
//    GINECOLOGIA("Ginecologia");
//
//    private String especialidade;
//
//    Especialidade(String especialidade) {
//        this.especialidade = especialidade;
//    }
//
//    String getEspecialidade() {
//        return especialidade;
//    }
//
//}
