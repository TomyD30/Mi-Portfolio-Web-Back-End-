/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter 
@Setter
@Entity
public class ExperienciaLaboral {
    @Id
    private Integer id;
    
    @Column(columnDefinition="VARCHAR(75)")
    private String nombre;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String periodo;
    
    @Column(columnDefinition="VARCHAR(1000)")
    private String descripcion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnore private Persona persona;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="empresa_id")
    private Empresa empresa;
}
