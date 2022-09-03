package com.mycompany.lista6;
  
import java.util.Scanner;


public class Exerc4{  
      
    public static void main (String[] args) {  
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[20]; 
        int aux=0,iguais=0,r=0;
        
        
        System.out.println("Digite os elementos do vetor:");
        for (int i=0; i<vet.length; i++){         
          vet[i]=sc.nextInt();
        } 
   
      for (int j=0; j<vet.length; j++){
       if (vet[j] != iguais){
           iguais = vet[j];
       }else{
           aux = vet[j];
           r = vet[i] - vet[j];
                
       
       }
      }          

    }
} 
        
  
  
