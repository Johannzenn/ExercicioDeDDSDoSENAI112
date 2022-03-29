package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Integer numeroUm = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        Integer numeroDois = scanner.nextInt();

        System.out.println("A soma é : " + (numeroUm + numeroDois));

        scanner.close();
    }

}