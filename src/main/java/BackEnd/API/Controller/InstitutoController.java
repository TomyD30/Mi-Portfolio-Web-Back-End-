/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Instituto;
import BackEnd.API.Service.InstitutoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author User
 */
public class InstitutoController extends ControladorPrimario<Instituto, InstitutoService> {
    
    @PostMapping("institutos/crear")
    @Override
    public void crear(@RequestBody Instituto ins){ 
        super.crear(ins);
    }
    
    @PutMapping("institutos/guardar")
    @Override
    public Instituto guardar(@RequestBody Instituto ins){ 
        return super.guardar(ins);
    }
    
    @PutMapping("institutos/eliminar/{id}")
    @Override
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
