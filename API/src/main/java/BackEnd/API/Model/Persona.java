/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Persona{
    @Id
    private Integer id;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String nombre;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String apellido;
    
    @Column(columnDefinition="VARCHAR(60)")
    private String correo;
    
    @Column(columnDefinition="VARCHAR(1000)")
    private String sobreMi;
    
    @Column(columnDefinition="VARCHAR(100)")
    private String fotoDePerfil;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String tituloProfesional;
    
    //Relaciones
    @OneToMany(mappedBy="persona")
    private List<ExperienciaLaboral> experienciasLaborales;
    @OneToMany(mappedBy="persona")
    private List<Educacion> educaciones;
    @OneToMany(mappedBy="persona")
    private List<Proyecto> proyectos;
    @OneToMany(mappedBy="persona")
    private List<RedSocial> redesSociales;
    @OneToMany(mappedBy="persona")
    private List<Habilidad> habilidades;
    
}
