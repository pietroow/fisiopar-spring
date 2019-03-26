package br.com.unopar.fisiopar.controller;

import br.com.unopar.fisiopar.domains.Cor;
import br.com.unopar.fisiopar.service.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cor")
public class CorController {

    @Autowired
    private CorService corService;

    @PostMapping
    public Cor create(@RequestBody Cor cor){
        return corService.create(cor);
    }
}
