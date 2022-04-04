package com.ExercicioDeEstruturaSequencial;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio3_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu sexo");
        System.out.print("M para masculino e F para feminino, qualquer outra S para indefinido");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "M") || (Objects.equals(letra, "m"))) {
            System.out.print("Masculino");
        } else if (Objects.equals(letra, "F") || (Objects.equals(letra, "f"))) {
            System.out.print("Masculino");
        } else System.out.print("Indefinido");
    }}
