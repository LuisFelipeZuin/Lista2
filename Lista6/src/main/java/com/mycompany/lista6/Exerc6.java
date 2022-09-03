package com.mycompany.lista6;

import java.util.Scanner;

public class Exerc6 {

    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     int vet[] = new int[10];
     int x;
     for (int i=0;i<vet.length;i++){
         System.out.println("Digite o "+(i+1)+ "º número:");
      vet[i] = sc.nextInt();
            
   
    }
    System.out.println("Informe o valor x:");
    x = sc.nextInt();
    for (int i=0;i<vet.length;i++){
    if (vet[i]%x == 0){
     System.out.println("Múltiplos de "+x+":"+vet[i]);   
      
    }
    
     }    
    }
}
