package org.exerc02;

public class Main {
    public static void main(String[] args) {
        // Criando objeto Livro
        Livro livro1 = new Livro("Iracema", "José de Alencar", 1865);

        // Exibindo informações do livro
        System.out.println(livro1);

        // Alterando ano de publicação
        livro1.setAnoPublicacao(1865);

        // Exibindo novamente após alteração
        System.out.println(livro1);

        // Testando os getters individualmente
        System.out.println("Título do Livro: " + livro1.getTitulo());
        System.out.println("Autor do Livro: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());
    }
}
