package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc6 {

    
    public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);  
      int X,Y,Z;
      
      System.out.println("Digite o primeiro número:");
      X = valor.nextInt();
      System.out.println("Digite o segundo número:");
      Y = valor.nextInt();
      System.out.println("Digite o terceiro número:");
      Z = valor.nextInt();
      System.out.println("A ordem decrescente é:");
     if (X > Y)
         if (Y > Z)
           System.out.println(X +"\n"+ Y+"\n"+ Z);  
          else if (X > Z) 
            System.out.println(X +"\n"+Z+"\n"+ Y); 
          else 
            System.out.println(Z +"\n"+ X +"\n"+ Y); 
         
       
     else if (Y > Z)
        if (X > Z)
         System.out.println(Y +"\n"+X+"\n"+ Z);
          else 
         System.out.println(Y +"\n"+ Z+"\n"+ X);
      
        
        else 
       System.out.println(Z +"\n"+ Y+"\n"+ X);
         
     
     }
    }