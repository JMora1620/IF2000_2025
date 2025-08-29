/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josim
 */
import java.util.Scanner;
import java.util.Random;





public class Ejercicios_semana2_PracticaEnClase {
    

 
    public Ejercicios_semana2_PracticaEnClase() {
    }

    public void EjerPiramide(int n) {
        System.out.println("Piramide");
        
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=(6-i); j++) {
                System.out.print(" ");
            }//end for interno1
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }//end for interno2
              System.out.println(" ");
        }//end for externo
 
        
    }
    
    
    public void Ejer_en_Clase_A(int n){
   
              
               System.out.println(" ");
               System.out.println("Ejercicio A");
         for (int i = 1; i <= 5; i++) { // controla filas
            for (int j = 1; j <= 5; j++) { // controla columnas

                // primera o última fila -> todo *
                if (i == 1 || i == 5) {
                    System.out.print("* ");
                }
                // filas del medio
                else {
                    if (j == 1 || j == 5) {
                        System.out.print("* ");
                    }
                    // poner * en el centro (columna 5, fila 3)
                    else if (i == 3 && j == 5) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  "); // espacio
                    }
                }
            }
            System.out.println(" "); // salto de línea
        }
    }
 
    
     
        
           public void Ejer_en_Clase_B(int n){
   
        System.out.println(" ");
               System.out.println("Ejercicio B");
      for (int i = 0; i < 13; i++) {
            for (int j = (i-1); j < 12; j++) {
                System.out.print("*");
            }//end for interno1
            /*for (int k = (5); k <=5; k++) {
                System.out.print(" ");
            }//end for interno2*/
              System.out.println(" ");
        }//end for externo
 
        }
           
              public void Ejer_en_Clase_C(int n){
   
        System.out.println(" ");
         System.out.println("Ejercicio C");
        for (int i = 0; i <= 12; i++) {
            for (int j = 1; j <=(2+i); j++) {
                System.out.print(" ");
            }//end for interno1
            for (int k = 1; k <= (12-i-1); k++) {
                System.out.print("*");
            }//end for interno2
              System.out.println(" ");
        }//end for externo
        }
      
         
      public void Ejer_en_Clase_D(int n){

    System.out.println(" ");
         System.out.println("Ejercicio D");
         
         Scanner sc = new Scanner(System.in);
         int[]numeros = new int[10];
         
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero en la posicion "+ (i+1)+ ": ");
            numeros[i] = sc.nextInt();
        }
            
            for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j <(10-1); j++) {
                if(numeros[j]> numeros[j+1]){
                    
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1]=temp;
                }//end if
                }//end for interno
                }//end for externo
            System.out.println("arreglo ordenado ascendente");
            for (int i = 0; i < 10; i++) {  
            System.out.println(numeros[i]+ " ");
       
            }
            System.out.println(" ");
      } 
      
      public void Ejer_en_Clase_E(int n){
          
          System.out.println(" ");
         System.out.println("Ejercicio E");
         
        
         int[]numeros = new int[100];
         Random rand = new Random();
         
        for (int i = 0; i < 100; i++) {
            System.out.println("numero "+ (i+1)+ ": ");
            numeros[i] = rand.nextInt(1000);
        }
            
            for (int i = 0; i < 100-1; i++) {
            for (int j = 0; j <(100-1); j++) {
                if(numeros[j]> numeros[j+1]){
                    
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1]=temp;
                }//end if
                }//end for interno
                }//end for externo
            System.out.println("arreglo ordenado descendente");
            for (int i = 0; i < 100; i++) {  
            System.out.println(numeros[i]+ " ");
       
            }
            System.out.println(" ");
      } 
      
          
      public void Ejer_en_Clase_F(int n){
          
          System.out.println(" ");
         System.out.println("Ejercicio F");
         
            String[][]tablero = new String[8][8];

    
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (i < 3 && (i + j) % 2 == 1) { 
                tablero[i][j] = "R"; 
            } else if (i > 4 && (i + j) % 2 == 1) { 
                tablero[i][j] = "N"; 
            } else {
                tablero[i][j] = " ";
            }
        }
    }

    
    System.out.print("   "); 
    for (int j = 1; j <= 8; j++) {
        System.out.print(" " + j + " ");
    }
    System.out.println();

   
    for (int i = 0; i < 8; i++) {
        char letra = (char) ('A' + i); 
        System.out.print(" " + letra + " ");
        for (int j = 0; j < 8; j++) {
            System.out.print( " "+tablero[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println(" ");
}
          
      }
      
        


              
              
        
