package br.com.unopar.fisiopar.domains.pessoa;

public enum EstadoCivil {

    SOLTEIRO("1"), CASADO("2"), VIUVO("3"), DIVORCIADO("4"), SEPARADO("5");

    private String estadoCivil;

    EstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    String getEstadoCivil(){
        return estadoCivil;
    }
}
