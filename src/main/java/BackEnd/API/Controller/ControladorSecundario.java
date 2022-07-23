/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.IEntidadSecundaria;
import BackEnd.API.Service.IServicio;
import BackEnd.API.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author User
 */
public abstract class ControladorSecundario<Entidad extends IEntidadSecundaria, Servicio extends IServicio> implements IControladorSecundario<Entidad>{
    @Autowired
    Servicio servicio;
    @Autowired
    PersonaService persoSrv;
    
    @Override
    public void crear(@PathVariable Integer persona_id, @RequestBody Entidad e){
        e.setPersona(persoSrv.traerPorId(persona_id));  
        servicio.guardar(e);
    }
    
    @Override
    public Entidad guardar(@PathVariable Integer persona_id, @RequestBody Entidad e){
        e.setPersona(persoSrv.traerPorId(persona_id));  
        servicio.guardar(e);
        return e;
    }
    
    @Override
    public void borrar(@PathVariable Integer id){
        servicio.borrar(id);
    }
}
