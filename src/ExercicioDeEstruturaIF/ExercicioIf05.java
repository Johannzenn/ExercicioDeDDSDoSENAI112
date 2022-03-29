package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf05 {

    static final Integer VALOR_PARA_CALCULAR_A_MEDIA = 2;
    static final Integer MEDIA_PARA_SER_APROVADO_OU_REPROVADO = 7;
    static final Integer NOTA_MAXIMA_DO_ALUNO = 10;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(a) (っ◕‿◕)っ\n-->  ");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite a primeira nota do aluno(a) (っ◕‿◕)っ\n--> ");
        int primeiraNotaDoAluno = scanner.nextInt();

        System.out.println("Por favor digite a segunda nota do aluno(a) (っ◕‿◕)っ\n--> ");
        int segundaNotaDoAluno = scanner.nextInt();

        int mediaDaNotaDoAluno = (primeiraNotaDoAluno + segundaNotaDoAluno) / VALOR_PARA_CALCULAR_A_MEDIA;

        boolean mediaMaior = mediaDaNotaDoAluno >= MEDIA_PARA_SER_APROVADO_OU_REPROVADO;
        boolean mediaMenor = mediaDaNotaDoAluno >= MEDIA_PARA_SER_APROVADO_OU_REPROVADO;

        if (mediaMaior){
            System.out.println("");
        }
    }
}
