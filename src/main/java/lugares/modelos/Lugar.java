/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

/**
 *
 * @author Usuario
 */
public class Lugar {
    private String nombre;

    public Lugar(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + '}';
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println("\nLugar: "+nombre);
    }
    
    
}
