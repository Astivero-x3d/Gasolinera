package com.isma.gasolinera_ismael.service;

import com.isma.gasolinera_ismael.model.Surtidor;

import java.util.List;
import java.util.Optional;

public interface SurtidorService {
    List<Surtidor> findAll();
    Optional<Surtidor> findById(Integer id);
    Surtidor save(Surtidor surtidor);
    void deleteById(Integer id);
    List<Surtidor> findByActivoTrue();
}
