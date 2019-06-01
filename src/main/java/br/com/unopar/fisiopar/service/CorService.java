package br.com.unopar.fisiopar.service;

import br.com.unopar.fisiopar.domains.Cor;
import br.com.unopar.fisiopar.repository.CorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class CorService {

    @Autowired
    private CorRepository corRepository;

    public Cor create(Cor cor) {
        return corRepository.save(cor);
    }

    public List<Cor> findAll() {
        return corRepository.findAll();
    }

    public Optional<Cor> findById(UUID id) {
        return corRepository.findById(id);
    }

    public void deleteById(UUID id) {
        corRepository.deleteById(id);
    }
}
