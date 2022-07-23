/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.ExperienciaLaboral;
import BackEnd.API.Service.ExperienciaLaboralService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author User
 */
public class ExperienciaLaboralController extends ControladorSecundario<ExperienciaLaboral, ExperienciaLaboralService> {
    
    @PostMapping("personas/{persona_id}/experiencias-laborales/crear")
    public void crear(@PathVariable Integer persona_id, @RequestBody ExperienciaLaboral expLab){
        super.crear(persona_id, expLab);
    }
    
    @PutMapping("personas/{persona_id}/experiencias-laborales/guardar")
    public ExperienciaLaboral guardar(@PathVariable Integer persona_id, @RequestBody ExperienciaLaboral expLab){
        return super.guardar(persona_id, expLab);
    }
    
    @PutMapping("experiencias-laborales/eliminar/{id}")
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
