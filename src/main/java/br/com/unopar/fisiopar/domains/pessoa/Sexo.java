package br.com.unopar.fisiopar.domains.pessoa;

public enum Sexo {

    MASCULINO("M"), FEMININO("F");

    private String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    String getSexo() {
        return sexo;
    }
}
