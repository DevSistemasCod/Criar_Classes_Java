package org.exerc05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int opcao;
        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerTeclado.nextInt();

            double num1 = 0,  num2 = 0, resultado;

            if((opcao == 1) || (opcao == 2) || (opcao == 3) || (opcao == 4)) {
                System.out.print("Digite o primeiro número: ");
                num1 = lerTeclado.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = lerTeclado.nextDouble();
            }

            switch (opcao) {
                case 1:
                    resultado = calculadora.somar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.subtrair(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    calculadora.dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        lerTeclado.close();
    }
}
