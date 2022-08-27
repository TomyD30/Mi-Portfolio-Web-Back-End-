/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.ExperienciaLaboral;
import BackEnd.API.Service.ExperienciaLaboralService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class ExperienciaLaboralController extends ControladorSecundario<ExperienciaLaboral, ExperienciaLaboralService> {
    
    @PostMapping("personas/{persona_id}/experiencias-laborales/crear")
    @Override
    public void crear(@PathVariable Integer persona_id, @RequestBody ExperienciaLaboral expLab){
        super.crear(persona_id, expLab);
    }
    
    @PutMapping("personas/{persona_id}/experiencias-laborales/guardar")
    @Override
    public ExperienciaLaboral guardar(@PathVariable Integer persona_id, @RequestBody ExperienciaLaboral expLab){
        return super.guardar(persona_id, expLab);
    }
    
    @DeleteMapping("experiencias-laborales/eliminar/{id}")
    @Override
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
