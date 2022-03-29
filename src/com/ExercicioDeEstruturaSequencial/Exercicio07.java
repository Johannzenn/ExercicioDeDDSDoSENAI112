package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dobroDaArea = 2;

        System.out.print("Digite um valor para calcular a área do quadrado: ");
        Integer ladoDoQuadrado = scanner.nextInt();

        int valorArea = ladoDoQuadrado * ladoDoQuadrado;

        System.out.println("O valor da área do quadrado: " + valorArea);
        System.out.println("O dobro da área: " + (valorArea * dobroDaArea));

        scanner.close();

    }
}