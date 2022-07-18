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
public class PersonaService implements IPersonaService {
    
    @Autowired
    PersonaRepository persoRepository;
    
    @Override
    public List<Persona> traer(){
        return persoRepository.findAll();
    }
    
}
