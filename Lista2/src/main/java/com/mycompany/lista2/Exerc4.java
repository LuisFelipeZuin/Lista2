
package com.mycompany.lista2;

import java.util.Scanner;
public class Exerc4 {

    
    public static void main(String[] args) {
       
    Scanner valor = new Scanner(System.in);
    int A,B,C;
    
    System.out.println("Dê um valor para A:");
    A = valor.nextInt();
    System.out.println("Dê um valor para B:");
    B = valor.nextInt();
    
    if (A==B){
    C = A+B;
    System.out.println("C é igual a " + C);

    }else{ 
    
     C = A*B; 
    System.out.println("C é igual a " + C);
    }
    }
    
}
