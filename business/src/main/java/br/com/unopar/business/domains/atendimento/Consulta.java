//package br.com.unopar.business.domains.atendimento;
//
//import br.com.unopar.business.domains.fisioterapeuta.Fisioterapeuta;
//import br.com.unopar.business.domains.paciente.Paciente;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.UUID;
//
//@Entity
//@Table(name = "consulta")
//public class Consulta {
//
//    @Id
//    private UUID id;
//
//    @Column(name = "dia_hora_consulta")
//    private LocalDateTime dataHoraConsulta;
//
//    @ManyToOne
//    private Paciente paciente;
//
//    @ManyToOne
//    private Fisioterapeuta fisioterapeuta;
//
//    @OneToMany
//    private List<Sessao> sessoes;
//
//}
