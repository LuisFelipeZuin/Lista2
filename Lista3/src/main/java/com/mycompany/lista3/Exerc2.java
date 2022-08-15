package com.mycompany.lista3;

import java.util.Scanner;

public class Exerc2 {

    
    public static void main(String[] args) {
        
     Scanner info = new Scanner(System.in);
    
     String usuario,senha;

        System.out.println("Informe o usuário:");
     usuario = info.nextLine();
       System.out.println("Informe a senha:");
     senha = info.nextLine();

     while (usuario.equalsIgnoreCase(senha) ){
       System.out.println("A senha não pode ser igual ao usuário.");  
      System.out.println("Informe o usuário:");
     usuario = info.nextLine();
     System.out.println("Informe a senha:");
     senha = info.nextLine();
     }




    }
    
}
