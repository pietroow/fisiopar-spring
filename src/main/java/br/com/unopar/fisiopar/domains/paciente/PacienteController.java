package br.com.unopar.fisiopar.domains.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @PostMapping
    public ResponseEntity criar(@RequestBody Paciente paciente) {
        this.pacienteRepository.save(paciente);
        return new ResponseEntity(paciente, HttpStatus.CREATED);
    }

}
