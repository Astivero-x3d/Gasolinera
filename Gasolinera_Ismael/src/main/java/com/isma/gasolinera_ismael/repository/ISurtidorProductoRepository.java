package com.isma.gasolinera_ismael.repository;

import com.isma.gasolinera_ismael.model.SurtidorProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ISurtidorProductoRepository extends JpaRepository<SurtidorProducto, Long> {

    List<SurtidorProducto> findBySurtidorIdSurtidor(Integer idSurtidor);

    List<SurtidorProducto> findByProductoIdProducto(Integer idProducto);

    boolean existsBySurtidorIdSurtidorAndProductoIdProducto(Integer idSurtidor, Integer idProducto);

    void deleteBySurtidorIdSurtidorAndProductoIdProducto(Integer idSurtidor, Integer idProducto);

}
