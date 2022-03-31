package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf11 {

    static final double SALARIO_REAJUSTE_DE_20 = 280.00;
    static final double SALARIO_REAJUSTE_DE_15 = 700.00;
    static final double SALARIO_REAJUSTE_DE_10 = 1500.00;
    static final double SALRIO_DE_REAJUSTE_DE_5 = 1500.00;


    static final double PORCENTAGEM_DE_20 = 20;
    static final double PORCENTAGEM_DE_15 = 15;
    static final double PORCENTAGEM_DE_10 = 10;
    static final double PORCENTAGEM_DE_05 = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o seu salário atual: ");
        double salarioInicial = scanner.nextDouble();

        System.out.println("Seu salário antes do reajuste: R$ " + salarioInicial);

        double porcentagemParaReajusteDe20 = (salarioInicial * PORCENTAGEM_DE_20) / 100;
        double porcentagemParaReajusteDe15 = (salarioInicial * PORCENTAGEM_DE_15) / 100;
        double porcentagemParaReajusteDe10 = (salarioInicial * PORCENTAGEM_DE_10) / 100;
        double porcentagemParaReajusteDe05 = (salarioInicial * PORCENTAGEM_DE_05) / 100;

        boolean reajuste20 = salarioInicial <= SALARIO_REAJUSTE_DE_20;
        boolean reajuste15 = salarioInicial >= SALARIO_REAJUSTE_DE_20 && salarioInicial <= SALARIO_REAJUSTE_DE_15;
        boolean reajuste10 = salarioInicial >= SALARIO_REAJUSTE_DE_15 && salarioInicial <= SALARIO_REAJUSTE_DE_10;
        boolean reajuste05 = salarioInicial >= SALRIO_DE_REAJUSTE_DE_5;

        if (reajuste20) {
            System.out.println(porcentagemParaReajusteDe20);
        }
        else if (reajuste15) {
            System.out.println(porcentagemParaReajusteDe15);
        }
        else if (reajuste10) {
            System.out.println(porcentagemParaReajusteDe10);
        }
        else if (reajuste05) {
            System.out.println(porcentagemParaReajusteDe05);
        }
    }
}
