package com.luzy.tarealuzyback.Servicio;
import com.luzy.tarealuzyback.Modelo.Facturas;
import com.luzy.tarealuzyback.Modelo.Contratos;
import java.util.List;
public interface IFacturasServicio {
    List<Facturas> ObtenerTodos();

    Facturas AgregarFacturas(Facturas facturas);

    List<Facturas> findFacturas(Integer facturaid);

}