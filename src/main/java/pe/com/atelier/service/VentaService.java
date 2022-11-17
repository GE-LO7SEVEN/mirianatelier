
package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;
import pe.com.atelier.entity.Venta;

public interface VentaService {
    //funcion para mostrar todos las categorias

    public List< Venta> findAll();
    //funcion para mostrar las categorias habilitados

    public List< Venta> findAllCustom();
    //funcion para buscar un distrito por codigo

    public Optional< Venta> findById(Long id);
    
    //funcion para registrar

    public  Venta add( Venta v);
    //funcion para actualizar

    public  Venta update( Venta v);
    //funcion para eliminar

    public  Venta delete( Venta v);
}
