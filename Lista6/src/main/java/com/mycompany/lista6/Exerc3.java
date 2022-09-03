package com.mycompany.lista6;

import java.util.Scanner;

public class Exerc3 {

    
    public static void main(String[] args) {
        
    Scanner y = new Scanner(System.in);
       

   int v[] = new int [10];
   int iguais,aux=0;
   
   for(int i=0;i<v.length;i++){
   System.out.println("Digite o "+(i+1)+ "º número:");
   v[i] = y.nextInt();
   
   }
   for (int j=0;j<v.length;j++){
     if (v[j] != aux){
         aux = v[j];
      }
     else {
        iguais = v[j];        
         System.out.println("Números iguais:"+iguais);
      }
     }
    }   
}

