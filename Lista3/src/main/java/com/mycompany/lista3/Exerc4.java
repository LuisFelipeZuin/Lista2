package com.mycompany.lista3;

public class Exerc4 {
    
    
    public static void main(String[] args) {
        
        double h1 = 80000,h2 = 200000,t1 = 0.03,t2 = 0.015;
        int i = 0;

        while (h1 < h2) {
            h1 = h1 * t1 + h1;
            h2 = h2 * t2 + h2;
            i++;
        }
        
        System.out.println("Serâo necessários: " + i + " anos");
    }
}
