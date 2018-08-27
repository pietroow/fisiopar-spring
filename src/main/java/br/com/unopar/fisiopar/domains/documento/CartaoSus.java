package br.com.unopar.fisiopar.domains.documento;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "documento_cartao_sus")
@DiscriminatorValue("CARTAO_SUS")
public class CartaoSus extends Documento {

    private CartaoSus() {
        super();
    }
}
