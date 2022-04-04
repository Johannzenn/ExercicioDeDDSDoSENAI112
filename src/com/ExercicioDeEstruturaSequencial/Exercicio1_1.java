package com.ExercicioDeEstruturaSequencial;

import com.sun.deploy.security.SelectableSecurityManager;

import  java.util.Scanner;

public class Exercicio1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primero número");
        Double n1 = scanner.nextDouble();
        System.out.print("Insira o segundo número");
        Double n2 = scanner.nextDouble();

        if (n1 > n2) {
            System.out.print("Seu número é: " + n1);

        } else{
            System.out.print("Seu número é: " + n2);
        }
    }
}