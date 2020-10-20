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
public enum Rol {
    ADMINISTRADOR ("Administrador"),
    COLABORADOR("Colaborador"); 
    //private ArrayList<MiembroEnGrupo> miembroEnGrupo = new ArrayList<>();//relacion con mienbroen grupo  
    //no mira a MiembroEnrupo
    private String valor;

    private Rol(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Rol{" + "valor=" + valor + '}';
    }
    
    
    
    
}
