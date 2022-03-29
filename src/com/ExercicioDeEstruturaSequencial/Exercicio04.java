package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu o nome do aluno: ");
        String nomeDoAluno = scanner.nextLine();

        System.out.print("Digite o valor do primeiro bimestre: ");
        Double numeroUm = scanner.nextDouble();

        System.out.print("Digite o valor do segundo bimestre: ");
        Double numeroDois = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro bimestre: ");
        Double numeroTres = scanner.nextDouble();

        System.out.print("Digite o valor do quarto bimestre: ");
        Double numeroQuatro = scanner.nextDouble();

        double mediaFinal = (numeroUm + numeroDois + numeroTres + numeroQuatro)/4;

        System.out.println("A média do aluno " + nomeDoAluno + " é " + mediaFinal);

        scanner.close();

    }

}