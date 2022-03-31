package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf11 {

    static final double SALARIO_REAJUSTE_DE_20 = 280;
    static final double SALARIO_REAJUSTE_DE_15 = 700;
    static final double SALARIO_REAJUSTE_DE_10 = 1500;
    static final double SALRIO_DE_REAJUSTE_DE_5 = 1500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o seu salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Seu salário antes do reajuste: R$ " + salarioAtual);

        double 

        boolean reajuste20 = salarioAtual <= SALARIO_REAJUSTE_DE_20;
        boolean reajuste15 = salarioAtual >= SALARIO_REAJUSTE_DE_20 && salarioAtual <= SALARIO_REAJUSTE_DE_15;
        boolean reajuste10 = salarioAtual >= SALARIO_REAJUSTE_DE_15 && salarioAtual <= SALARIO_REAJUSTE_DE_10;
        boolean reajuste05 = salarioAtual >= SALRIO_DE_REAJUSTE_DE_5;
    }
}
