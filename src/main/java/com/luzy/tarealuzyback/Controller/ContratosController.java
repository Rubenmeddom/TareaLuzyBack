package com.luzy.tarealuzyback.Controller;
import  com.luzy.tarealuzyback.Modelo.Clientes;
import com.luzy.tarealuzyback.Modelo.Contratos;
import com.luzy.tarealuzyback.Servicio.ContratosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/contratos")

public class ContratosController  {
    @Autowired

    private ContratosServicio Cs;
    @GetMapping
    public List<Contratos> ObtenerTodos() {return Cs.ObtenerTodos();}

    @PostMapping("/agregarContratos")
    public Contratos AgregarContratos(@RequestBody Contratos contratos) {
        System.out.println("++++++++++++++" + contratos); return Cs.AgregarContratos(contratos);
    }

    @GetMapping("/clientes/{clienteid}")
    public List<Contratos> findContratos(@PathVariable Integer clienteid) {
        return Cs.findContratos(clienteid);
    }
}