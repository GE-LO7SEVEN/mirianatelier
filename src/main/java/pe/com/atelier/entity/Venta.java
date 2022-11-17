
package pe.com.atelier.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Venta")
@Table(name="venta")
public class Venta implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="cod_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name = "cod_usuario", nullable = false)
    private Usuario codigoUsuario;
    @ManyToOne
    @JoinColumn(name = "cod_producto", nullable = false)
    private Producto codigoProducto;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="fecha")
    private String  fecha;
    @Column(name="estaventa")
    private boolean estado;
}
