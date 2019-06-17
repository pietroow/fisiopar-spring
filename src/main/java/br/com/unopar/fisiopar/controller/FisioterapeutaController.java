package br.com.unopar.fisiopar.controller;

import br.com.unopar.fisiopar.domains.fisioterapeuta.Fisioterapeuta;
import br.com.unopar.fisiopar.service.FisioterapeutaService;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/fisioterapeuta")
public class FisioterapeutaController {

    @Autowired
    private FisioterapeutaService fisioterapeutaService;

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_CADASTRAR_FISIOTERAPEUTA') and #oauth2.hasScope('write')")
    public ResponseEntity cadastrar(@RequestBody Fisioterapeuta fisioterapeuta) {
        Fisioterapeuta fisioterapeutaCriado = this.fisioterapeutaService.save(fisioterapeuta);
        return new ResponseEntity<>(fisioterapeutaCriado, HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_PESQUISAR_FISIOTERAPEUTA') and #oauth2.hasScope('read')")
    @ApiImplicitParam(name = "Authorization", required = true, dataType = "string", paramType = "header")
    public Iterable<Fisioterapeuta> findAll() {
        return this.fisioterapeutaService.findAll();
    }

    @GetMapping("{id}")
    @PreAuthorize("hasAuthority('ROLE_PESQUISAR_FISIOTERAPEUTA') and #oauth2.hasScope('read')")
    public Optional<Fisioterapeuta> findById(@PathVariable("id") UUID id) {
        return this.fisioterapeutaService.findById(id);
    }

    @DeleteMapping("{id}")
    @PreAuthorize("hasAuthority('ROLE_REMOVER_FISIOTERAPEUTA')")
    public ResponseEntity deleteById(@PathVariable("id") UUID id) {
        this.fisioterapeutaService.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    @PreAuthorize("hasAuthority('ROLE_CADASTRAR_FISIOTERAPEUTA') and #oauth2.hasScope('write')")
    public ResponseEntity editar(@PathVariable("id") UUID id,
                                 @RequestBody Fisioterapeuta fisioterapeuta) {
        return this.fisioterapeutaService.update(id, fisioterapeuta);
    }

}
