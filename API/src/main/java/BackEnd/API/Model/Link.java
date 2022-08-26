/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
public class Link {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String nombre;
    
    @Column(columnDefinition="VARCHAR(100)")
    private String url;
    
    @Column(columnDefinition="VARCHAR(100)")
    private String imagen;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="proyecto_id")
    @JsonIgnore private Proyecto proyecto;
}
