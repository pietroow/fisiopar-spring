package br.com.unopar.fisiopar.domains.pessoafisica;

public enum Genero {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String sexo;

    Genero(String sexo) {
        this.sexo = sexo;
    }

    String getSexo() {
        return sexo;
    }
}
