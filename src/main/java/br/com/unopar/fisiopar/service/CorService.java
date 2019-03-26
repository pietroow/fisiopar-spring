package br.com.unopar.fisiopar.service;

import br.com.unopar.fisiopar.domains.Cor;
import br.com.unopar.fisiopar.repository.CorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CorService {

    @Autowired
    private CorRepository corRepository;

    public Cor create(Cor cor) {
        return corRepository.save(cor);
    }
}
