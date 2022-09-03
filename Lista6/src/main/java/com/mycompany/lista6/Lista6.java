package com.mycompany.lista6;

import java.util.Scanner;

public class Lista6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

     Scanner x = new Scanner(System.in);
        
        
        int n[]= new int [10] ;
        int positivos=0,negativos=0,soma=0;
   
   for (int i = 0;i < 10;i++){
    System.out.println("Digite o "+(i+1)+ "º número:");  
   n[i] = x.nextInt(); 
   
   if (n[i] <0){
       negativos++; 
       
   }
   else{
      positivos = positivos + n[i]; 
   }
   
   }
   System.out.println("Negativos:"+negativos);
   System.out.println("Soma dos positivos:"+positivos);



    }
}

