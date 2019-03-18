package br.com.unopar.fisiopar.domains.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Paciente paciente2) {
        Paciente paciente = this.pacienteService.save(paciente2);
        return new ResponseEntity(paciente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Optional<Paciente> findById(@PathVariable("id") UUID id){
        return this.pacienteService.findById(id);
    }

    @GetMapping
    public Iterable<Paciente> findAll(){
        return this.pacienteService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remover(@PathVariable("id") UUID id){
        this.pacienteService.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public void editar(@PathVariable("id") UUID id,
                       @RequestBody Paciente paciente){
        Optional<Paciente> pacienteRecuperado = this.pacienteService.findById(id);
    }

}
