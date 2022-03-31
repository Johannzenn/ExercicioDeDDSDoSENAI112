package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 'M' para matutino, 'V' para vespertino e 'N' para noturno");
        char caractere = scanner.nextLine().charAt(0);

        boolean matutino = caractere == 'M';
        boolean vespertino = caractere == 'V';
        boolean noturno = caractere == 'N';

        if (matutino) {
            System.out.println("BOM DIA");
        }
        else if (vespertino) {
            System.out.println("BOA TARDE");
        }
        else if (noturno) {
            System.out.println("BOA NOITE");
        }
        else {
            System.out.println("INVALIDO");
        }
    }
}
