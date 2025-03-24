package com.isma.gasolinera_ismael.service.implementacion;

import com.isma.gasolinera_ismael.model.Producto;
import com.isma.gasolinera_ismael.repository.IProductoRepository;
import com.isma.gasolinera_ismael.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImplementacion implements ProductoService {

    private final IProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImplementacion(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findByTipo(String tipo) {
        return productoRepository.findByTipo(tipo);
    }
}
