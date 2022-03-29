package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        boolean letraVogal = letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
        boolean letraConsoante = letra == 'B' || letra == 'C' || letra == 'D' || letra == 'F' || letra == 'G' || letra == 'H' || letra == 'J' || letra == 'K' || letra == 'L' || letra == 'M' || letra == 'N' || letra == 'P' || letra == 'Q' || letra == 'R' || letra == 'S' || letra == 'T' || letra == 'V' || letra == 'W' || letra == 'X' || letra == 'Y' || letra == 'Z' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' || letra == 'q' || letra == 'r' || letra == 's' || letra == 't' || letra == 'v' || letra == 'w' || letra == 'x' || letra == 'y' || letra == 'z';

        if (letraVogal){
            System.out.println("Vogal");
        }
        else if (letraConsoante){
            System.out.println("Consoante");
        }
        else{
            System.out.println("Erro.");
        }
        scanner.close();
    }
}
