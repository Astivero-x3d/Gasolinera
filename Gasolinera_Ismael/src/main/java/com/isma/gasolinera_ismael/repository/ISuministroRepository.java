package com.isma.gasolinera_ismael.repository;

import com.isma.gasolinera_ismael.model.Suministro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ISuministroRepository extends JpaRepository<Suministro, Integer> {

    List<Suministro> findBySurtidorIdSurtidor(Integer idSurtidor);

    List<Suministro> findByProductoIdProducto(Integer idProducto);

    List<Suministro> findByFechaHoraBetween(LocalDateTime desde, LocalDateTime hasta);

    List<Suministro> findByImporteEurosGreaterThan(BigDecimal importe);

    @Query("SELECT SUM(s.volumenLitros) FROM Suministro s WHERE s.surtidor.idSurtidor = :idSurtidor AND s.fechaHora BETWEEN :desde AND :hasta")
    BigDecimal calcularTotalLitrosPorSurtidor(@Param("idSurtidor") Integer idSurtidor, @Param("desde") LocalDateTime desde, @Param("hasta") LocalDateTime hasta);

    @Query("SELECT SUM(s.importeEuros) FROM Suministro s WHERE s.surtidor.idSurtidor = :idSurtidor AND s.fechaHora BETWEEN :desde AND :hasta")
    BigDecimal calcularTotalEurosPorSurtidor(@Param("idSurtidor") Integer idSurtidor, @Param("desde") LocalDateTime desde, @Param("hasta") LocalDateTime hasta);
}
