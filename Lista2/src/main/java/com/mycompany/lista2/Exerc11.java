
package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc11 {

    
    public static void main(String[] args) {
       
   Scanner x = new Scanner(System.in);
   
   int condicao;
   float valor,desconto,juros,total;

  System.out.println("Dê o valor do produto:");
   valor = x.nextFloat();
   
   System.out.println("Escolha o método de pagamento(1 a 4):");
   System.out.println("1-À vista dinheiro/cheque.");
   System.out.println("2-À vista cartão.");
   System.out.println("3-2x sem juros."); 
   System.out.println("4-2x 10% de juros.");
   //No 1 mostrava erro 
       
       if (condicao == 1){ 
       desconto = valor * (10/100);
       total = valor - desconto;
       System.out.println("O valor com desconto é:"+ total); 
       }
       
       if (condicao == 2){
       desconto = valor * (15/100);
       total = valor - desconto;
       System.out.println("O valor com desconto é:"+ total);
       }
      
       if (condicao == 3){       
      System.out.println("O valor é:"+ valor/2 );
       }
       
       if (condicao == 4){
       desconto = valor * (10/100);
       total = valor + desconto;
       System.out.println("O valor com desconto é:"+ total);
       }





    }
    
}
