package com.mycompany.lista3;

import java.util.Scanner;

public class Exerc8 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
   Scanner n = new Scanner(System.in);

  float a,b,c,d,e,soma,media;

      System.out.println("Informe o primeiro número:");
      a = n.nextFloat();
      System.out.println("Informe o segundo número:");
      b = n.nextFloat();
      System.out.println("Informe o terceiro número:");
      c = n.nextFloat();
      System.out.println("Informe o quarto número:");
      d = n.nextFloat();
      System.out.println("Informe o quinto número:");
      e = n.nextFloat();
     
      soma = (a+b+c+d+e);
    System.out.println("A soma dos números é: " + soma);
    
    media = ((a+b+c+d+e)/5);
    System.out.println("A média dos números é: " + media);

    }
    
}
