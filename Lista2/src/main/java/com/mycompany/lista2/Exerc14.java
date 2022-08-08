package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc14 {

    
    public static void main(String[] args) {
       
   Scanner x = new Scanner(System.in);
   
   int l;
   float lado,area;
   
   System.out.println("Informe a quantidade de lados:");
   l = x.nextInt();
   
   if (l == 3){
   System.out.println("TRIÂNGULO");
   System.out.println("Informe a medida do lado :");
   lado = x.nextFloat();   
   area = (float)(Math.sqrt(3)/4) * (lado*lado);
   System.out.println("A área é: "+ area);
   }
   
   if (l == 4){
   System.out.println("QUADRADO");
   System.out.println("Informe a medida do lado:");
   lado = x.nextFloat();   
   System.out.println("A área é: "+ lado*lado);
   }

  if (l == 5){
   System.out.println("PENTÁGONO");
   System.out.println("Informe a medida do lado :");
   lado = x.nextFloat();
  }
   
  if (l < 3){
   System.out.println("Não é um polígono");
  }   
   if (l > 5){
    System.out.println("Polígono não identificado");
   }

    }
    
}
