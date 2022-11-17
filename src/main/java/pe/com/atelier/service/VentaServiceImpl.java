/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.atelier.entity.Venta;
import pe.com.atelier.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService{
    
    @Autowired
    private VentaRepository repositorio;

    @Override
    public List<Venta> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<Venta> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public Optional<Venta> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Venta add(Venta v) {
        return repositorio.save(v);
    }
    
    @Override
    public Venta update(Venta v) {
        Venta objVenta = repositorio.getById(v.getCodigo());
        BeanUtils.copyProperties(v, objVenta);
        return repositorio.save(objVenta);
    }

    @Override
    public Venta delete(Venta v) {
        Venta objVenta = repositorio.getById(v.getCodigo());
        objVenta.setEstado(false);
        return repositorio.save(objVenta);
    }
}
