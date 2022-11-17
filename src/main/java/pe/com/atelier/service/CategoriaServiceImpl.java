package pe.com.atelier.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.atelier.entity.Categoria;
import pe.com.atelier.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    @Override
    public List<Categoria> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return repositorio.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objcategoria = repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategoria);
        return repositorio.save(objcategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objcategoria = repositorio.getById(c.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }

}
