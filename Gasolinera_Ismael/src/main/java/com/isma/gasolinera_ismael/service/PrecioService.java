package com.isma.gasolinera_ismael.service;

import com.isma.gasolinera_ismael.model.Precio;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface PrecioService {
    List<Precio> findAll();
    Optional<Precio> findById(Integer id);
    Precio save(Precio precio);
    void deleteById(Integer id);
    List<Precio> findByProductoIdProducto(Integer idProducto);
    List<Precio> findPreciosVigentes(LocalDate fecha);
}
