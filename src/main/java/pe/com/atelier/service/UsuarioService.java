package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;

import pe.com.atelier.entity.Usuario;


public interface UsuarioService {
    //funcion para mostrar todos las categorias

    public List<Usuario> findAll();
    //funcion para mostrar las categorias habilitados

    public List<Usuario> findAllCustom();
    //funcion para buscar un distrito por codigo

    public Optional<Usuario> findById(Long id);
    
    //funcion para registrar

    public Usuario add(Usuario u);
    //funcion para actualizar

    public Usuario update(Usuario u);
    //funcion para eliminar

    public Usuario delete(Usuario u);

}

    

