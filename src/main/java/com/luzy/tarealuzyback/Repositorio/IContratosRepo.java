package com.luzy.tarealuzyback.Repositorio;
import com.luzy.tarealuzyback.Modelo.Clientes;
import com.luzy.tarealuzyback.Modelo.Contratos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface IContratosRepo extends JpaRepository<Contratos,Integer> {
    @Query(value = "SELECT * FROM contratos WHERE clienteid =:clienteid ", nativeQuery = true)
    List<Contratos> findContratos(@Param("clienteid") Integer clienteid);
    Contratos save(Contratos contrato);
}
