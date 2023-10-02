package com.luzy.tarealuzyback.Repositorio;
import com.luzy.tarealuzyback.Modelo.Facturas;
import com.luzy.tarealuzyback.Modelo.Contratos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface IFacturasRepo extends JpaRepository<Facturas,Integer> {
    @Query(value = "SELECT * FROM facturas WHERE contratoid =:contratoid ", nativeQuery = true)
    List<Facturas> findFacturas(@Param("contratoid") Integer contratoid);

}
