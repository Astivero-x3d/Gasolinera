package com.isma.gasolinera_ismael.service;

import com.isma.gasolinera_ismael.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> findAll();
    Optional<Producto> findById(Integer id);
    Producto save(Producto producto);
    void deleteById(Integer id);
    List<Producto> findByTipo(String tipo);
}
