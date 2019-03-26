package br.com.unopar.fisiopar.controller;

import br.com.unopar.fisiopar.domains.fisioterapeuta.Fisioterapeuta;
import br.com.unopar.fisiopar.service.FisioterapeutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/fisioterapeuta")
public class FisioterapeutaController {

    @Autowired
    FisioterapeutaService fisioterapeutaService;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Fisioterapeuta fisioterapeuta) {
        Fisioterapeuta fisioterapeutaCriado = this.fisioterapeutaService.save(fisioterapeuta);
        return new ResponseEntity<>(fisioterapeutaCriado, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Fisioterapeuta> findAll() {
        return this.fisioterapeutaService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Fisioterapeuta> findById(@PathVariable("id") UUID id) {
        return this.fisioterapeutaService.findById(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") UUID id) {
        this.fisioterapeutaService.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity editar(@PathVariable("id") UUID id,
                                 @RequestBody Fisioterapeuta fisioterapeuta) {
        return this.fisioterapeutaService.update(id, fisioterapeuta);
    }

}
