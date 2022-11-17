package pe.com.atelier.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.atelier.entity.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    @Query("select u from Usuario u where u.estado='1'")
    List<Usuario> findAllCustom();
    
}
