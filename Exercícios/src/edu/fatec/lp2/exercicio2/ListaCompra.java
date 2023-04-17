package edu.fatec.lp2.exercicio2;
import java.util.ArrayList;
import java.util.List;

public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompra;
    private int qtdeMax;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ArrayList<ItemCompra>();
    }

    public boolean incluirItem(ItemCompra item) {
        if (this.itensCompra.size() < this.qtdeMax) {
            this.itensCompra.add(item);
            return true;
        }
        return false;
    }

    public double calcularPreco() {
        double precoTotal = 0;
        for (ItemCompra item : this.itensCompra) {
            precoTotal += item.calcularPreco();
        }
        return precoTotal;
    }

    public List<ItemCompra> getItensCompra() {
        return this.itensCompra;
    }

    @Override
    public String toString() {
        return "ListaCompra [itensCompra=" + itensCompra + ", qtdeMax=" + qtdeMax + "]";
    }
}