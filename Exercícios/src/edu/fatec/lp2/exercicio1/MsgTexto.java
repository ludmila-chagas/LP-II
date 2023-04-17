package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(String nome, String celular, int numChar) {
        super(nome, celular);
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMensagem(Mensagem mensagem) {
        return null;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
