package com.isma.gasolinera_ismael.repository;

import com.isma.gasolinera_ismael.model.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IPrecioRepository extends JpaRepository<Precio, Integer> {

    List<Precio> findByProductoIdProducto(Integer idProducto);

    @Query("SELECT p FROM Precio p WHERE p.fechaInicio <= :fecha AND (p.fechaFin IS NULL OR p.fechaFin >= :fecha)")
    List<Precio> findPreciosVigentes(@Param("fecha") LocalDate fecha);

    @Query("SELECT p FROM Precio p WHERE p.producto.idProducto = :idProducto AND p.fechaInicio <= :fecha AND (p.fechaFin IS NULL OR p.fechaFin >= :fecha)")
    Optional<Precio> findPrecioVigenteByProducto(@Param("idProducto") Integer idProducto, @Param("fecha") LocalDate fecha);

    @Query("SELECT p FROM Precio p WHERE p.producto.idProducto = :idProducto ORDER BY p.fechaInicio DESC")
    List<Precio> findLastPrecioByProducto(@Param("idProducto") Integer idProducto);
}
