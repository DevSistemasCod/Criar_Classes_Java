package org.exerc04;

public class Filme {
    // Atributos privados
    private String titulo;
    private String genero;
    private int duracao; // duração em minutos

    // Atributo estático para contar total de filmes
    private static int totalFilmes = 0;

    // Construtor
    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        totalFilmes++; // Incrementa o contador a cada novo filme criado
    }

    // Método estático para retornar o total de filmes cadastrados
    public static int getTotalFilmes() {
        return totalFilmes;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Método toString
    @Override
    public String toString() {
        return "Filme {" +
                "Título = '" + titulo + '\'' +
                ", Gênero = '" + genero + '\'' +
                ", Duração = " + duracao + " min" +
                '}';
    }
}

