package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc5 {

    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        int X;
        
        System.out.println("Digite um inteiro positivo ou negativo");
        X = n.nextInt();
        
        if (X > 0){
        
        System.out.println("O dobro é: " + X * 2);

        }else{ 
        System.out.println("O triplo é: " + X * 3);
        }
      }
    
}
