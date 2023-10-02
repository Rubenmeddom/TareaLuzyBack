package com.luzy.tarealuzyback.Servicio;
import com.luzy.tarealuzyback.Modelo.Clientes;

import java.util.List;
public interface IClientesServicio {
    List<Clientes> ObtenerTodos();
    Clientes obtenerClientesPorId(long id);

}
