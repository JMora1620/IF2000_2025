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
        
public class TrabajoClase {
    
    Scanner sc = new Scanner(System.in);//codigo para usar escaner
    
    /*public void Ejer28(){
        
        //vaiable
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        System.out.println(dia+"/"+mes+"/"+anio);
        String nombreMes;
        
        
        
        switch (mes){
            case 1:  
        nombreMes = "enero";
        break;
            case 2: 
         nombreMes = "Febrero";
        break;
            case 3:
        nombreMes ="marzo";
        break;
          case 4:  
         nombreMes = "abril";
        break;
            case 5: 
         nombreMes ="mayo";
        break;
            case 6:
         nombreMes ="junio";
        break;
            case 7:  
        nombreMes ="julio";
        break;
            case 8: 
         nombreMes = "agosto";
        break;
            case 9:
         nombreMes ="septiembre";
        break;
          case 10:  
         nombreMes ="octubre";
        break;
            case 11: 
         nombreMes ="noviembre";
        break;
            case 12:
         nombreMes ="diciembre";
        break;
        
            default: nombreMes = "Mes invalido";
            break;
        }
        
        System.out.println("Cambio de formato");
        
        System.out.print(dia+" de "+nombreMes+" del "+anio);
        
        }
    public void Ejer29(){
        
        int a = sc.nextInt();
        int b=sc.nextInt();
        int resultado=0;
        
        for(int i = 0 ; i < b; i++ ){
            
       resultado +=a;
        

    } System.out.print("el resultado de "+a+"*"+b+" es "+ resultado);
    }*/

    public void Ejer30(){
    
    int num=sc.nextInt();
    int tabla=0;
    
    System.out.println("La tabla del " + num +"es ");
    for(int i=1; i<=10; i++ ){
        
      int resultado = num*i;
    System.out.println(num +"*"+ i +" = " + resultado);
    
    }
    
    }
}