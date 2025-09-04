# Criar_Classes_Java

1 - Desenvolva em linguagem Java o programa para cadastrar alunos em seu sistema. Cada aluno deve ter um nome, matrícula (código) e idade.
 Assim , implemente uma classe Aluno com:
- Atributos privados: nome, matricula e idade.
- Construtor que receba nome e matrícula como parâmetros, e defina idade como 16 por padrão.
- Métodos getters e setters para todos os atributos.
- Um método toString para exibir as informações do aluno.

O processo de verificação das funcionalidades da classe Aluno deve ser realizado em uma classe Principal.
Obs.: siga o paradigma de Orientação a Objetos (adote as boas práticas de POO).

---------------------------------------------------------------------------------------------------

2 -  Uma biblioteca quer desenvolver um sistema de cadastro de livros. Cada livro deve armazenar as seguintes informações: título, autor e ano de publicação.
Nesse contexto, em linguagem Java crie uma classe Livro com:
- Atributos privados: titulo, autor e anoPublicacao.
- Construtor para inicializar todos os atributos.
- Métodos getters e setters.
- Método toString para exibir as informações do livro.

O processo de verificação das funcionalidades deve ser realizado em uma classe Principal.

---------------------------------------------------------------------------------------------------

3 - Uma empresa deseja criar um sistema simples para controlar seus funcionários. Cada funcionário deve possuir: nome, cargo e salário.
Desse modo, em linguagem Java, implemente uma classe Funcionario com:
- Atributos privados: nome, cargo, salário e período de atuação.
- Construtor padrão e construtor que obrigue a inicialização dos atributos, nome, cargo e salário.
- Métodos getters e setters.
- Método toString para exibir as informações do funcionário.

O processo de verificação das funcionalidades deve ser realizado em uma classe Principal.

---------------------------------------------------------------------------------------------------

4 - Um cinema precisa de um sistema para gerenciar os filmes em exibição. Cada filme deve armazenar: título, gênero e duração (em minutos). Além disso, o cinema deseja saber quantos filmes foram cadastrados no sistema.
Desse modo, em linguagem Java implemente uma classe Filme com:
- Atributos privados: titulo, genero e duracao.
- Um atributo estático chamado totalFilmes, que deve contar quantos filmes foram criados.
- Construtor para inicializar os atributos do filme e incrementar o totalFilmes.
- Métodos getters e setters.
- Um método toString para exibir as informações do filme.
- Um método estático getTotalFilmes() que retorne quantos filmes foram cadastrados.

O processo de verificação das funcionalidades deve ser realizado em uma classe Principal.

---------------------------------------------------------------------------------------------------

5 - Escreva um código Java utilizando OO para desenvolver uma calculadora simples capaz de realizar as seguintes operações.
- Cálculo da Adição 
- Cálculo da Subtração 
- Cálculo da Divisão (trate o caso Zero) 
- Cálculo da Multiplicação 
- Sair

O processo de verificação das funcionalidades da classe Calculadora deve ser realizado em uma classe Principal.

---------------------------------------------------------------------------------------------------

6 - Implemente um código Java para gerenciar as notas de um aluno em três atividades avaliativas fixas. O sistema deverá calcular a média final do aluno, considerando as notas e os pesos de cada atividade.
Cada vez que uma atividade for criada, o sistema deverá contabilizar quantas atividades avaliativas foram cadastradas no total. Para isso, crie a classe AtividadeAvaliativa com:
- Atributos privados: nome, nota e peso.
- Um atributo estático chamado totalAtividades, que deve contar quantas atividades avaliativas foram criadas.
- Construtor para inicializar os atributos da atividade e incrementar o totalAtividades.
- Métodos getters e setters para todos os atributos.
- Um método estático chamado getTotalAtividades() que retorne o número total de atividades criadas.
- Um método toString que exiba as informações da atividade avaliativa.

- Na classe Principal:
Instancie três objetos da classe AtividadeAvaliativa com valores definidos.
Exiba as informações de cada atividade.
Exiba o total de atividades cadastradas (usando o método estático).
Calcule e exiba a média final do aluno (média ponderada entre as três atividades).

---------------------------------------------------------------------------------------------------

7 -  Faça um código Java para um sistema de controle de vendas para uma loja de roupas. Uma das funcionalidades deste sistema é calcular o preço total de uma compra realizada pelo cliente.
Para calcular o preço total, precisamos considerar os preços unitários de cada item comprado, a quantidade e possivelmente aplicar descontos sobre o valor final. Para desenvolver esse código, você deve utilizar princípios de POO, assim, implemente uma classe chamada "ItemDeVenda". Essa classe pode ter atributos como:

- String nomeDoItem: nome do item
- double precoUnitario: preço unitário do item
- int quantidadeDeItens: quantidade do item comprada
- double desconto: desconto a ser aplicado sobre o preço total 

 O processo de venda deve ser realizado em uma classe Principal capaz de contabilizar a quantidade de itens vendidos, bem como exibir o preço total, desconto e nome do item vendido.

