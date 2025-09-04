package org.exerc04;

public class Main {
    public static void main(String[] args) {
        // Criando alguns filmes
        Filme filme1 = new Filme("Interestelar", "Ficção Científica", 169);
        Filme filme2 = new Filme("O Rei Leão", "Animação", 88);
        Filme filme3 = new Filme("Rambo I", "Ação", 181);

        // Exibindo informações dos filmes
        System.out.println(filme1);
        System.out.println(filme2);
        System.out.println(filme3);

        // Exibindo total de filmes cadastrados
        System.out.println("Total de filmes cadastrados: " + Filme.getTotalFilmes());
    }
}