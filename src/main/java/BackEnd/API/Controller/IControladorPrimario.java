/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BackEnd.API.Controller;

/**
 *
 * @author User
 */
public interface IControladorPrimario<Entidad> {
    public void crear(Entidad e);
    public Entidad guardar(Entidad e);
    public void borrar(Integer id);
}
