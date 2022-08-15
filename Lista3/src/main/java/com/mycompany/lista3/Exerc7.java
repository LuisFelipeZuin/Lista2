package com.mycompany.lista3;

import java.util.Scanner;

public class Exerc7 {

    
    public static void main(String[] args) {
        
    Scanner v = new Scanner(System.in);

    int n;
    int maior = 0;
  for (int i=1; i<=5;i++){
      
      System.out.println("Digite o n"+(i));
     n = v.nextInt();
  
    if (n > maior){
     maior = n;   
    }
    
  }
  System.out.println("Maior: "+ maior); 

    }
    
}
