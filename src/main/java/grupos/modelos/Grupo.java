/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */

public class Grupo {
    private String nombre;
    private String descripcion;
    
   // MiembroEnGrupo miembro = new MiembroEnGrupo(null,null,null);
    
    
    private ArrayList<MiembroEnGrupo> miembroEnGrupo = new ArrayList<>();//relacion con mienbroen grupo

    
    
    /*
    public void agrgarMiembro(Autor autor , Rol rol){
        miembro.setAutor(autor);
        miembro.setRol(rol);
        miembroengrupo.add(miembro);
    }
    */
    
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   public void  mostrar(){
       System.out.println("\nNombre: "+nombre);
       System.out.println("Descripcion: "+descripcion);
       System.out.println("\n");
   }
    
    
}
