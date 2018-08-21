package br.com.unopar.fisiopar.domains.pessoa.fisioterapeuta;

public enum Especialidade {

    ORTOPEDIA("Ortopedia"),
    CARDIOVASCULAR("Cardiovascular"),
    PNEUMOFUNCIONAL("Pneumofuncional"),
    PEDIATRIA("Pediatria"),
    NEUROFUNCIONAL("Neurofuncional"),
    GINECOLOGIA("Ginecologia");

    private String especialidade;

    Especialidade(String especialidade){
        this.especialidade = especialidade;
    }

    String getEspecialidade(){
        return especialidade;
    }

}
