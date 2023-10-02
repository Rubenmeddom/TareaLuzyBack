package com.luzy.tarealuzyback.Servicio;
import com.luzy.tarealuzyback.Modelo.Contratos;
import com.luzy.tarealuzyback.Modelo.Clientes;
import java.util.List;
public interface IContratosServicio {
    List<Contratos> ObtenerTodos();

    Contratos AgregarContratos(Contratos contratos);

    List<Contratos> findContratos(Integer clienteid);

}

