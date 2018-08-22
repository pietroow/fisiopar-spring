package br.com.unopar.fisiopar.domains.pessoa;

public enum Sexo {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    String getSexo() {
        return sexo;
    }
}
