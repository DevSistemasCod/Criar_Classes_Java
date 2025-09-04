package org.exerc01;

public class Main {
    public static void main2(String[] args) {
        Aluno aluno = new Aluno("Carlos Silva", "12345");
        System.out.println(aluno);

        // Alterando a idade do aluno usando setter
        aluno.setIdade(18);

        // Exibindo novamente após alteração
        System.out.println(aluno);

        // Testando os getters individualmente
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Matrícula do Aluno: " + aluno.getMatricula());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
        System.out.println("Conteúdo objeto: " + aluno.toString());
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.printf("\n Valor Original do array: \n");
        for (int i : array) {
            System.out.printf(" %d",i);
        }
        modificaArray(array); //passa a referência do array
        System.out.printf("\n Os valores modificados do array são: \n");
        for (int i : array) {
            System.out.printf(" %d",i);
        }
        System.out.printf("\n array[3] Antes de modificar %d\n",array[3]);
        modificaElemento(array[3]);
        System.out.printf("\n array[3] Depois de modificar %d\n",array[3]);
    }

    /** O método recebe uma cópia de referência de um array que dá ao método
     * acesso direto ao array original em memória **/

    public static void modificaArray(int[] array) {
        for(int i = 0; i < array.length ;i++) {
            array[i] = array[i] * 2;
        }
    }

    /** O método recebe uma cópia de uma valor int  o método não pode modificar o
     *  valor int original em main **/

    public static void modificaElemento(int elemento) {
        elemento = elemento * 4;
        System.out.printf(" Valor do elemento: %d \n",elemento);
    }




}