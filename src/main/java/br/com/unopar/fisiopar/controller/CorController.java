package br.com.unopar.fisiopar.controller;

import br.com.unopar.fisiopar.domains.Cor;
import br.com.unopar.fisiopar.service.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/cor")
public class CorController {

    @Autowired
    private CorService corService;

    @PostMapping
    public Cor create(@RequestBody Cor cor){
        return corService.create(cor);
    }

    @GetMapping
    public List<Cor> findAll(){
        return corService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cor> findById(@PathVariable("id") UUID id){
        return corService.findById(id);
    }

    @DeleteMapping("{/id}")
    public void deleteById(@PathVariable("id")UUID id){
        corService.deleteById(id);
    }
}
