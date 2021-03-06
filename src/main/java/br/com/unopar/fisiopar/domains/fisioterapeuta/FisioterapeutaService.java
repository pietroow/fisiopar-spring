package br.com.unopar.fisiopar.domains.fisioterapeuta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FisioterapeutaService {

    @Autowired
    FisioterapeutaRepository fisioterapeutaRepository;

    public Fisioterapeuta save(Fisioterapeuta fisioterapeuta) {
        fisioterapeuta.getDocumentos().forEach(documento -> documento.setPessoa(fisioterapeuta));
        return this.fisioterapeutaRepository.save(fisioterapeuta);
    }

    public Iterable<Fisioterapeuta> findAll() {
        return this.fisioterapeutaRepository.findAll();
    }

    public Optional<Fisioterapeuta> findById(UUID id) {
        return this.fisioterapeutaRepository.findById(id);
    }

    public void deleteById(UUID id) {
        this.fisioterapeutaRepository.deleteById(id);
    }

    public ResponseEntity update(UUID id, Fisioterapeuta fisioterapeuta) {
        this.fisioterapeutaRepository.save(fisioterapeuta);
        return new ResponseEntity(HttpStatus.OK);
    }
}
