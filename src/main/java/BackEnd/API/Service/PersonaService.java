/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Service;

import BackEnd.API.Model.Persona;
import BackEnd.API.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class PersonaService{
    
    @Autowired
    PersonaRepository persoRepo;

    public List<Persona> traer() {
        return persoRepo.findAll();
    }
    
    public Persona traerPorId(Integer id){
        return persoRepo.findById(id).orElse(null);
    }
}
