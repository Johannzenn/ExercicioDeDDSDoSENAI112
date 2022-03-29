package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf02 {

    static final Integer MAIOR_QUE_ZERO = 0;
    static final Integer MENOR_QUE_MENOS_UM = (-1);

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Digite um valor positivo ou negativo: ");
        int valor = scaner.nextInt();

        boolean valorPositivo = valor >= MAIOR_QUE_ZERO;
        boolean valorNegativo = valor <= MENOR_QUE_MENOS_UM;

        if (valorPositivo){
            System.out.println("Positivo ! (°-°) ");
        }
        else if (valorNegativo){
            System.out.println("Negativo ! (°-°) ");
        }
        scaner.close();
    }
}