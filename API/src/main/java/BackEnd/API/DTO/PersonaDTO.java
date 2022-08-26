/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.DTO;

import BackEnd.API.Model.Habilidad;
import BackEnd.API.Model.RedSocial;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter
@Setter
public class PersonaDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private String sobreMi;
    private String fotoDePerfil;
    private String tituloProfesional;
    private List<ExperienciaLaboralDTO> experienciasLaborales;
    private List<Habilidad> habilidades;
    private List<EducacionDTO> educaciones;
    private List<ProyectoDTO> proyectos;
    private List<RedSocial> redesSociales;
}
