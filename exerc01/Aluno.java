package org.exerc01;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = 16;  // valor padrão
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método toString para exibir informações do aluno
    @Override
    public String toString() {
        return "Aluno  -  " + "Nome: " + nome   + ", Matrícula: " + matricula  + ", Idade: " + idade ;
    }
}
