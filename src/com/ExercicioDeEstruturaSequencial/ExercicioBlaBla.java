package com.ExercicioDeEstruturaSequencial;

import java.util.Scanner;

public class ExercicioBlaBla {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 se sua for maior ou igual a 70 ou 2 para menor que 70 ");
        Double nota = scanner.nextDouble();
        Boolean passou = nota.equals(70);
        if (!passou){
        nota = Double.valueOf(70);

        }

        Double notaMenor = scanner.nextDouble();
        System.out.print("parabens" + passou);

        System.out.print("Infelizmente vc esta de recuperação" + notaMenor);
    }
}
