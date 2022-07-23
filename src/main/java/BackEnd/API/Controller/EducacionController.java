/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Educacion;
import BackEnd.API.Service.EducacionService;
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
public class EducacionController extends ControladorSecundario<Educacion, EducacionService> {
    
    @PostMapping("personas/{persona_id}/educaciones/crear")
    public void crear(@PathVariable Integer persona_id, @RequestBody Educacion edu){
        super.crear(persona_id, edu);
    }
    
    @PutMapping("personas/{persona_id}/educaciones/guardar")
    public Educacion guardar(@PathVariable Integer persona_id, @RequestBody Educacion edu){
        return super.guardar(persona_id, edu);
    }
    
    @PutMapping("educaciones/eliminar/{id}")
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
