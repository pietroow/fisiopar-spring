package br.com.unopar.fisiopar.domains.paciente;

import br.com.unopar.fisiopar.domains.pessoafisica.EnderecoVO;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @PostMapping
    public ResponseEntity cadastrar(@Valid @RequestBody Paciente paciente) {
        paciente.getDocumentos().forEach(documento -> documento.setPessoa(paciente));
        this.pacienteRepository.save(paciente);
        return new ResponseEntity(paciente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Optional<Paciente> findById(@PathVariable("id") UUID id){
        return this.pacienteRepository.findById(id);
    }

    @GetMapping
    public Iterable<Paciente> findAll(){
        return this.pacienteRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remover(@PathVariable("id") UUID id){
        this.pacienteRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public void editar(@PathVariable("id") UUID id,
                       @RequestBody Paciente paciente){
        Optional<Paciente> pacienteRecuperado = this.pacienteRepository.findById(id);
    }


}
