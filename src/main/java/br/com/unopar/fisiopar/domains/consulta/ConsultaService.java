package br.com.unopar.fisiopar.domains.consulta;

import br.com.unopar.fisiopar.domains.fisioterapeuta.Fisioterapeuta;
import br.com.unopar.fisiopar.domains.fisioterapeuta.FisioterapeutaRepository;
import br.com.unopar.fisiopar.domains.paciente.Paciente;
import br.com.unopar.fisiopar.domains.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepository consultaRepository;

    @Autowired
    FisioterapeutaRepository fisioterapeutaRepository;

    @Autowired
    PacienteRepository pacienteRepository;

    public Consulta save(Consulta consulta, UUID fisioterapeutaId, UUID pacienteId) {
        Optional<Fisioterapeuta> fisioterapeutaRecuperado = fisioterapeutaRepository.findById(fisioterapeutaId);
        Optional<Paciente> pacienteRecuperado = pacienteRepository.findById(pacienteId);
        consulta.setFisioterapeuta(fisioterapeutaRecuperado.get());
        consulta.setPaciente(pacienteRecuperado.get());
        return this.consultaRepository.save(consulta);
    }

    public Optional<Consulta> findById(UUID id) {
        Optional<Consulta> consultaRecuperada = consultaRepository.findById(id);
        return consultaRecuperada;
    }

    public void deleteById(UUID id) {
        consultaRepository.deleteById(id);
    }

    public Iterable<Consulta> findAll() {
        Iterable<Consulta> consultas = consultaRepository.findAll();
        return consultas;
    }

    public void alterarById(UUID id, Consulta consulta) {
        Optional<Consulta> consultaRecuperada = consultaRepository.findById(id);
        consultaRecuperada.get().setData(consulta.getData());
        consultaRecuperada.get().setDiagnostico(consulta.getDiagnostico());
        consultaRepository.save(consultaRecuperada.get());
    }
}
