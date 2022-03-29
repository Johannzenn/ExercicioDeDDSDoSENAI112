package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        Double n1 = scanner.nextDouble();

        Double area = (2*14.1415*n1);

        System.out.println("O valor da area: " + area );

        scanner.close();
    }

}
