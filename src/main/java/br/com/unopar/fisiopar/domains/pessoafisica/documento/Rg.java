package br.com.unopar.fisiopar.domains.pessoafisica.documento;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "documento_rg")
@DiscriminatorValue("RG")
public class Rg extends Documento{

    private Rg() {
        super();
    }

}
