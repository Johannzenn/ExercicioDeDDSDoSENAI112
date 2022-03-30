package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int valorA = scanner.nextInt();

        System.out.println("Digite o valor B: ");
        int valorB = scanner.nextInt();

        System.out.println("Digite o valor C: ");
        int valorC = scanner.nextInt();

        boolean valorAMaior = obterValorAMaior(valorA, valorB, valorC);
        boolean valorBMaior = obterValorBMaior(valorA, valorB, valorC);
        boolean valorCMaior = obterValorCMaior(valorA, valorB, valorC);

        boolean valorAMenor = obterValorAMenor(valorA, valorB, valorC);
        boolean valorBMenor = obterValorBMenor(valorA, valorB, valorC);
        boolean valorCMenor = obterValorCMenor(valorA, valorB, valorC);

        if (valorAMaior) {
            System.out.println("valor 'A' é maior");
        }
        else if (valorBMaior) {
            System.out.println("valor 'B' é maior");
        }
        else if (valorCMaior) {
            System.out.println("valor 'C' é maior");
        }
        if (valorAMenor) {
            System.out.println("valor 'A' é menor");
        }
        else if (valorBMenor) {
            System.out.println("valor 'B' é menor");
        }
        else if (valorCMenor) {
            System.out.println("valor 'C' é menor");
        }
        scanner.close();
    }

    private static boolean obterValorAMaior(int valorA, int valorB, int valorC) {
        return valorA > valorB && valorA > valorC;
    }

    private static boolean obterValorBMaior(int valorA, int valorB, int valorC) {
        return valorB > valorA && valorB > valorC;
    }

    private static boolean obterValorCMaior(int valorA, int valorB, int valorC) {
        return valorC > valorA && valorC > valorB;
    }

    private static boolean obterValorAMenor(int valorA, int valorB, int valorC) {
        return valorA < valorB && valorA < valorC;
    }

    private static boolean obterValorBMenor(int valorA, int valorB, int valorC) {
        return valorB < valorA && valorB < valorC;
    }

    private static boolean obterValorCMenor(int valorA, int valorB, int valorC) {
        return valorC < valorA && valorC < valorB;
    }
}