package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc7 {

    
    public static void main(String[] args) {
        
   Scanner x = new Scanner(System.in);
   int N,soma;
   
   System.out.println("Digite o número:");
   N = x.nextInt();
   
   if (N%2 == 0){
    
   soma = N+5;
   System.out.println("O resultado é: " + soma); 
   
   }else{
    soma = N+8;
       System.out.println("O resultado é: " + soma);  

   }
      }
    
}
