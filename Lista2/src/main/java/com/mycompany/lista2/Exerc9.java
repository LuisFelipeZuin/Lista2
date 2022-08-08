package com.mycompany.lista2;

import java.util.Scanner;

public class Exerc9 {

    
    public static void main(String[] args) {
       
   Scanner id = new Scanner(System.in);
       
   float h,peso_ideal;
   char sexo = 0; 
   
   System.out.println("Informe sua altura:");

   h = id.nextFloat();
   
   while(sexo != 'm' && sexo != 'f') {         
   System.out.println("Informe seu sexo m/f: ");         
   sexo = id.next().charAt(0);             
   if(sexo != 'm' && sexo != 'f') {            
   System.out.println("Sexo não reconhecido.");     
     }         
    }

    if(sexo == 'm') {             
     peso_ideal = (float)((h * 72.7) - 58);             
    System.out.printf("Seu peso ideal é de %.2f", peso_ideal);
    }          
    
    if (sexo == 'f'){              
    peso_ideal = (float)((h * 62.1) - 44.7);
    System.out.printf("Seu peso ideal é de %.2f",peso_ideal);
    }
                
    
        }
 }