package br.com.unopar.fisiopar.domains.pessoafisica;

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

    String getEtnia(){
        return etnia;
    }
}
