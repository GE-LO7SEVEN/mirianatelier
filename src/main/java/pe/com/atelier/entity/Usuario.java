/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.atelier.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Usuario")
@Table(name="usuario")

public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="cod_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nombre_usuario")
    private String nombre;
    @Column(name="email")
    private String email;
    @Column(name="contrasena")
    private String contrasena;
    @Column(name="rol")
    private String rol;
    @Column(name="estausu")
    private boolean estado;
    
    
}

