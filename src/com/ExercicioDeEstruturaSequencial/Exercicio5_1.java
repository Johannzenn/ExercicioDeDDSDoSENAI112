package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio5_1 {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota");
        Double n1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota");
        Double n2 = scanner.nextDouble();
        double media = (n1 + n2 / 2);
        if (media > 7) {
            System.out.println(("Sua nota foi ") + media + (", você foi aprovado. "));
        } else if (media < 7) {
            System.out.println(("Sua nota foi ") + media + (", você foi reprovado. "));
        } else if (media >= 7) {
            System.out.println(("Sua nota foi ") + media + (", você foi aprovado com Distinção. "));
            scanner.close();
        }
    }
}
