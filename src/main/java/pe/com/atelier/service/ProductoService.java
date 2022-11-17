
package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;
import pe.com.atelier.entity.Producto;


public interface ProductoService {
    //funcion para mostrar todos las categorias

    public List<Producto> findAll();
    //funcion para mostrar las categorias habilitados

    public List<Producto> findAllCustom();
    //funcion para buscar un distrito por codigo

    public Optional<Producto> findById(Long id);
    
    //funcion para registrar

    public Producto add(Producto p);
    //funcion para actualizar

    public Producto update(Producto p);
    //funcion para eliminar

    public Producto delete(Producto p);

}

    

