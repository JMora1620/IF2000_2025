/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author josim
 */
import java.util.Arrays;

public class Tablero {
    private Ficha[][] matriz;
    private final int TAMANO = 8;

    public Tablero() {
        this.matriz = new Ficha[TAMANO][TAMANO];
        inicializarTablero();
    }

    
    private void inicializarTablero() {
        
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < TAMANO; j++) {
                 if ((i + j) % 2 == 1) {
                    matriz[i][j] = new Ficha("N");
                }
            }
        }

         for (int i = 5; i < 8; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if ((i + j) % 2 == 1) {
                    matriz[i][j] = new Ficha("R");
                }
            }
        }
    }

    
    public void mostrarTablero() {
        System.out.println("\n   0 1 2 3 4 5 6 7"); //Columna
        System.out.println("  -----------------");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + "| "); //Fila
            for (int j = 0; j < TAMANO; j++) {
                if (matriz[i][j] == null) {
                    // Casilla vacía
                    System.out.print(". ");
                } else {
                   
                    System.out.print(matriz[i][j].toString() + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  -----------------\n");
    }

    // --- Métodos de gestión de casillas ---
    public Ficha getFicha(int fila, int col) {
       
        return matriz[fila][col];
    }

    public void setFicha(int fila, int col, Ficha ficha) {
       
        matriz[fila][col] = ficha;
    }

    public int getTamano() {
        return TAMANO;
    }
}
