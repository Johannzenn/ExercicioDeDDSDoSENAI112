package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf06 {
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

        if (valorAMaior) {
            System.out.println("valor 'A' é maior");
        }
        else if (valorBMaior) {
            System.out.println("valor 'B' é maior");
        }
        else if (valorCMaior) {
            System.out.println("valor 'C' é maior");
        }
        else {
            System.out.println("Existe notas iguais");
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
}
