package br.com.unopar.fisiopar.domains.pessoafisica;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EstadoCivil {

    SOLTEIRO("Solteiro(a)"),
    CASADO("Casado(a)"),
    VIUVO("Viuvo(a)"),
    DIVORCIADO("Divorciado(a)"),
    SEPARADO("Separado(a)");

    private String estadoCivil;

    EstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    @JsonValue
    String getEstadoCivil(){
        return estadoCivil;
    }
}
