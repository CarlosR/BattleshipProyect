/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1_Programacion2;

import java.util.Scanner;

/**
 *
 * @author Alfredo
 */
public class BattleShip {
    
private static int opc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
       do{ 
        System.out.println("\t...MENU...");
        System.out.println("1. Jugar");
        System.out.println("2. Dificultad");
        System.out.println("3. Descripcion Ultimos Juegos");
        System.out.println("4. Salir");
        System.out.println("Ingrese una opcion: ");
        opc = lea.nextInt();
        
        switch(opc){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
       }while(opc!=4);
   
    }
}
