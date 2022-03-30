package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor A: ");
        int valorA = scanner.nextInt();

        System.out.println("Digite o valor B: ");
        int valorB = scanner.nextInt();

        boolean maiorNumeroA = valorA > valorB;
        boolean maiorNumeroB = valorB > valorA;
        if (maiorNumeroA){
            System.out.println("A: " + valorA);
        }
        else if (maiorNumeroB){
            System.out.println("B: " + valorB);
        }
        else{
            System.out.println("Valores iguais !");
        }
        scanner.close();
    }
}