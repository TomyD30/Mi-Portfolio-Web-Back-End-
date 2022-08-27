/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Controller;

import BackEnd.API.Model.Empresa;
import BackEnd.API.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class EmpresaController extends ControladorPrimario<Empresa, EmpresaService> {
    
    @PostMapping("empresas/crear")
    @Override
    public void crear(@RequestBody Empresa emp){ 
        super.crear(emp);
    }
    
    @PutMapping("empresas/guardar")
    @Override
    public Empresa guardar(@RequestBody Empresa emp){ 
        return super.guardar(emp);
    }
    
    @DeleteMapping("empresas/eliminar/{id}")
    @Override
    public void borrar(@PathVariable Integer id){
        super.borrar(id);
    }
}
