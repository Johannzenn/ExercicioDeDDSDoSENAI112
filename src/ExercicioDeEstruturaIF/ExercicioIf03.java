package ExercicioDeEstruturaIF;

import java.util.Objects;
import java.util.Scanner;

public class ExercicioIf03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("| Digite 'F' para sexo feminino | Digite 'M' para sexo masculino |");
        String sexo = scanner.nextLine();

        boolean sexoMasculino = Objects.equals(sexo, "M") || Objects.equals(sexo, "m");
        boolean sexoFeminino = Objects.equals(sexo, "F") || Objects.equals(sexo, "f");

        if (sexoMasculino){
            System.out.println("sexo Masculino");
        }
        else if (sexoFeminino){
            System.out.println("sexo Feminino");
        }
        else {
            System.out.println("sexo invalido");
        }
        scanner.close();
    }
}