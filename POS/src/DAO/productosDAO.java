/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODELO.productos_new;
import MODELO.vendedores_new;
import java.util.LinkedList;

        
/**
 *
 * @author NELSON
 */
public interface productosDAO {
    //Vamoa a crear los metodos que queremos ejecutar
    public LinkedList<productos_new> listar_new();
    
    public productos_new obtener(int codigo);
    
    public void crear(productos_new vendedor);
    
    public void modificar(productos_new vendedor);
    
    public void eliminar(int codigo);
}



