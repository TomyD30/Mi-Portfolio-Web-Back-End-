/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Service;

import BackEnd.API.Model.RedSocial;
import BackEnd.API.Repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */

@Service
public class RedSocialService {
    @Autowired
    RedSocialRepository redSocRepo;
    
    public List<RedSocial> traer(){
        return redSocRepo.findAll();
    }
}
