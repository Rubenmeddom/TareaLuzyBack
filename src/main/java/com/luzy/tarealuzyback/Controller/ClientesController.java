package com.luzy.tarealuzyback.Controller;

import com.luzy.tarealuzyback.Modelo.Clientes;
import com.luzy.tarealuzyback.Servicio.ClientesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesServicio cs;

    @GetMapping
    public List<Clientes> ObtenerTodos() {
        return cs.ObtenerTodos();
    }

    @GetMapping("/{clienteid}")
    public Clientes obtenerPeliculaPorId(@PathVariable long clienteid) {
        return cs.obtenerClientesPorId(clienteid);
    }

    @PostMapping("/agregarCliente")
    public Clientes agregarCliente(@RequestBody Clientes cliente) {
        return cs.agregarCliente(cliente);
    }
}
