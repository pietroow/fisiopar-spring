package br.com.unopar.fisiopar.domains.pessoafisica;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Genero {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String sexo;

    Genero(String sexo) {
        this.sexo = sexo;
    }

    @JsonValue
    String getSexo() {
        return sexo;
    }
}
