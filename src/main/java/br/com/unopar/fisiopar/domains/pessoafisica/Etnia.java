package br.com.unopar.fisiopar.domains.pessoafisica;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Etnia {

    INDIGENA("Indígena"),
    BRANCO("Branco"),
    PARDO("Pardo"),
    NEGRO("Negro"),
    AMARELO("Amarelo");

    private String etnia;

    Etnia(String etnia){
        this.etnia = etnia;
    }

    @JsonValue
    String getEtnia(){
        return etnia;
    }
}
