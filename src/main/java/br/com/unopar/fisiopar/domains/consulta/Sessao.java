package br.com.unopar.fisiopar.domains.consulta;

import java.time.LocalDateTime;

public class Sessao {

    private Integer id;
    private Consulta consulta;
    private LocalDateTime dataHora;
    private String observação;

    public Sessao(Integer id,
                  Consulta consulta,
                  LocalDateTime dataHora,
                  String observação) {
        this.id = id;
        this.consulta = consulta;
        this.dataHora = LocalDateTime.now();
        this.observação = observação;
    }


}
