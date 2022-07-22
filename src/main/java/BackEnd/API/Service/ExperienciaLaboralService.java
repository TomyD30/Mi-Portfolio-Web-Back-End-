/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Service;

import BackEnd.API.Model.ExperienciaLaboral;
import BackEnd.API.Repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */

@Service
public class ExperienciaLaboralService {
    @Autowired
    ExperienciaLaboralRepository expLaboRepository;
    
    public List<ExperienciaLaboral> traer(){
        return expLaboRepository.findAll();
    }
}
