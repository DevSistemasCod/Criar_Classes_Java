package org.exerc05;

public class Calculadora {

    // Adição
    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Subtração
    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // Multiplicação
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // Divisão (tratando divisão por zero)
    public void dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            double resultado = (numero1 / numero2);
            System.out.println("Resultado: " + resultado);
        }
        System.out.println("Erro: Divisão por zero!");
    }

}
