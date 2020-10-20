/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

/**
 *
 * @author Usuario
 */
public class PalabraClave {
    private String nombre;

    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PalabraClave{" + "nombre=" + nombre + '}';
    }
    
    public void mostrar(){
        System.out.println("\nPalabra Clave: "+nombre);
    }
    
}
