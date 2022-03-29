package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf05 {

    static final Integer VALOR_PARA_CALCULAR_A_MEDIA = 2;
    static final Integer MEDIA_PARA_SER_APROVADO = 7;
    static final Integer MEDIA_PARA_SER_REPROVADO = 7;
    static final Integer NOTA_MAXIMA_DO_ALUNO = 10;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(a) (っ◕‿◕)っ  ");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite a primeira nota do aluno(a) (っ◕‿◕)っ ");
        int primeiraNotaDoAluno = scanner.nextInt();

        System.out.println("Por favor digite a segunda nota do aluno(a) (っ◕‿◕)っ ");
        int segundaNotaDoAluno = scanner.nextInt();

        int mediaDaNotaDoAluno = obterMediaDaNotaDoAluno(primeiraNotaDoAluno, segundaNotaDoAluno);

        boolean mediaMaior = obterMediaMaior(mediaDaNotaDoAluno);
        boolean mediaMenor = obterMediaMenor(mediaDaNotaDoAluno);
        boolean notaMaxima = obterNotaMaxima(mediaDaNotaDoAluno);
        boolean naoPassaDeDez = obterNaoPassaDeDez(primeiraNotaDoAluno, segundaNotaDoAluno);

        if (mediaMaior) {
            System.out.print("(っ◕‿◕)っ " + nome + " APROVADO");
        }
        else if (mediaMenor) {
            System.out.print("(っ◕‿◕)っ " + nome + " REPROVADO");
        }
        else if (notaMaxima){
            System.out.println("(っ◕‿◕)っ " + nome + " APROVADO COM DISTINÇÂO");
        }
        else if (naoPassaDeDez){
            System.out.println("Digite uma nota de 0 a 10");
        }
        scanner.close();
    }

    private static int obterMediaDaNotaDoAluno(int primeiraNotaDoAluno, int segundaNotaDoAluno) {
        return (primeiraNotaDoAluno + segundaNotaDoAluno) / VALOR_PARA_CALCULAR_A_MEDIA;
    }

    private static boolean obterMediaMaior(int mediaDaNotaDoAluno) {
        return mediaDaNotaDoAluno >= MEDIA_PARA_SER_APROVADO;
    }

    private static boolean obterMediaMenor(int mediaDaNotaDoAluno) {
        return mediaDaNotaDoAluno < MEDIA_PARA_SER_REPROVADO;
    }

    private static boolean obterNotaMaxima(int mediaDaNotaDoAluno) {
        return mediaDaNotaDoAluno == NOTA_MAXIMA_DO_ALUNO;
    }

    private static boolean obterNaoPassaDeDez(int primeiraNotaDoAluno, int segundaNotaDoAluno) {
        return primeiraNotaDoAluno > NOTA_MAXIMA_DO_ALUNO || segundaNotaDoAluno > NOTA_MAXIMA_DO_ALUNO;
    }
}
