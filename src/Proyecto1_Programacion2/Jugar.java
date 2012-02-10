/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto1_Programacion2;

import java.util.ArrayList;

/**
 *
 * @author CarlosR
 */
public class Jugar {

    public ArrayList<String> jugador1;
    public ArrayList<String> jugador2;

    public Jugar(){
        jugador1 = new ArrayList<String>(100);
        jugador2 = new ArrayList<String>(100);
    }

    public void AgregarJugador(String jugador1, String jugador2){
        this.jugador1.add(jugador1);
        this.jugador2.add(jugador2);
    }
}
