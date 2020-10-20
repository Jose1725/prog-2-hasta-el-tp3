/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private Cargo cargo;
    
    private ArrayList<MiembroEnGrupo> miembroEnGrupo = new ArrayList<>();//relacion con mienbroen grupo
    

    
    //agragar para que tome la VentanaAMProfesor
     public Profesor(int dni, String apellidos, String nombres, String clave, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
    }

     
    public void mostrar(){
        System.out.println("\n");
        System.out.println("DNI: "+dni);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Nombres:"+nombres);
        System.out.println("Clave: "+clave);
        System.out.println("Cargo: "+cargo);
    }

    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

 
    
    
    
}
