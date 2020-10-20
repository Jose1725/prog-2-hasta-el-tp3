/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Usuario
 */
public class Publicacion {
    
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    
    private MiembroEnGrupo miembroEnGrupo;//relacion con mienbroen grupo
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private PalabraClave palabracalve;
    private Grupo grupo;
    private Profesor profesor;
    private Rol rol;

    public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
    }

    public Publicacion(Tipo tipo, Idioma idioma, Lugar lugar, PalabraClave palabracalve, Grupo grupo, Profesor profesor, Rol rol) {
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.palabracalve = palabracalve;
        this.grupo = grupo;
        this.profesor = profesor;
        this.rol = rol;
    }

    
    
    
    
    
    public void mostrar(){
        System.out.println("\n");
        System.out.println("Titulo: "+titulo);
        System.out.println("Profesor: "+profesor);
        System.out.println("Grupo: "+grupo);
        System.out.println("Rol: "+Rol.COLABORADOR);
        System.out.println("Fecha de publicación: "+fechaPublicacion);
        System.out.println("Tipo: "+tipo);
        System.out.println("Idioma: "+idioma);
        System.out.println("Lugar: "+lugar);
        System.out.println("Palabra Clave: "+palabracalve);
        System.out.println("Enlace: "+enlace);
        System.out.println("Resumen: "+resumen);
        
        
    }
    /*Título: Título 5
Autor: Apellido40, Nombre40
Grupo: Grupo 5
Rol: Colaborador
Fecha de publicación: 24/06/2020
Tipo: Tipo 5
Idioma: Idioma 3
Lugar: Lugar 5
Palabras claves
---------------
PalabraClave2
PalabraClave3
PalabraClave4
Enlace: Enlace 5
Resumen: Resumen 5*/
    
    
  /*  
    
    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;
    }

    public void asignarFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + ", enlace=" + enlace + ", resumen=" + resumen + '}';
    }
    
    
    */
    
    
    
    
}
