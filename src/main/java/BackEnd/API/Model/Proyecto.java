/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter 
@Setter
@Entity
public class Proyecto implements IEntidadSecundaria{
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String nombre;

    @Column(columnDefinition="VARCHAR(45)")
    private String periodo;
    
    @Column(columnDefinition="VARCHAR(1000)")
    private String descripcion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnore private Persona persona;
    @OneToMany(mappedBy="proyecto")
    private List<Link> links;
    
}
