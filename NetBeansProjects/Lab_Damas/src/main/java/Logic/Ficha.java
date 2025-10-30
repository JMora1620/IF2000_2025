/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author josim
 */
public class Ficha {
    private String color; 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
  

    public Ficha(String color) {
        this.color = color;
        
    }


    @Override
    public String toString() {
       
        return color;
    }
}
