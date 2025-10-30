package Logic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josim
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class JuegoDamas {
    
    private Tablero tablero;
    private String turnoActual;
    private Scanner scanner;
    private final int TAMANO;

    public JuegoDamas() {
        this.tablero = new Tablero();
        this.turnoActual = "R"; // Comienzan las Rojas
        this.scanner = new Scanner(System.in);
        this.TAMANO = tablero.getTamano();
    }

  
    private int solicitarCoordenada(String tipo, String eje) {
        while (true) {
            try {
                System.out.print("Ingrese " + tipo + " " + eje + " (0-" + (TAMANO - 1) + "): ");
                int coord = scanner.nextInt();
                if (coord >= 0 && coord < TAMANO) {
                    return coord;
                } else {
                    System.out.println("Error: El valor debe estar entre 0 y " + (TAMANO - 1) + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese solo números enteros.");
                scanner.next();
            }
        }
    }
    
    
    private Ficha obtenerFichaValida(int FilaOrigen, int ColOrigen) {
        Ficha ficha = tablero.getFicha(FilaOrigen, ColOrigen);

        if (ficha == null) {
            System.out.println("Error: Casilla vacia.");
        } else if (!ficha.getColor().equals(turnoActual)) {
            System.out.println("Error: Esa ficha no pertenece al turno actual (" + turnoActual + ").");
        } else {
            return ficha; 
        }
        return null; 
    }
    
    
   private void finalizarTurno(Ficha ficha, int FilaOrigen, int ColOrigen, int FilaDestino, int ColDestino) {
    
    tablero.setFicha(FilaOrigen, ColOrigen, null);
    tablero.setFicha(FilaDestino, ColDestino, ficha);

    System.out.println("Movimiento realizado de (" + FilaOrigen + "," + ColOrigen + ") a (" + FilaDestino + "," + ColDestino + ")");
    turnoActual = turnoActual.equals("R") ? "N" : "R";
}


private boolean validarMovimientoSimple(int FilaOrigen, int ColOrigen, int FilaDestino, int ColDestino) {
    Ficha ficha = tablero.getFicha(FilaOrigen, ColOrigen);

   
    if (tablero.getFicha(FilaDestino, ColDestino) != null) {
        System.out.println("Movimiento ilegal: Casilla de destino ocupada.");
        return false;
    }

    
    if (Math.abs(FilaDestino - FilaOrigen) != 1 || Math.abs(ColDestino - ColOrigen) != 1) {
        System.out.println("Movimiento ilegal: Solo se permite diagonal de una casilla.");
        return false;
    }

   
    int direccion = FilaDestino - FilaOrigen; 

    if (ficha.getColor().equals("R") && direccion > 0) {
         System.out.println("Movimiento ilegal: Las fichas rojas solo pueden moverse hacia arriba.");
         return false; 
    } else if (ficha.getColor().equals("N") && direccion < 0) {
        System.out.println("Movimiento ilegal: Las fichas negras solo pueden moverse hacia abajo.");
        return false; 
    }

    return true;
}




public void ejecutarJuego() {
    System.out.println("Damas chinas Josimar Mora C5H388");
    System.out.println("Fichas Rojas (R) comienzan.");

    while (true) {
        tablero.mostrarTablero();
        System.out.println("TURNO: Fichas " + turnoActual);

        int FilaOrigen, ColOrigen, FilaDestino, ColDestino;
        Ficha fichaAMover = null;

        
        do {
             FilaOrigen = solicitarCoordenada("Fila", "Origen");
            ColOrigen = solicitarCoordenada("Columna", "Origen");
            fichaAMover = obtenerFichaValida(FilaOrigen, ColOrigen);
        } while (fichaAMover == null);
        
       
        do {
            FilaDestino = solicitarCoordenada("Fila", "Destino");
            ColDestino = solicitarCoordenada("Columna", "Destino");


            if (validarMovimientoSimple(FilaOrigen, ColOrigen, FilaDestino, ColDestino)) {
   
                finalizarTurno(fichaAMover, FilaOrigen, ColOrigen, FilaDestino, ColDestino);
                break; 
            }
        } while (true);
    }
}
}