package com.mycompany.lista2;

import java.util.Scanner;

        public class Exerc2 {

    
    public static void main(String[] args) {
     Scanner info = new Scanner(System.in);   
     
     String Nome,Sexo,Estado;
     int ano;
     
     System.out.println("Digite seu nome:");
      Nome = info.nextLine();
     System.out.println("Sexo(M ou F):");
      Sexo = info.nextLine(); 
     System.out.println("Estado Civil:");
      Estado = info.nextLine();
      
      if (Sexo.equals ("F") && Estado.equals ("Casada")){
      System.out.println("Quantos anos está casada?");        
      ano = info.nextInt();
      
    } else {
      System.out.println("Fim");      
    }

    }
    
}
