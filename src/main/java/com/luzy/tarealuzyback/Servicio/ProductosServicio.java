package com.luzy.tarealuzyback.Servicio;
import com.luzy.tarealuzyback.Modelo.Productos;
import com.luzy.tarealuzyback.Modelo.Facturas;
import com.luzy.tarealuzyback.Repositorio.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductosServicio implements IProductosServicio {
    @Autowired
    private IProductosRepo repo;
    @Override
    public List<Productos> ObtenerTodos() {return repo.findAll();}

    @Override
    public Productos AgregarProductos(Productos productos) {
        System.out.println(productos);return repo.saveAndFlush(productos);
    }
    @Override
    public List<Productos> findProductos(Integer facturaid) {return repo.findProductos(facturaid);  }
}
