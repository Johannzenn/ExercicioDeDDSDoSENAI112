package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o número: ");
        Double n1 = scanner.nextDouble();
        Boolean numeroPositivo = n1 > 0;
        Boolean numeroNegativo = n1 < 0;
        if (numeroPositivo) {
            System.out.print("Seu número é positivo: " + n1);

        } else if (numeroNegativo) {
            System.out.print("Seu número é negativo: " + n1);
        }
    }
}
