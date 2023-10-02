package com.luzy.tarealuzyback.Repositorio;
import com.luzy.tarealuzyback.Modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface IClientesRepo extends JpaRepository<Clientes,Integer>{
    Clientes findById(long clienteid);
}
