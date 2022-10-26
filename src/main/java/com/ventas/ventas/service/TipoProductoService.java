package com.ventas.ventas.service;

import com.ventas.ventas.model.TipoProducto;
import com.ventas.ventas.repository.ITipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TipoProductoService implements ICrudService<TipoProducto>{

    @Autowired
    private ITipoProductoRepository tipoProductoRepository;

    @Override
    public List<TipoProducto> findAll() {
        return tipoProductoRepository.findAll();
    }

    @Override
    public Optional<TipoProducto> findById(Integer id) {
        return tipoProductoRepository.findById(id);
    }

    @Override
    public TipoProducto create(TipoProducto model) {
        return tipoProductoRepository.save(model);
    }

    @Override
    public TipoProducto update(TipoProducto model) {
        return tipoProductoRepository.save(model);
    }

    @Override
    public void delete(Integer id) {
        tipoProductoRepository.deleteById(id);
    }
}
