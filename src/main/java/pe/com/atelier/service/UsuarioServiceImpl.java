package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.atelier.entity.Usuario;
import pe.com.atelier.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository repositorio;

    @Override
    public List<Usuario> findAll() {
        return repositorio.findAll();
    }
    @Override
    public List<Usuario> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return repositorio.findById(id);
    }


    @Override
    public Usuario add(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario update(Usuario u) {
        Usuario objusuario = repositorio.getById(u.getCodigo());
        BeanUtils.copyProperties(u, objusuario);
        return repositorio.save(objusuario);
    }

    @Override
    public Usuario delete(Usuario u) {
        Usuario objusuario = repositorio.getById(u.getCodigo());
        objusuario.setEstado(false);
        return repositorio.save(objusuario);
    }

    

}

    

