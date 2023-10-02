package com.luzy.tarealuzyback.Servicio;
import com.luzy.tarealuzyback.Modelo.Contratos;
import com.luzy.tarealuzyback.Modelo.Facturas;
import com.luzy.tarealuzyback.Repositorio.IFacturasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacturasServicio implements IFacturasServicio {
    @Autowired
    private IFacturasRepo repo;
    @Override
    public List<Facturas> ObtenerTodos() {return repo.findAll();}

    @Override
    public Facturas AgregarFacturas(Facturas facturas) {
        System.out.println(facturas);return repo.saveAndFlush(facturas);
    }
    @Override
    public List<Facturas> findFacturas(Integer contratoid) {
        return repo.findFacturas(contratoid);
    }
}
