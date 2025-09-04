package org.exerc02;

public class Livro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getter e Setter para título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter e Setter para autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter e Setter para ano de publicação
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    // Método toString para exibir as informações do livro

    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo + '\'' +  ", autor='" + autor + '\'' +  ", anoPublicacao=" + anoPublicacao + '}';
    }
}
