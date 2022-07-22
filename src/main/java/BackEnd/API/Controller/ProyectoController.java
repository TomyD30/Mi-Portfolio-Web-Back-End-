/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Proyecto;
import BackEnd.API.Service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */

@RestController
public class ProyectoController {
    @Autowired
    ProyectoService proySrv;
    
    @PostMapping("/proyectos/crear")
    public void crear(@RequestBody Proyecto proy){
        proySrv.guardar(proy);
    }
    
    @PutMapping("/proyectos/guardar")
    public Proyecto editar(@RequestBody Proyecto proy){
        proySrv.guardar(proy);
        return proy;
    }
}
