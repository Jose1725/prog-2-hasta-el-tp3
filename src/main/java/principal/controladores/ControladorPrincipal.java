/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.UIManager;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {
 
    
    public static void main(String[] args) {
        
        //Agrego el codigo para que muestre las ventanas correspondientes
        asignarLookAndFeel("Nimbus"); 
        
        //Ventana Alumno    
        VentanaAMAlumno ventana = new VentanaAMAlumno(null); //se instancia la ventana
        ventana.setLocationRelativeTo(null); //se centra la ventana
        ventana.setVisible(true); //se hace visible la ventana
        
        //Ventana Profesor   
        VentanaAMProfesor ventana2 = new VentanaAMProfesor(null); //se instancia la ventana
        ventana2.setLocationRelativeTo(null); //se centra la ventana
        ventana2.setVisible(true); //se hace visible la ventana
    //Ventana Tipo   
        VentanaATipo ventana3 = new VentanaATipo(null); //se instancia la ventana
        ventana3.setLocationRelativeTo(null); //se centra la ventana
        ventana3.setVisible(true); //se hace visible la ventana
    //Ventana Lugar    
        VentanaALugar ventana4 = new VentanaALugar(null); //se instancia la ventana
        ventana4.setLocationRelativeTo(null); //se centra la ventana
        ventana4.setVisible(true); //se hace visible la ventana
    //Ventana Grupo    
        VentanaAMGrupo ventana5 = new VentanaAMGrupo(null); //se instancia la ventana
        ventana5.setLocationRelativeTo(null); //se centra la ventana
        ventana5.setVisible(true); //se hace visible la ventana
    //Ventana Idioma    
        VentanaAIdioma ventana6 = new VentanaAIdioma(null); //se instancia la ventana
        ventana6.setLocationRelativeTo(null); //se centra la ventana
        ventana6.setVisible(true); //se hace visible la ventana
    //Ventana PalabraClave    
        VentanaAPalabraClave ventana7 = new VentanaAPalabraClave(null); //se instancia la ventana
        ventana7.setLocationRelativeTo(null); //se centra la ventana
        ventana7.setVisible(true); //se hace visible la ventana
      
       
//***************************************************************************************************  
        
        
      
        
        
        
        ArrayList<Alumno> alum = new ArrayList();
        ArrayList<Profesor> prof = new ArrayList();
        ArrayList<Idioma> id = new ArrayList();
        ArrayList<Lugar> lug = new ArrayList();
        ArrayList<PalabraClave> pc = new ArrayList();
        ArrayList<Tipo> tipo = new ArrayList();     
        ArrayList<Grupo> grup = new ArrayList();
        // TP3
        ArrayList<Publicacion> publicaciones = new ArrayList<>(); 
        
        Alumno unAlumno1 = new Alumno (34366235,"Castro","José","1725","1603082");
        Alumno unAlumno2 = new Alumno (39732726,"Martel","Eric","123","1603082");
        Alumno unAlumno3 = new Alumno(41842726,"Apasa","Manuel","777","3405085");
        Alumno unAlumno4 = new Alumno(39402824,"Ignacio","Carrizo","030","1043081");
        Alumno unAlumno5 = new Alumno(43003526,"Guzman","Soledad","555","1578086");
        
        alum.add(unAlumno1);
        alum.add(unAlumno2);
        alum.add(unAlumno3);
        alum.add(unAlumno4);
        alum.add(unAlumno5);   
        
        System.out.println("\nLos datos de los Alumnos son: ");
        for(Alumno a : alum){
           a.mostrar();
        }        
        
        Profesor unProfesor1 = new Profesor (30902536,"Paz","Milena","101",Cargo.ADG);
        Profesor unProfesor2 = new Profesor(33735536,"Melendes","Liliana","111",Cargo.ADJUNTO);
        Profesor unProfesor3 = new Profesor(28894003,"Tevez","Ines","290",Cargo.ASOCIOADO);
        Profesor unProfesor4 = new Profesor(31380102,"Gerez","Fernando","550",Cargo.JTP);
        Profesor unProfesor5 = new Profesor(25210487,"Castillo","Laura","326",Cargo.TITULAR);
        
        prof.add(unProfesor1);
        prof.add(unProfesor2);
        prof.add(unProfesor3);
        prof.add(unProfesor4);
        prof.add(unProfesor5);
        
        
        System.out.println("\nLos datos de los profesores son: ");
        for(Profesor p : prof){
           p.mostrar();
        }            
        
        Idioma idioma1 = new Idioma("Español");
        Idioma idioma2 = new Idioma("Ingles");
        Idioma idioma3 = new Idioma("Español");
        Idioma idioma4 = new Idioma("Frances");
        Idioma idioma5 = new Idioma("Ingles y Español");
        
        id.add(idioma1);
        id.add(idioma2);
        id.add(idioma3);
        id.add(idioma4);
        id.add(idioma5);
        
    //Muestro por pantalla los idiomas en que fueron publicados
        System.out.println("Los idiomas en que se publico son: ");
        System.out.println(id);
        
        Lugar lugar1 = new Lugar("Congreso");
        Lugar lugar2 = new Lugar("Facultad");
        Lugar lugar3 = new Lugar("Revista Cientifica");
        Lugar lugar4 = new Lugar("Libro");
        Lugar lugar5 = new Lugar("Facultad");
        
        lug.add(lugar1);
        lug.add(lugar2);
        lug.add(lugar3);
        lug.add(lugar4);
        lug.add(lugar5);
        
    //Muestro por pantalla elArrayList de lugar  
        System.out.println("Los lugares donde se publico son: ");
        System.out.println(lug);
        
        
        PalabraClave pc1 = new PalabraClave("Corona");
        PalabraClave pc2 = new PalabraClave("Programacion");
        PalabraClave pc3 = new PalabraClave("Trabajo");
        PalabraClave pc4 = new PalabraClave("Repo2020");
        PalabraClave pc5 = new PalabraClave("Hola123");
        
        
        pc.add(pc1);
        pc.add(pc2);
        pc.add(pc3);
        pc.add(pc4);
        pc.add(pc5);

    //Muestro por pantalla lel ArrayList de palabras claves 
        System.out.println("\ntoString");
        System.out.println("Las palabras claves son: ");
        System.out.println(pc);
        /*
        for(Idioma i: id){
           i.mostrar();
        }*/
        
        
        Tipo tipo1 = new Tipo("Trabajo en Congreso");
        Tipo tipo2 = new Tipo("Tesis");
        Tipo tipo3 = new Tipo("Libro");
        Tipo tipo4 = new Tipo("Capitulo de libro");
        Tipo tipo5 = new Tipo("Tesis");
        
        tipo.add(tipo1);
        tipo.add(tipo2);
        tipo.add(tipo3);
        tipo.add(tipo4);
        tipo.add(tipo5); 
        
    //Muestro por pantalla el ArrayList de tipo   
        System.out.println("\ntoString");
        System.out.println("Los tipos son: ");
        System.out.println(tipo.toString());
        
        Grupo grupo1 = new Grupo("G1","Gestion");
        Grupo grupo2 = new Grupo("G2","Organizacion");
        Grupo grupo3 = new Grupo("G3","Almacenamiento");
        Grupo grupo4 = new Grupo("G4","Preservar");
        Grupo grupo5 = new Grupo("G5","Difundir");
        
        grup.add(grupo1);
        grup.add(grupo2);
        grup.add(grupo3);
        grup.add(grupo4);
        grup.add(grupo5);
        
     //Uso el for mejorado para recorrer y mostrar el ArrayList de grupo          
        System.out.println("\nLos datos del grupo son : ");
        for(Grupo g : grup){
           g.mostrar();
        }            
        
        //modifico con metodo set
        unAlumno1.asignarApellidos("Perriño");
        unAlumno1.asignarNombres("Pituño");
        unProfesor1.asignarApellidos("Diaz");
        unProfesor1.asignarNombres("Rutilo");
        idioma1.asignarIdioma("Portugues");
        pc1.asignarNombre("FACET");
        pc5.asignarNombre("Se modificaron algunos objetos");
        
        System.out.println("\nVector Alumnos modif...");
        for(Alumno a: alum){
            a.mostrar();
        }
        
        System.out.println("\nVector Profesores modif...");
        for(Profesor p: prof){
            p.mostrar();
        }
        
        System.out.println("\nVector Idiomas modif...");
        for(Idioma i: id){
            i.mostrar();
        }
        
        System.out.println("\nVector Palabras Claves modif...");
        for(PalabraClave pal: pc){
            pal.mostrar();
        }
//****************** TP3

      //  ArrayList<Publicacion> publicaciones = new ArrayList<>(); 

        Publicacion publicacion1 = new Publicacion("Titulo 1",LocalDate.of(1980, Month.JUNE, 5),"Enalce 1","Resumen 1");
        Publicacion publicacion2 = new Publicacion("Titulo 2",LocalDate.of(1996,Month.MARCH,10),"enlace 2","Resumen 2");
        Publicacion publicacion3 = new Publicacion("Titulo 3",LocalDate.of(1986,Month.JANUARY,20),"Enlace 3","Resumen 3");
        Publicacion publicacion4 = new Publicacion("Titulo 4",LocalDate.of(1978,Month.AUGUST,27),"Enlace 4","Resumen 4");
        Publicacion publicacion5 = new Publicacion("Titulo 5",LocalDate.of(2000,Month.DECEMBER,5),"Enlace 3","Resumen 3");
        
        //cargamos el vector publicion
        
        publicaciones.add(publicacion1);
        publicaciones.add(publicacion2);
        publicaciones.add(publicacion3);
        publicaciones.add(publicacion4);
        publicaciones.add(publicacion5);
        
        System.out.println("\nLas publicaciones son...");
        for(Publicacion pb: publicaciones){
            pb.mostrar();
        }






        
    }// llave del main
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
                System.exit(0);
            }
        }
    }


}//llave de la clase ControladorPrincipal
