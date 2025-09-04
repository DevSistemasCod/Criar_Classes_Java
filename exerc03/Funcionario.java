package org.exerc03;

public class Funcionario {
    // Atributos privados
    private String nome;
    private String cargo;
    private double salario;
    private String periodoAtuacao;

    // Construtor padrão (sem parâmetros)
    public Funcionario() {
        this.nome = "";
        this.cargo = "";
        this.salario = 0.0;
        this.periodoAtuacao = "";
    }

    // Construtor com nome, cargo e salário (periodoAtuacao não é obrigatório)
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.periodoAtuacao = "";
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter e Setter para salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Getter e Setter para período de atuação
    public String getPeriodoAtuacao() {
        return periodoAtuacao;
    }

    public void setPeriodoAtuacao(String periodoAtuacao) {
        this.periodoAtuacao = periodoAtuacao;
    }

    // Método toString para exibir informações do funcionário
    @Override
    public String toString() {
        return "Funcionario {" +
                "Nome = '" + nome + '\'' +
                ", Cargo = '" + cargo + '\'' +
                ", Salário = " + salario +
                ", Período de Atuação = '" + periodoAtuacao + '\'' +
                '}';
    }
}
