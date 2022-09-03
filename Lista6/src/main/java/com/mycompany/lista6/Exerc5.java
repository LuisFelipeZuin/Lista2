package com.mycompany.lista6;

import java.util.Scanner;

public class Exerc5 {

    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     int vet[] = new int[5];
     int i;
     int opcao;
     for ( i=0;i<vet.length;i++){
         System.out.println("Digite o "+(i+1)+ "º número:");
          vet[i] = sc.nextInt();
         
        } 
        System.out.println("0-Finalizar");
        System.out.println("1-Vetor ordem direta");
        System.out.println("2-Vetor ordem inversa");
        opcao = sc.nextInt();
        switch (opcao){
         
        case 0: 
        System.out.println("Fim");   
         break;
       
        case 1:
            System.out.println("--------------");
          for ( i=0;i<vet.length;i++){
           System.out.print(vet[i]+"|");
         }
          break;
        
        case 2:
         System.out.println("--------------");
         for (int j = vet.length - 1; j >= 0; j--) {
         System.out.print(vet[j]+"|");
         }
         break;
  
        default:
         System.out.println("Código inválido.");
         }
          
          
     }  
    }

