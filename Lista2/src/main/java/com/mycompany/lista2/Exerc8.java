
package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc8 {

    
    public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);  
      int vetor[];
      int i,j,aux;
      vetor = new int[5];
      
      for (i = 0; i < 5; i++){
        System.out.println("Informe o número " + (i+1)+":");  
        vetor[i] = valor.nextInt();
      }
      for (i = 0 ; i < 5; i++){
       for (j = 0; j < 5; j++){
        if (vetor[i]<vetor[j]){
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
          }
         }              
         
       }
      for (int k = 0; k < 5; k++){
       System.out.println(vetor[k]);  
          }
           
                              
         }
    }
