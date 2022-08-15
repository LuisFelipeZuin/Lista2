package com.mycompany.lista3;

import java.util.Scanner;

public class Lista3 {

    public static void main(String[] args) {
       Scanner n = new Scanner(System.in);

       float nota;
        System.out.println("Dê uma nota de 0 a 10");  
        nota = n.nextFloat();
        
        
        while (nota < 0 || nota >10){
         System.out.println("Número inválido, digite outro.");   
         nota = n.nextFloat();
        } 





    }
}
