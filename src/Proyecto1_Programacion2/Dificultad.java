/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto1_Programacion2;

import java.util.Scanner;

/**
 *
 * @author CarlosR
 */
public class Dificultad {

    int numbarcos;
    String tablero1[][];
    String tablero2[][];

    public Dificultad(int barcos) {
        this.numbarcos = barcos;
        tablero1 = new String[8][8];
        tablero2 = new String[8][8];

    }

    public void escogerBarco1(String codigo){
        Scanner lea = new Scanner(System.in);
        System.out.println("En que posicion desea este barco?");
        System.out.println("Fila: ");
        int fila = lea.nextInt();

        if(fila>7||fila<0){
            System.out.println("Fila fuera de los limites del Tablero");
            escogerBarco1(codigo);
        }

        System.out.println("Columna: ");
        int columna = lea.nextInt();

        if(columna>7||columna<0){
            System.out.println("Columna fuera de los limites del Tablero");
            escogerBarco1(codigo);
        }

        llenarTablero1(fila,columna,0,codigo);
    }

    public void llenarTablero1(int fila, int columna, int cont, String codigo) {
        boolean yaExiste = true;

        if(tablero1[fila][columna].equals("~")){

            for(int i=0; i<8;i++){
                for(int j=0; j<8;j++){
                    if(tablero1[i][j].equals(codigo)){
                        yaExiste = true;
                    }else{
                        yaExiste = false;
                    }
                }
            }

            if(yaExiste){
                System.out.println("El barco ya existe en el tablero");
            }else{
                tablero1[fila][columna] = codigo;

            }
            for(int i=0;i<8;i++){
                for(int k=0;k<i;k++){
                    if(tablero1[i][k]==null)
                        tablero1[i][k]="~";

                }

            }

        }

    }

}
