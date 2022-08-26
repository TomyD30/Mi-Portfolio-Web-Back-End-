/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.API.DTO;

import BackEnd.API.Model.Link;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */

@Getter
@Setter
public class ProyectoDTO {
    private Integer id;
    private String nombre;
    private String periodo;
    private String descripcion;
    private List<Link> links;
}
