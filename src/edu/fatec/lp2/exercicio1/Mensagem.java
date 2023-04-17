package edu.fatec.lp2.exercicio1;
public abstract class Mensagem extends Contatinho {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(String nome, String celular) {
        super (nome, celular);
    }

    @Override
    public String toString() {
        return "Destinatario: " + destinatario.getNome() + ", Hora de envio: " + horaEnvio  + ", Conteúdo: " + conteudo;
    }

    public abstract Mensagem sendMensagem(Mensagem mensagem);

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
