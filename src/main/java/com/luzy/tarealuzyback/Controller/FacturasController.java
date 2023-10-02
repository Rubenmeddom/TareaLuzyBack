package com.luzy.tarealuzyback.Controller;
import  com.luzy.tarealuzyback.Modelo.Facturas;
import com.luzy.tarealuzyback.Modelo.Contratos;
import com.luzy.tarealuzyback.Servicio.FacturasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/facturas")

public class FacturasController {
    @Autowired

    private FacturasServicio fs;
    @GetMapping
    public List<Facturas> ObtenerTodos() {return fs.ObtenerTodos();}

    @PostMapping("/agregarFacturas")
    public Facturas AgregarFacturas(@RequestBody Facturas facturas) {
        System.out.println("++++++++++++++" + facturas); return fs.AgregarFacturas(facturas);
    }

    @GetMapping("/contratos/{contratosid}")
    public List<Facturas> findFacturas(@PathVariable Integer contratosid) {
        return fs.findFacturas(contratosid);
    }
}