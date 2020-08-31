package br.com.unopar.business.domains.pessoafisica;

import br.com.unopar.business.domains.pessoafisica.enums.TelefoneType;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class TelefoneVO {

    @Column(name = "id")
    private UUID id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "ddd")
    private String ddd;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "tipo")
    private TelefoneType telefoneType;

    private TelefoneVO() {
        this.id = UUID.randomUUID();
    }

    public TelefoneVO(String numero, String ddd, TelefoneType telefoneType) {
        this();
        this.numero = numero;
        this.ddd = ddd;
        this.telefoneType = telefoneType;
    }

    public String getNumero() {
        return numero;
    }

    public String getDdd() {
        return ddd;
    }

    public TelefoneType getTelefoneType() {
        return telefoneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefoneVO that = (TelefoneVO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numero, that.numero) &&
                Objects.equals(ddd, that.ddd) &&
                telefoneType == that.telefoneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, ddd, telefoneType);
    }
}
