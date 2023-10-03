package com.luzy.tarealuzyback.Servicio;

import com.luzy.tarealuzyback.Modelo.Clientes;
import com.luzy.tarealuzyback.Repositorio.IClientesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServicio implements IClientesServicio {

    @Autowired
    private IClientesRepo repo;

    @Override
    public List<Clientes> ObtenerTodos() {
        return repo.findAll();
    }

    @Override
    public Clientes obtenerClientesPorId(long id) {
        return repo.findById(id);
    }

    @Override
    public Clientes agregarCliente(Clientes cliente) {
        return repo.save(cliente);
    }
}
