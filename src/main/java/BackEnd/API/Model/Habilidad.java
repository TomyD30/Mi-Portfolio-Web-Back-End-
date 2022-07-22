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
public class Habilidad {
    @Id
    private Integer id;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String nombre;
    
    @Column(columnDefinition="VARCHAR(3)")
    private String nivel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnore private Persona persona;
}
