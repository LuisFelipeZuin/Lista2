package com.mycompany.lista6;

import java.util.Arrays;  
import java.util.Scanner;

public class Exerc4{  
      
    public static void main (String[] args) {  
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[20]; 
        System.out.println("Digite os elementos do vetor:");
        for (int i=0; i<vet.length; i++){         
          vet[i]=sc.nextInt();
        } 
   
       int[ ] unicos = new int[ vet.length ];
        int qtd = 0;
        for( int i = 0 ; i < vet.length ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < qtd ; j++ ) {
                if( unicos[ j ] == vet[ i ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                unicos[ qtd++ ] = vet[ i ];
            }
        }

        // ajuste do tamanho do vetor resultante
        unicos = Arrays.copyOf( unicos , qtd );

        // imprime resultado
        for( int i = 0 ; i < unicos.length ; i++ ) {
            System.out.println( "" + i + " = " + unicos[ i ] );
        }

    }
} 
        
  
  
