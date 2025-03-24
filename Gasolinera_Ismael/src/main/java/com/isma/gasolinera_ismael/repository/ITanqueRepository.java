package com.isma.gasolinera_ismael.repository;

import com.isma.gasolinera_ismael.model.Tanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ITanqueRepository extends JpaRepository<Tanque, Integer>{

    List<Tanque> findByProductoIdProducto(Integer idProducto);

    Tanque findByCodigo(String codigo);

    @Query("SELECT t FROM Tanque t WHERE (t.nivelActual / t.capacidadMaxima) * 100 < :porcentajeMinimo")
    List<Tanque> findTanquesBajoNivel(@Param("porcentajeMinimo") int porcentajeMinimo);

    @Query("SELECT (t.nivelActual / t.capacidadMaxima) * 100 FROM Tanque t WHERE t.idTanque = :idTanque")
    Double calcularPorcentajeLlenado(@Param("idTanque") Integer idTanque);

}
