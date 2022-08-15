package com.mycompany.lista3;

import java.util.Scanner;

public class Exerc5 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h1, t1, h2, t2;
        int i = 0, escolha = 0;

     while (escolha !=2){
         System.out.println("1- Introduzir dados");
         System.out.println("2- Sair");
         escolha = sc.nextInt();

         switch (escolha){
            case 1:
            System.out.println("Informe a quantidade da população A: ");
            h1 = sc.nextDouble();
            System.out.println("Informe a taxa de crescimento da população A: ");
            t1 = sc.nextDouble();
            System.out.println("Informe a quantidade da população B:");
            h2 = sc.nextDouble();
            
            while (h2 <= h1){
              System.out.println("O valor não pode ser menor ou igual a primeira");
              System.out.println("Indique um novo valor para a população B: ");
              h2 = sc.nextDouble();
              }
              System.out.println("Escreva a taxa de crescimento da população B: ");
              t2 = sc.nextDouble();
              
            while (t2 >= t1){
              System.out.println("Se a taxa de crescimento da população B for maior ou igual a primeira," +
              " automaticamente a primeira não ultrapassará a segunda");
              System.out.println("Indique uma nova taxa para a população B:");
              t2 = sc.nextDouble();
              }
                
            while (h1 < h2) {
              h1 = h1 * t1 + h1;
              h2 = h2 * t2 + h2;
              i++;
              }
               System.out.println("Serão necessários: " + i + " anos");
                break;
                
            case 2:
              System.out.println("Finalizado!");
              break;
              default:
              System.out.println("Número incorreto.");
            }
        }
    }
}
