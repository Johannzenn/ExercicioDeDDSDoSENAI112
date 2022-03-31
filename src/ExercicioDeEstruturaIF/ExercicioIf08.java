package ExercicioDeEstruturaIF;

import java.util.Scanner;

public class ExercicioIf08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o valor do primeiro produto: ");
        double produtoUm = scanner.nextDouble();

        System.out.println("Por favor digite o valor do segundo produto: ");
        double produtoDois = scanner.nextDouble();

        System.out.println("Por favor digite o valor do terceiro produto: ");
        double produtoTres = scanner.nextDouble();

        boolean produtoUmMenor = obterProdutoUmMenor(produtoUm, produtoDois, produtoTres);
        boolean produtoDoisMenor = obterProdutoDoisMenor(produtoUm, produtoDois, produtoTres);
        boolean produtoTresMenor = obterProdutoTresMenor(produtoUm, produtoDois, produtoTres);

        if (produtoUmMenor) {
            System.out.println("Você deve comprar o primeiro produto");
        }
        else if (produtoDoisMenor) {
            System.out.println("Você deve comprar o segundo produto");
        }
        else if (produtoTresMenor){
            System.out.println("Você deve comprar o terceiro produto");
        }
        scanner.close();
    }

    private static boolean obterProdutoUmMenor(double produtoUm, double produtoDois, double produtoTres) {
        return produtoUm < produtoDois && produtoUm < produtoTres;
    }

    private static boolean obterProdutoDoisMenor(double produtoUm, double produtoDois, double produtoTres) {
        return obterProdutoUmMenor(produtoDois, produtoUm, produtoTres);
    }

    private static boolean obterProdutoTresMenor(double produtoUm, double produtoDois, double produtoTres) {
        return obterProdutoUmMenor(produtoTres, produtoUm, produtoDois);
    }
}
