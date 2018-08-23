package br.com.unopar.fisiopar.domains.pessoafisica;

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

    String getEstadoCivil(){
        return estadoCivil;
    }
}
