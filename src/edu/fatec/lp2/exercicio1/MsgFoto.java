package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(String nome, String celular, int tamanho) {
        super(nome, celular);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMensagem(Mensagem mensagem) {
        return null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
