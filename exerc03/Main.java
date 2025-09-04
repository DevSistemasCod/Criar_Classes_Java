package org.exerc03;

public class Main {
    public static void main(String[] args) {
        // Criando objeto Funcionario com construtor com parâmetros
        Funcionario funcionario1 = new Funcionario("Ana Souza", "Analista de Sistemas", 3500.00);

        // Exibindo informações antes de definir período de atuação
        System.out.println(funcionario1);

        // Alterando período de atuação usando setter
        funcionario1.setPeriodoAtuacao("2023 - Atual");

        // Exibindo novamente após alteração
        System.out.println(funcionario1);

        // Testando o construtor padrão
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Chico Bento");
        funcionario2.setCargo("Gerente de Projetos");
        funcionario2.setSalario(5500.00);
        funcionario2.setPeriodoAtuacao("2023 - Atual");

        // Exibindo segundo funcionário
        System.out.println(funcionario2);
    }
}
