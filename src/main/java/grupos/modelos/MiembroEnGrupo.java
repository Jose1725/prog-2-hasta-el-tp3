/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;
import publicaciones.modelos.Publicacion;

/**
 *
 * @author Usuario
 */
public class MiembroEnGrupo {
    private Profesor profesor;
    private Grupo grupo;
    private Rol rol;
    //private Publicacion publicacion;

    public MiembroEnGrupo(Profesor profesor, Grupo grupo, Rol rol) {
        this.profesor = profesor;
        this.grupo = grupo;
        this.rol = rol;
       // this.publicacion = publicacion;
    }
    
   
    
}
