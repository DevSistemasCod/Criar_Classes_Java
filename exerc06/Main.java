package org.exerc06;

public class Main {
    public static void main(String[] args) {
        // Criando 3 atividades avaliativas manualmente (sem lista)
        AtividadeAvaliativa atividade1 = new AtividadeAvaliativa("Prova 1", (float)8.5, 2);
        AtividadeAvaliativa atividade2 = new AtividadeAvaliativa("Trabalho", (float)9.0, 1);
        AtividadeAvaliativa atividade3 = new AtividadeAvaliativa("Prova Final", 7.5F, 3);

        // Exibindo informações das atividades
        System.out.println(atividade1);
        System.out.println(atividade2);
        System.out.println(atividade3);

        // Exibindo total de atividades cadastradas
        System.out.println("\nTotal de atividades cadastradas: " + AtividadeAvaliativa.getTotalAtividades());

        // Cálculo da média ponderada (manual, sem laços)
        float somaNotasXPeso = (atividade1.getNota() * atividade1.getPeso()) +
                (atividade2.getNota() * atividade2.getPeso()) +
                (atividade3.getNota() * atividade3.getPeso());

        float somaPesos = atividade1.getPeso() + atividade2.getPeso() + atividade3.getPeso();

        float mediaFinal = somaNotasXPeso / somaPesos;

        System.out.printf("Média Final do Aluno: %.2f\n", mediaFinal);
    }
}
