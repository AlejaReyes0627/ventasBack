package com.ventas.ventas.repository;

import com.ventas.ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRpository extends JpaRepository<Venta,Integer> {
}
