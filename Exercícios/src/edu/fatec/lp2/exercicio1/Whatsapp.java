package edu.fatec.lp2.exercicio1;
import java.util.Arrays;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    private Whatsapp(Contatinho[] contatos){
        this.contatos = contatos;
    }

    private Whatsapp(Mensagem[] mensagem){
        mensagens = mensagem;
    }

    public void listarContatos() {
        Arrays.sort(contatos);
    }

    public void listarMensagens(){
        Arrays.sort(mensagens);
    }
}
