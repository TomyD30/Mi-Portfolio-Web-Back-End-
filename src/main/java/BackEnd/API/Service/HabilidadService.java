/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Service;

import BackEnd.API.Model.Habilidad;
import BackEnd.API.Repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */

@Service
public class HabilidadService {
    @Autowired
    HabilidadRepository habRepo;
    
    public List<Habilidad> traer(){
        return habRepo.findAll();
    }
}
