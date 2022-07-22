/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter 
@Setter
@Entity
@Table(name="Persona")
public class Persona {
    @Id
    @Column(name="ID")
    private Long id;
    
    @Column(name="Nombre")
    private String nombre;
    
    @Column(name="Apellido")
    private String apellido;
    
    @Column(name="Correo")
    private String correo;
    
    @Column(name="Sobre_mi")
    private String sobreMi;
    
    @Column(name="Foto_de_perfil")
    private String fotoDePerfil;
    
    @Column(name="Titulo_profesional")
    private String tituloProfesional;
}
