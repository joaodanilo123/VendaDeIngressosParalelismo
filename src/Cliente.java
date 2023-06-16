public class Cliente extends Thread{

    public String nome;
    public int totalIngressosComprados = 0;

    public Evento evento;
    public Cliente(String nome, Evento evento) {
        this.nome = nome;
        this.evento = evento;
    }

    @Override
    public void run() {
        evento.venderIngresso(this);
        System.out.println(nome + " tem " + totalIngressosComprados + " ingressos");
    }
}
