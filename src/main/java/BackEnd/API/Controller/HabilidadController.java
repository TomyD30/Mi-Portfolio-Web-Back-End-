/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Habilidad;
import BackEnd.API.Service.HabilidadService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author User
 */
public class HabilidadController extends ControladorSecundario<Habilidad, HabilidadService>{
    
    @PostMapping("personas/{persona_id}/habilidaeds/crear")
    @Override
    public void crear(@PathVariable Integer persona_id, @RequestBody Habilidad hab){
        super.crear(persona_id, hab);
    }
    
    @PutMapping("personas/{persona_id}/habilidades/guardar")
    @Override
    public Habilidad guardar(@PathVariable Integer persona_id, @RequestBody Habilidad hab){
       return super.guardar(persona_id, hab);
    }
    
    @DeleteMapping("habilidades/eliminar/{id}")
    @Override
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
