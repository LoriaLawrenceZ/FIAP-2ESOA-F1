package org.example;

import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);

    float nota1;
    float nota2;
    static float media;

    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");
        float nota1 = stdIn.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = stdIn.nextFloat();

        media = calcularMedia(nota1, nota2);

        System.out.println("Média do aluno é: " + media);
    }

    private static float calcularMedia(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }
}