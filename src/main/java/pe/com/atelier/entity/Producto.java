package pe.com.atelier.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Entity(name="Producto")
@Table(name="producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="cod_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nombre_prod")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="stock")
    private int stock;
    @Column(name="precio")
    private double preciov;
    @Column(name="estapro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="codcat", nullable = false)
    private Categoria categoria;
    
}
