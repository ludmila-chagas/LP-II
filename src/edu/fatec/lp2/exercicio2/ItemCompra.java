package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto;

    public void itemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.desconto = desconto;
    }

    public double calcularPreco() {
        double preco = this.produto.getPreco() * this.quantidade;
        double valorDesconto = preco * (this.desconto / 100);
        return preco - valorDesconto;
    }

    public String getNomeDoProduto(){
        return produto.toString();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}