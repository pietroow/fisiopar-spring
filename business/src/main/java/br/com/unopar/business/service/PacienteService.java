package br.com.unopar.business.service;

import br.com.unopar.business.domains.paciente.Paciente;
import br.com.unopar.business.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente save(Paciente paciente) {
        paciente.getDocumentos().forEach(documento -> documento.setPessoa(paciente));
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> findById(UUID id) {
        return pacienteRepository.findById(id);
    }

    public Iterable<Paciente> findAll() {
        return this.pacienteRepository.findAll();
    }

    public void deleteById(UUID id) {
        this.pacienteRepository.deleteById(id);
    }
}
