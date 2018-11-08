package br.com.unopar.fisiopar.domains.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
