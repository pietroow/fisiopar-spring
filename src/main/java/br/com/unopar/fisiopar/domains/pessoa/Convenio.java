package br.com.unopar.fisiopar.domains.pessoa;

public enum Convenio {

    SUS("SUS");

    private String convenio;

    Convenio(String convenio){
        this.convenio = convenio;
    }

    String getConvenio(){
        return convenio;
    }
}
