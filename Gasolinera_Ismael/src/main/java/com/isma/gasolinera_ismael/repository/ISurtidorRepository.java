package com.isma.gasolinera_ismael.repository;

import com.isma.gasolinera_ismael.model.Surtidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ISurtidorRepository extends JpaRepository<Surtidor, Integer> {

    List<Surtidor> findByActivoTrue();

    Surtidor findByCodigo(String codigo);
}
