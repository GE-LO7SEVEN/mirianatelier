package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;
import pe.com.atelier.entity.Categoria;

public interface CategoriaService {
    //funcion para mostrar todos las categorias

    public List<Categoria> findAll();
    //funcion para mostrar las categorias habilitados

    public List<Categoria> findAllCustom();
    //funcion para buscar un distrito por codigo

    public Optional<Categoria> findById(Long id);
    
    //funcion para registrar

    public Categoria add(Categoria c);
    //funcion para actualizar

    public Categoria update(Categoria c);
    //funcion para eliminar

    public Categoria delete(Categoria c);

}
