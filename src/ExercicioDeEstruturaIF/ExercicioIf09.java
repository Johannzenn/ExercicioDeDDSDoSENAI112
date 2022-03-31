package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite um numero: ");
        byte numeroUm = scanner.nextByte();

        System.out.println("Digite mais um numero: ");
        byte numeroDois = scanner.nextByte();

        System.out.println("Digite mais um numero: ");
        byte numeroTres = scanner.nextByte();

        boolean numeroUmMaior = numeroUm > numeroDois && numeroUm > numeroTres;
        boolean numeroDoisMaior = numeroDois > numeroUm && numeroDois > numeroTres;
        boolean numeroTresMaior = numeroTres > numeroUm && numeroTres > numeroDois;

        if (numeroUmMaior) {
            System.out.println("n");
        }
    }
}
