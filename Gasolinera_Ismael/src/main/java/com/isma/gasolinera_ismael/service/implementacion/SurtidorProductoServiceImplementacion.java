package com.isma.gasolinera_ismael.service.implementacion;

import com.isma.gasolinera_ismael.model.SurtidorProducto;
import com.isma.gasolinera_ismael.repository.ISurtidorProductoRepository;
import com.isma.gasolinera_ismael.service.SurtidorProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurtidorProductoServiceImplementacion implements SurtidorProductoService{

    private final ISurtidorProductoRepository surtidorProductoRepository;

    @Autowired
    public SurtidorProductoServiceImplementacion(ISurtidorProductoRepository surtidorProductoRepository) {
        this.surtidorProductoRepository = surtidorProductoRepository;
    }

    @Override
    public List<SurtidorProducto> findAll() {
        return surtidorProductoRepository.findAll();
    }

    @Override
    public Optional<SurtidorProducto> findById(Long id) {
        return surtidorProductoRepository.findById(id);
    }

    @Override
    public SurtidorProducto save(SurtidorProducto surtidorProducto) {
        return surtidorProductoRepository.save(surtidorProducto);
    }

    @Override
    public void deleteById(Long id) {
        surtidorProductoRepository.deleteById(id);
    }

    @Override
    public List<SurtidorProducto> findBySurtidorIdSurtidor(Integer idSurtidor) {
        return surtidorProductoRepository.findBySurtidorIdSurtidor(idSurtidor);
    }

    @Override
    public List<SurtidorProducto> findByProductoIdProducto(Integer idProducto) {
        return surtidorProductoRepository.findByProductoIdProducto(idProducto);
    }
}
