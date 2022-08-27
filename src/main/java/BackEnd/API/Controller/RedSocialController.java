/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.RedSocial;
import BackEnd.API.Service.RedSocialService;
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
public class RedSocialController extends ControladorSecundario<RedSocial, RedSocialService> {
    
    @PostMapping("personas/{persona_id}/redes-sociales/crear")
    @Override
    public void crear(@PathVariable Integer persona_id, @RequestBody RedSocial rs){
        super.crear(persona_id, rs);
    }
    
    @PutMapping("personas/{persona_id}/redes-sociales/guardar")
    @Override
    public RedSocial guardar(@PathVariable Integer persona_id, @RequestBody RedSocial rs){
       return super.guardar(persona_id, rs);
    }
    
    @DeleteMapping("redes-sociales/eliminar/{id}")
    @Override
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
