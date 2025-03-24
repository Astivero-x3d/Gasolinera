package com.isma.gasolinera_ismael.service.implementacion;

import com.isma.gasolinera_ismael.model.Suministro;
import com.isma.gasolinera_ismael.repository.ISuministroRepository;
import com.isma.gasolinera_ismael.service.SuministroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SuministroServiceImplementacion implements SuministroService {
    private final ISuministroRepository suministroRepository;

    @Autowired
    public SuministroServiceImplementacion(ISuministroRepository suministroRepository) {
        this.suministroRepository = suministroRepository;
    }

    @Override
    public List<Suministro> findAll() {
        return suministroRepository.findAll();
    }

    @Override
    public Optional<Suministro> findById(Integer id) {
        return suministroRepository.findById(id);
    }

    @Override
    public Suministro save(Suministro suministro) {
        return suministroRepository.save(suministro);
    }

    @Override
    public void deleteById(Integer id) {
        suministroRepository.deleteById(id);
    }

    @Override
    public List<Suministro> findBySurtidorIdSurtidor(Integer idSurtidor) {
        return suministroRepository.findBySurtidorIdSurtidor(idSurtidor);
    }

    @Override
    public List<Suministro> findByProductoIdProducto(Integer idProducto) {
        return suministroRepository.findByProductoIdProducto(idProducto);
    }

    @Override
    public List<Suministro> findByFechaHoraBetween(LocalDateTime desde, LocalDateTime hasta) {
        return suministroRepository.findByFechaHoraBetween(desde, hasta);
    }
}
