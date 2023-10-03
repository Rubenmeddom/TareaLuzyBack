package com.luzy.tarealuzyback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.luzy.tarealuzyback.Controller.*;
import com.luzy.tarealuzyback.Modelo.*;
import com.luzy.tarealuzyback.Servicio.*;
import com.luzy.tarealuzyback.Repositorio.*;
@SpringBootApplication
public class TareaLuzyBackApplication {

    @Autowired
    private ClientesServicio clientes;

    @Autowired
    private ContratosServicio contratos;

    @Autowired
    private FacturasServicio facturas;

    @Autowired
    private ProductosServicio productos;

    @Autowired
    private ClientesController clientesc;
    @Autowired
    private ContratosController contratosc;
    @Autowired
    private FacturasController facturasc;
    @Autowired
    private ProductosController productosc;

    public static void main(String[] args) {
        SpringApplication.run(TareaLuzyBackApplication.class, args);
    }


}
