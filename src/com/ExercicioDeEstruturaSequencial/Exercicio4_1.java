package com.ExercicioDeEstruturaSequencial;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra e direi se é vogal ou consoante.");
        System.out.print("Digite sua letra: ");
        String letra = scanner.nextLine();

        if (Objects.equals(letra, "A") || (Objects.equals(letra, "a")))
            System.out.println("Vogal");
        else if (Objects.equals(letra, "E") || (Objects.equals(letra, "e")))
            System.out.println("Vogal");
        else if (Objects.equals(letra, "I") || (Objects.equals(letra, "i")))
            System.out.println("Vogal");
        else if (Objects.equals(letra, "O") || (Objects.equals(letra, "o")))
            System.out.println("Vogal");
        else if (Objects.equals(letra, "U") || (Objects.equals(letra, "u")))
            System.out.println("Vogal");
        else System.out.println("Consoante");
        scanner.close();
    }
}
