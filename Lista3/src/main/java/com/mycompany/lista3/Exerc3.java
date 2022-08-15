package com.mycompany.lista3;

import java.util.Scanner;

public class Exerc3 {

    
    public static void main(String[] args) {
       
    Scanner info = new Scanner(System.in);
    String nome;
    char sexo,estado;
    int idade;
    float salario;

        System.out.println("Informe o nome:");
        nome = info.nextLine();
        
        while (nome.length()<=3){
         System.out.println("Nome inválido.");   
         System.out.println("Informe o nome:");   
         nome = info.nextLine();
        }
    
        System.out.println("Informe a idade:");    
        idade = info.nextInt();

        while (idade < 0 || idade >150){
         System.out.println("Número inválido.");   
         System.out.println("Informe a idade:");
         idade = info.nextInt();
        }

        System.out.println("Informe o salário:");    
        salario = info.nextFloat();

       while (salario < 0){
         System.out.println("Número inválido.");
         System.out.println("Informe o salário:");    
         salario = info.nextFloat();  
       }

       System.out.println("Informe o sexo(f ou m):");    
         sexo = info.next().charAt(0);

      while (sexo != 'f' && sexo !='m'){
         System.out.println("Caractere inválido.");
         System.out.println("Informe o sexo:");    
         sexo = info.next().charAt(0);  
       }
        System.out.println("Informe o estado civil:");    
        estado = info.next().charAt(0);

        while (estado != 's' && estado !='c'&& estado !='v' && estado != 'd'){
         System.out.println("Caractere inválido.");
         System.out.println("Informe o estado civil:");    
         estado = info.next().charAt(0);  
       }
    }
    
}
