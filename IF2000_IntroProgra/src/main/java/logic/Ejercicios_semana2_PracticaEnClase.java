/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josim
 */
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
      for (int i = 1; i < 6; i++) {
            for (int j=1; j<= (3); j++) {
                
                System.out.print("*");
            }//end for interno1
            for (int k =0; k  <=(2*i-1); k++) {
                System.out.print(" ");
            }//end for interno2
              System.out.println(" ");
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
            for (int j = 1; j <=(1+i); j++) {
                System.out.print(" ");
            }//end for interno1
            for (int k = 1; k <= (12-i-1); k++) {
                System.out.print("*");
            }//end for interno2
              System.out.println(" ");
        }//end for externo
        }
              
              
      public void Ejer_en_Clase_D(int n){
          
         
          
      }
              
              
        }
