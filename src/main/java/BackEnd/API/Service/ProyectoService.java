/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Service;

import BackEnd.API.Model.Proyecto;
import BackEnd.API.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */

@Service
public class ProyectoService {
    @Autowired
    ProyectoRepository proyRepo;
    
    public List<Proyecto> traer(){
        return proyRepo.findAll();
    }
    
    public Proyecto traerPorId(Integer id){
        return proyRepo.findById(id).orElse(null);
    }
    
    public void guardar(Proyecto proy){
        proyRepo.save(proy);
    }
    
    public void editar(Proyecto proy, String nuevoNombre, String nuevoPeriodo, String nuevaDescripcion){
        proy.setNombre(nuevoNombre);
        proy.setPeriodo(nuevoPeriodo);
        proy.setDescripcion(nuevaDescripcion);
    }
    
}