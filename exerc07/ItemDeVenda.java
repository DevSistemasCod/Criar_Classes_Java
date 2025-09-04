package org.exerc07;

public class ItemDeVenda {
    // Atributos privados
    private String nomeDoItem;
    private double precoUnitario;
    private int quantidadeDeItens;
    private double desconto; // percentual, exemplo: 10.0 para 10%

    // Construtor
    public ItemDeVenda(String nomeDoItem, double precoUnitario, int quantidadeDeItens, double desconto) {
        this.nomeDoItem = nomeDoItem;
        this.precoUnitario = precoUnitario;
        this.quantidadeDeItens = quantidadeDeItens;
        this.desconto = desconto;
    }

    // Getters e Setters
    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // Método para calcular o preço total da compra (aplicando desconto)
    public double calcularPrecoTotal() {
        double totalSemDesconto = precoUnitario * quantidadeDeItens;
        double valorDesconto = (desconto / 100.0) * totalSemDesconto;
        return totalSemDesconto - valorDesconto;
    }

    // Método toString para exibir informações do item de venda
    @Override
    public String toString() {
        return "ItemDeVenda {" +
                "Nome = '" + nomeDoItem + '\'' +
                ", Preço Unitário = " + precoUnitario +
                ", Quantidade = " + quantidadeDeItens +
                ", Desconto = " + desconto + "%" +
                '}';
    }
}
