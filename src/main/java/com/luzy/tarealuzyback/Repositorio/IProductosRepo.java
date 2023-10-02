package com.luzy.tarealuzyback.Repositorio;
import com.luzy.tarealuzyback.Modelo.Facturas;
import com.luzy.tarealuzyback.Modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface IProductosRepo extends JpaRepository<Productos,Integer> {
    @Query(value = "SELECT * FROM productos WHERE facturaid =:facturaid ", nativeQuery = true)
    List<Productos> findProductos(@Param("facturaid") Integer facturaid);

}

