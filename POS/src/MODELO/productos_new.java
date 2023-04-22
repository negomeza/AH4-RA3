/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.math.BigDecimal;
import java.util.LinkedList;


public class productos_new {
      public static LinkedList<productos_new> datosProductos = new LinkedList<>();
    
    int codigo;
    String nombre;
    String descripcion;
    int cantidad;
    BigDecimal precio;

    public productos_new(int codigo, String nombre, String descripcion, int cantidad, BigDecimal precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public static LinkedList<productos_new> getDatosProductos() {
        return datosProductos;
    }

    public static void setDatosProductos(LinkedList<productos_new> datosProductos) {
        productos_new.datosProductos = datosProductos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
    
}
