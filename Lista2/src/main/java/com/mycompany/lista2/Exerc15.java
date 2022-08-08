package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc15 {

    
    public static void main(String[] args) {
       
   Scanner x = new Scanner(System.in);
   float a,b,c;
   System.out.println("Informe a medida do ângulo a:");
   a = x.nextFloat();
   System.out.println("Informe a medida do ângulo b:");
   b = x.nextFloat();
   System.out.println("Informe a medida do ângulo c:");
   c = x.nextFloat();    
   
   if (a == 90 || b== 90 || c== 90 )
   System.out.println("Este é um triângulo Retângulo");
   
   if (a > 90 || b > 90 || c > 90 )
   System.out.println("Este é um triângulo Obtusângulo");

   if (a < 90 && b < 90 && c < 90 )
   System.out.println("Este é um triângulo Acutângulo");

    }
}