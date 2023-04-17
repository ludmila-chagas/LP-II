package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(String nome, String celular, int duracao) {
        super(nome, celular);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMensagem(Mensagem mensagem) {
        return null;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
