package br.com.unopar.fisiopar.domains.consulta;

import br.com.unopar.fisiopar.domains.fisioterapeuta.Fisioterapeuta;
import br.com.unopar.fisiopar.domains.paciente.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private UUID id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fisioterapeuta_id")
    @ApiModelProperty(hidden = true)
    private Fisioterapeuta fisioterapeuta;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "paciente_id")
    @ApiModelProperty(hidden = true)
    private Paciente paciente;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_consulta")
    private LocalDate data;

    @NotNull
    @Column(name = "diagnostico")
    private String diagnostico;

    private Consulta (){
        id = UUID.randomUUID();
        data = LocalDate.now();
    }

    public Consulta(Fisioterapeuta fisioterapeuta, Paciente paciente, String diagnostico) {
        this();
        this.fisioterapeuta = fisioterapeuta;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Fisioterapeuta getFisioterapeuta() {
        return fisioterapeuta;
    }

    public void setFisioterapeuta(Fisioterapeuta fisioterapeuta) {
        this.fisioterapeuta = fisioterapeuta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
