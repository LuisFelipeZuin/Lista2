package com.mycompany.lista3;

import java.util.Scanner;

public class Exerc11 {

    
    public static void main(String[] args) {
       
      Scanner in = new Scanner(System.in);
		
     int n1,n2,soma;

      System.out.println("Primeiro número:");
	 n1 = in.nextInt();
		
	System.out.println("Segundo número:");
	 n2 = in.nextInt();
		
	soma=0;
	for(int i = n1; i <=n2; i++ ) {
	if (i > n1 && i<n2){            
        System.out.println(i); 
         }			
	soma +=i;
	}
       System.out.print("A soma do intervalo é: "+soma);

    }
    
}