package org.exerc07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        // Coletando dados do item vendido
        System.out.print("Digite o nome do item: ");
        String nome = lerTeclado.nextLine();

        System.out.print("Digite o preço unitário do item: ");
        double precoUnitario = lerTeclado.nextDouble();

        System.out.print("Digite a quantidade de itens vendidos: ");
        int quantidade = lerTeclado.nextInt();

        System.out.print("Digite o percentual de desconto (ex: 10 para 10%): ");
        double desconto = lerTeclado.nextDouble();

        // Criando objeto ItemDeVenda
        ItemDeVenda item = new ItemDeVenda(nome, precoUnitario, quantidade, desconto);

        // Exibindo as informações do item
        System.out.println("\n--- Resumo da Venda ---");
        System.out.println(item);

        // Calculando e exibindo preço total
        double precoTotal = item.calcularPrecoTotal();
        System.out.printf("Preço Total com Desconto: R$ %.2f\n", precoTotal);

        lerTeclado.close();
    }
}

