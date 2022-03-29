package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em centimetro: ");
        Double centimetro = scanner.nextDouble();

        Double metro = centimetro/100;

        System.out.println("O valor em metros é: " + metro );

        scanner.close();
    }

}