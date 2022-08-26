/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BackEnd.API.Service;

import java.util.List;

/**
 *
 * @author User
 */
public interface IServicio<T> {
    public List<T> traer();
    public T traerPorId(Integer id);
    public void guardar(T t);
    public void borrar(Integer id);
}
