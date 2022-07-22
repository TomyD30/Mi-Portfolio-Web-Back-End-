/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.DTO.*;
import BackEnd.API.Model.*;
import BackEnd.API.Service.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class PersonaController {
    
    @Autowired
    private PersonaService persoSrv;
    
    @GetMapping("/personas/traer/{id}")
    public Persona traerPersona(@PathVariable Integer id){
        return persoSrv.traerPorId(id);
    }
    
    @GetMapping("/test")
    public String test(){
        return persoSrv.traerPorId(1).getProyectos().get(1).getNombre();
    }
    
//    @GetMapping("/personas/traer/{id}")
//    public PersonaDTO traerPersona(@PathVariable Integer id){
//        PersonaDTO persoDTO = new PersonaDTO();
//        
//        Persona perso = persoSrv.traerPorId(id);
//        persoDTO.setId(perso.getId());
//        persoDTO.setNombre(perso.getNombre());
//        persoDTO.setApellido(perso.getApellido());
//        persoDTO.setCorreo(perso.getCorreo());
//        persoDTO.setSobreMi(perso.getSobreMi());
//        persoDTO.setFotoDePerfil(perso.getFotoDePerfil());
//        persoDTO.setTituloProfesional(perso.getTituloProfesional());
//        
//        List<Educacion> educaciones = educSrv.traer();
//        List<Instituto> institutos = insSrv.traer();
//        List<EducacionDTO> eduDTOs = new ArrayList();
//        EducacionDTO eduDTO = new EducacionDTO();
//        for(Educacion edu: educaciones){
//            Integer educ_id = edu.getId();
//            if(edu.getPersona().getId() == id){
//                eduDTO.setId(educ_id);
//                eduDTO.setNombre(edu.getNombre());
//                eduDTO.setPeriodo(edu.getPeriodo());
//                eduDTO.setInstituto(edu.getInstituto());
//                eduDTOs.add(eduDTO);
//            }
//        }
//        persoDTO.setEducaciones(eduDTOs);
//        
//        List<ExperienciaLaboral> experienciasLaborales = expLabSrv.traer();
//        List<Empresa> empresas = empSrv.traer();
//        List<ExperienciaLaboralDTO> expLabDTOs = new ArrayList();
//        ExperienciaLaboralDTO expLabDTO = new ExperienciaLaboralDTO();
//        for(ExperienciaLaboral expLab: experienciasLaborales){
//            Integer expLab_id = expLab.getId();
//            if(expLab.getPersona().getId() == id){
//                expLabDTO.setId(expLab_id);
//                expLabDTO.setNombre(expLab.getNombre());
//                expLabDTO.setPeriodo(expLab.getPeriodo());
//                expLabDTO.setDescripcion(expLab.getDescripcion());
//                expLabDTO.setEmpresa(expLab.getEmpresa());
//                expLabDTOs.add(expLabDTO);
//            }
//        }
//        persoDTO.setExperienciasLaborales(expLabDTOs);
//                
//        List<Proyecto> proyectos = proySrv.traer();
//        List<Link> links = linkSrv.traer();
//        List<ProyectoDTO> proyDTOs = new ArrayList();
//        ProyectoDTO proyDTO = new ProyectoDTO();
//        for(Proyecto proy: proyectos){
//            Integer proy_id = proy.getId();
//            if(proy.getPersona().getId() == id){
//                proyDTO.setId(proy_id);
//                proyDTO.setNombre(proy.getNombre());
//                proyDTO.setPeriodo(proy.getPeriodo());
//                proyDTO.setDescripcion(proy.getDescripcion());
//                proyDTO.setLinks(proy.get);
//            }
//        }
//        
//        return persoDTO;
//    }
    
}
