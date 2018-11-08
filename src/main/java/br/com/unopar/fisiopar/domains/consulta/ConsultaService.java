package br.com.unopar.fisiopar.domains.consulta;

import br.com.unopar.fisiopar.domains.fisioterapeuta.Fisioterapeuta;
import br.com.unopar.fisiopar.domains.fisioterapeuta.FisioterapeutaRepository;
import br.com.unopar.fisiopar.domains.paciente.Paciente;
import br.com.unopar.fisiopar.domains.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
