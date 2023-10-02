package com.luzy.tarealuzyback.Servicio;

import com.luzy.tarealuzyback.Modelo.Productos;
import com.luzy.tarealuzyback.Modelo.Facturas;
import java.util.List;
public interface IProductosServicio {
    List<Productos> ObtenerTodos();

    Productos AgregarProductos(Productos productos);

    List<Productos> findProductos(Integer facturaid);

}
