package br.com.unopar.fisiopar.domains.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Consulta consulta,
                                    @RequestParam UUID fisioterapeutaId,
                                    @RequestParam UUID pacienteId) {
        Consulta consultaCriada = this.consultaService.save(consulta, fisioterapeutaId, pacienteId);
        return new ResponseEntity<>(consultaCriada, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id")UUID id){
        Optional<Consulta> consultaRecuperada = consultaService.findById(id);
        return new ResponseEntity<>(consultaRecuperada, HttpStatus.OK);
    }

    @GetMapping
    public Iterable<Consulta> findAll(){
        return consultaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")UUID id){
        consultaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterarById(@PathVariable("id")UUID id,
                        @RequestBody Consulta consulta){
        consultaService.alterarById(id, consulta);
    }


}
