package br.com.unopar.fisiopar.domains.pessoafisica;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class TelefoneVO {

    @Id
    @JsonIgnore
    private UUID id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "ddd")
    private String ddd;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "tipo")
    private TelefoneType telefoneType;

    public TelefoneVO() {
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
