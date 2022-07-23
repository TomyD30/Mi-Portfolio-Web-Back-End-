/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Link;
import BackEnd.API.Service.LinkService;
import BackEnd.API.Service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author User
 */
public class LinkController{
    
    @Autowired
    LinkService linkSrv;
    @Autowired
    ProyectoService proySrv;
    
    @PostMapping("proyectos/{proyecto_id}/links/crear")
    public void crear(@PathVariable Integer proyecto_id, @RequestBody Link link){ 
        link.setProyecto(proySrv.traerPorId(proyecto_id));
        linkSrv.guardar(link);
    }
    
    @PutMapping("proyectos/{proyecto_id}/links/guardar")
    public Link guardar(@PathVariable Integer proyecto_id, @RequestBody Link link){ 
        link.setProyecto(proySrv.traerPorId(proyecto_id));
        linkSrv.guardar(link);  
        return link;
    }
    
    @PutMapping("links/eliminar/{id}")
    public void borrar(@PathVariable Integer id){
        linkSrv.borrar(id);
    }
}
