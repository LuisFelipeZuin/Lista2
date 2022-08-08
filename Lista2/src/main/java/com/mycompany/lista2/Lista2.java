package com.mycompany.lista2;

import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        System.out.println("Digite um número para A:");
        A =sc.nextInt();
        System.out.println("Digite um número para B:");
        B =sc.nextInt();
        System.out.println("Digite um número para C:");
        C =sc.nextInt();
        
        if (A + B < C)
        System.out.println("A soma entre A e B é menor que C");



    }
}
