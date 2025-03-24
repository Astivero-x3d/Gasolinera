package com.isma.gasolinera_ismael.service.implementacion;

import com.isma.gasolinera_ismael.model.Surtidor;
import com.isma.gasolinera_ismael.repository.ISurtidorRepository;
import com.isma.gasolinera_ismael.service.SurtidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurtidorServiceImplementacion implements SurtidorService{

    private final ISurtidorRepository surtidorRepository;

    @Autowired
    public SurtidorServiceImplementacion(ISurtidorRepository surtidorRepository) {
        this.surtidorRepository = surtidorRepository;
    }

    @Override
    public List<Surtidor> findAll() {
        return surtidorRepository.findAll();
    }

    @Override
    public Optional<Surtidor> findById(Integer id) {
        return surtidorRepository.findById(id);
    }

    @Override
    public Surtidor save(Surtidor surtidor) {
        return surtidorRepository.save(surtidor);
    }

    @Override
    public void deleteById(Integer id) {
        surtidorRepository.deleteById(id);
    }

    @Override
    public List<Surtidor> findByActivoTrue() {
        return surtidorRepository.findByActivoTrue();
    }
}
