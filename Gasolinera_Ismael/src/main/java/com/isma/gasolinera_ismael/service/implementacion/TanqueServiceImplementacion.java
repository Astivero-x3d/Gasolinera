package com.isma.gasolinera_ismael.service.implementacion;

import com.isma.gasolinera_ismael.model.Tanque;
import com.isma.gasolinera_ismael.repository.ITanqueRepository;
import com.isma.gasolinera_ismael.service.TanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TanqueServiceImplementacion implements TanqueService {
    private final ITanqueRepository tanqueRepository;

    @Autowired
    public TanqueServiceImplementacion(ITanqueRepository tanqueRepository) {
        this.tanqueRepository = tanqueRepository;
    }

    @Override
    public List<Tanque> findAll() {
        return tanqueRepository.findAll();
    }

    @Override
    public Optional<Tanque> findById(Integer id) {
        return tanqueRepository.findById(id);
    }

    @Override
    public Tanque save(Tanque tanque) {
        return tanqueRepository.save(tanque);
    }

    @Override
    public void deleteById(Integer id) {
        tanqueRepository.deleteById(id);
    }

    @Override
    public List<Tanque> findByProductoIdProducto(Integer idProducto) {
        return tanqueRepository.findByProductoIdProducto(idProducto);
    }

    @Override
    public List<Tanque> findTanquesBajoNivel(int porcentajeMinimo) {
        return tanqueRepository.findTanquesBajoNivel(porcentajeMinimo);
    }
}
