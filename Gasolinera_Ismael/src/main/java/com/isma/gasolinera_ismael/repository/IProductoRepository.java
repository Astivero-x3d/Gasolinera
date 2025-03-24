package com.isma.gasolinera_ismael.repository;

import com.isma.gasolinera_ismael.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

    List<Producto> findByTipo(String tipo);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
