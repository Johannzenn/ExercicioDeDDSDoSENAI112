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

    static final double VALOR_PARA_MULTIPLICAR = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite o seu salário atual: ");
        double salarioInicial = scanner.nextDouble();

        System.out.println("Seu salário antes do reajuste: R$ " + salarioInicial);

        double porcentagemParaReajusteDe20 = (salarioInicial * PORCENTAGEM_DE_20) / VALOR_PARA_MULTIPLICAR;
        double porcentagemParaReajusteDe15 = (salarioInicial * PORCENTAGEM_DE_15) / VALOR_PARA_MULTIPLICAR;
        double porcentagemParaReajusteDe10 = (salarioInicial * PORCENTAGEM_DE_10) / VALOR_PARA_MULTIPLICAR;
        double porcentagemParaReajusteDe05 = (salarioInicial * PORCENTAGEM_DE_05) / VALOR_PARA_MULTIPLICAR;

        double salarioComReajusteDe20 = (porcentagemParaReajusteDe20 + salarioInicial);
        double salarioComReajusteDe15 = (porcentagemParaReajusteDe15 + salarioInicial);
        double salarioComReajusteDe10 = (porcentagemParaReajusteDe10 + salarioInicial);
        double salarioComReajusteDe05 = (porcentagemParaReajusteDe05 + salarioInicial);

        boolean reajuste20 = salarioInicial <= SALARIO_REAJUSTE_DE_20;
        boolean reajuste15 = salarioInicial >= SALARIO_REAJUSTE_DE_20 && salarioInicial <= SALARIO_REAJUSTE_DE_15;
        boolean reajuste10 = salarioInicial >= SALARIO_REAJUSTE_DE_15 && salarioInicial <= SALARIO_REAJUSTE_DE_10;
        boolean reajuste05 = salarioInicial >= SALRIO_DE_REAJUSTE_DE_5;

        if (reajuste20) {
            System.out.println("O reajuste foi de " + porcentagemParaReajusteDe20 + " % " + "| O seu salário atual é de : " + salarioComReajusteDe20);
        }
        else if (reajuste15) {
            System.out.println("O reajuste foi de " + porcentagemParaReajusteDe15 + " % " + "| O seu salário atual é de : " + salarioComReajusteDe15);
        }
        else if (reajuste10) {
            System.out.println("O reajuste foi de " + porcentagemParaReajusteDe10 + " % " + "| O seu salário atual é de : " + salarioComReajusteDe10);
        }
        else if (reajuste05) {
            System.out.println("O reajuste foi de " + porcentagemParaReajusteDe05 + " % " + "| O seu salário atual é de : " + salarioComReajusteDe05);
        }
        scanner.close();
    }
}
