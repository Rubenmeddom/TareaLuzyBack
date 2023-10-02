package com.luzy.tarealuzyback.Servicio;

import com.luzy.tarealuzyback.Modelo.Contratos;
import com.luzy.tarealuzyback.Modelo.Clientes;
import com.luzy.tarealuzyback.Repositorio.IContratosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ContratosServicio  implements IContratosServicio {
    @Autowired
    private IContratosRepo repo;

    @Override
    public List<Contratos> ObtenerTodos() {return repo.findAll();}

    @Override
    public Contratos AgregarContratos(Contratos contratos) {
        System.out.println(contratos);return repo.saveAndFlush(contratos);
    }

    @Override
    public List<Contratos> findContratos(Integer clienteid) {
        return repo.findContratos(clienteid);
    }

}
