package br.com.unopar.fisiopar.domains.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;


    private Paciente transformarDTOEmPaciente(PacienteDTO pacienteDTO) {
        return repository.save(Paciente.createWith(pacienteDTO));
    }

}
