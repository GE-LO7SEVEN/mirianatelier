package pe.com.atelier.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.atelier.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long>{
    
    @Query("select v from Venta v where v.estado='1'")
    List<Venta> findAllCustom();
    
}
