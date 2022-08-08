
package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc10 {

    
    public static void main(String[] args) {
        
    Scanner l = new Scanner(System.in);
    float x,y,z;

    System.out.println("Dê o primeiro lado:");
    x = l.nextFloat();
    System.out.println("Dê o segundo lado:");
    y = l.nextFloat();
    System.out.println("Dê o terceiro lado:");
    z = l.nextFloat();

if (x == y && y==z){
   System.out.println("Este trinâgulo é equilátero"); 
}
else if (x==y || y==z){
 System.out.println("Este trinâgulo é isóceles");   
}
else {
 System.out.println("Este trinâgulo é escaleno");   
}
  }
    }
