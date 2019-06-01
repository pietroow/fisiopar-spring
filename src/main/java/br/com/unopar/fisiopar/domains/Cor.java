package br.com.unopar.fisiopar.domains;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
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

    @Column(name= "hexa")
    @Value("0")
    private BigDecimal hexa;

    public Cor() {
        this.id = UUID.randomUUID();
    }
}
