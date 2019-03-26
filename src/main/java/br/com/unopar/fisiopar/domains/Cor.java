package br.com.unopar.fisiopar.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "cor", schema = "fisiopar")
@Getter @Setter
public class Cor {

    @Id
    private UUID id;

    private String name;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    public Cor() {
        this.id = UUID.randomUUID();
    }
}
