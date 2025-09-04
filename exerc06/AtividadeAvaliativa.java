package org.exerc06;

public class AtividadeAvaliativa {
    // Atributos privados
    private String nome;
    private float nota;
    private int peso;

    // Atributo estático para contar total de atividades
    private static int totalAtividades = 0;

    // Construtor
    public AtividadeAvaliativa(String nome, float nota, int peso) {
        this.nome = nome;
        this.nota = nota;
        this.peso = peso;
        totalAtividades++; // Incrementa contador a cada nova atividade criada
    }

    // Método estático para retornar total de atividades
    public static int getTotalAtividades() {
        return totalAtividades;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    // Método toString para exibir as informações da atividade
    @Override
    public String toString() {
        return "AtividadeAvaliativa {" +
                "Nome = '" + nome + '\'' +
                ", Nota = " + nota +
                ", Peso = " + peso +
                '}';
    }
}

