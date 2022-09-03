package com.mycompany.lista6;

import java.util.Scanner;

public class Exerc2 {

    
    public static void main(String[] args) {
        
     Scanner v = new Scanner(System.in);

        

     int maior=0,menor=0,aux,soma=0,media=0;
     int x[] = new int[5];
    
     for (int i=0;i<x.length;i++){
         System.out.println("Digite o "+(i+1)+ "º número:");
      x[i] = v.nextInt();
     
     if (x[i] > maior){
        maior = x[i];
        menor = x[i]; 
     
          
     }else if(maior > maior){
      aux = maior;
      maior = aux;                                            
         
     }
     else {
       menor = x[i];  
     }
     soma = soma + x[i];
     media = soma/x.length;
     
     
     }
     for (int i=0;i<x.length;i++){
         System.out.print(x[i]+"|");
     }
        System.out.println("");
     System.out.println("Maior:"+maior);
     System.out.println("Menor:"+menor);
     System.out.println("Média:"+media);

    }
    
}


