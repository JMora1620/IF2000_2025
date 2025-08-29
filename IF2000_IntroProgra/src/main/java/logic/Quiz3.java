/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josim
 */
public class Quiz3{
    
    
public void ejer_Quiz(int n){
    System.out.println("Ejercicio quiz");
     for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= 5; j++) { 
                if (i == 1 || i == 5) {
                    System.out.print("* ");
                }
  
                else {
                    if (j == 1 || j == 5) {
                        System.out.print("* ");
                    }
                    else if (i == 3 && j == 3) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  "); 
                    }
                }
            }//for interno
            System.out.println(" ");
        }//for externo
    }//end



}//end class




