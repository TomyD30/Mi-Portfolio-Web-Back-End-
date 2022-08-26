/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public abstract class ServicioBasico<T,R extends JpaRepository> implements IServicio<T>{
    @Autowired
    R repo;
    
    @Override
    public List<T> traer(){
       return repo.findAll();
    }
    
    @Override
    public T traerPorId(Integer id){
        return (T) repo.findById(id).orElse(null);
    }
    
    @Override
    public void guardar(Object t){
        repo.save(t);
    }
    
    @Override
    public void borrar(Integer id){
        repo.deleteById(id);
    }
}
