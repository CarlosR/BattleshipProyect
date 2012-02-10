/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1_Programacion2;

/**
 *
 * @author Alfredo
 */
public class Barcos {
    protected String nombre;
    protected int golpe;
    
    public Barcos(String n, int golp){
        nombre = n;
        golpe = golp;
    }

    public String getCodigo(){
        return nombre;
    }

    
}
