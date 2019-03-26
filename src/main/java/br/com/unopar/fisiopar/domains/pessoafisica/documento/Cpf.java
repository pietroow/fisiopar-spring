package br.com.unopar.fisiopar.domains.pessoafisica.documento;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "documento_cpf")
@DiscriminatorValue("CPF")
public class Cpf extends Documento {

    public Cpf() {
        super();
    }

    @CPF
    @Override
    public String getNumero() {
        return super.getNumero();
    }
}
