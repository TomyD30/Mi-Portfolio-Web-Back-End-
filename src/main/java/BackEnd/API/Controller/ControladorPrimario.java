/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author User
 */
public abstract class ControladorPrimario<Entidad, Servicio extends IServicio> implements IControladorPrimario<Entidad> {
    @Autowired
    Servicio servicio;
    
    @Override
    public void crear(Entidad e){
        servicio.guardar(e);
    }
    
    @Override
    public Entidad guardar(Entidad e){
        servicio.guardar(e);
        return e;
    }
    
    @Override
    public void borrar(Integer id){
        servicio.borrar(id);
    }
}
