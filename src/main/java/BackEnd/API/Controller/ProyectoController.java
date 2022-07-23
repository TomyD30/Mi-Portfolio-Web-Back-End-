/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Proyecto;
import BackEnd.API.Service.ProyectoService;
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
public class ProyectoController extends ControladorSecundario<Proyecto, ProyectoService>{
    
    @PostMapping("personas/{persona_id}/proyectos/crear")
    @Override
    public void crear(@PathVariable Integer persona_id, @RequestBody Proyecto proy){
        super.crear(persona_id, proy);
    }
    
    @PutMapping("personas/{persona_id}/proyectos/guardar")
    @Override
    public Proyecto guardar(@PathVariable Integer persona_id, @RequestBody Proyecto proy){
       return super.guardar(persona_id, proy);
    }
    
    @DeleteMapping("proyectos/eliminar/{id}")
    @Override
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
    
//    @Autowired
//    ProyectoService proySrv;
//    @Autowired
//    PersonaService persoSrv;
//    
//    @PostMapping("personas/{persona_id}/proyectos/crear")
//    public void crear(@PathVariable Integer persona_id, @RequestBody Proyecto proy){
//        proy.setPersona(persoSrv.traerPorId(persona_id));  
//        proySrv.guardar(proy);
//    }
//    
//    @PutMapping("personas/{persona_id}/proyectos/guardar")
//    public Proyecto guardar(@PathVariable Integer persona_id, @RequestBody Proyecto proy){
//        proy.setPersona(persoSrv.traerPorId(persona_id));  
//        proySrv.guardar(proy);
//        return proy;
//    }
//    
//    @PutMapping("proyectos/eliminar/{id}")
//    public void borrar(@PathVariable Integer id){
//        proySrv.borrar(id);
//    }
    
//    @PutMapping("/proyectos/guardar/{id}")
//    public Proyecto editar(@PathVariable Integer id,
//                           @RequestParam("nombre") String nuevoNombre,
//                           @RequestParam("periodo") String nuevoPeriodo,
//                           @RequestParam("descripcion") String nuevaDescripcion,
//                           @RequestParam()){
//        Proyecto proy = proySrv.traerPorId(id);
//        
//        proySrv.editar(proy, nuevoNombre, nuevoPeriodo, nuevaDescripcion);
//        
//        proySrv.guardar(proy);
//        return proy;
//    }
}
