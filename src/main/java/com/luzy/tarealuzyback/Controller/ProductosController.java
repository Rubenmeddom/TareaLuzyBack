package com.luzy.tarealuzyback.Controller;

import com.luzy.tarealuzyback.Modelo.Productos;
import com.luzy.tarealuzyback.Servicio.ProductosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/productos")

public class ProductosController  {
    @Autowired

    private ProductosServicio ps;
    @GetMapping
    public List<Productos> ObtenerTodos() {return ps.ObtenerTodos();}

    @PostMapping("/agregarProductos")
    public Productos AgregarProductos(@RequestBody Productos productos) {
        System.out.println("++++++++++++++" + productos); return ps.AgregarProductos(productos);
    }

    @GetMapping("/facturas/{facturasid}")
    public List<Productos> findProductos(@PathVariable Integer facturasid) {
        return ps.findProductos(facturasid);
    }
}