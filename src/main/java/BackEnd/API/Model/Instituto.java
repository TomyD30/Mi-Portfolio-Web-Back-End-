/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter 
@Setter
@Entity
public class Instituto {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(columnDefinition="VARCHAR(45)")
    private String nombre;
    
    @Column(columnDefinition="VARCHAR(100)")
    private String logo;
}
