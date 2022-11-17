/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.atelier.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.atelier.entity.Venta;
import pe.com.atelier.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaRestController {
    @Autowired
    private VentaService servicio;


    @GetMapping
    public List<Venta> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Venta> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Venta> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public Venta add(@RequestBody Venta v) {
        return servicio.add(v);
    }

    @PutMapping("/{id}")
    public Venta update(@PathVariable Long id, @RequestBody Venta v) {
        v.setCodigo(id);
        return servicio.update(v);
    }
    
    @DeleteMapping("/{id}")
    public Venta delete(@PathVariable Long id) {
        Venta objVenta=new Venta();
        objVenta.setEstado(false);
        return servicio.delete(Venta.builder().codigo(id).build());
    }

}
