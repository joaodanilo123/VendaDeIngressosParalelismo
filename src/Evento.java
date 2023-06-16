import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Evento {

    private final Lock lock = new ReentrantLock();

    private int totalIngressos;

    public Evento(int totalIngressos) {
        this.totalIngressos = totalIngressos;
    }

    public void venderIngresso(Cliente cliente) {
        lock.lock();
        try {
            System.out.println("Vendendo ingresso para " + cliente.nome);

            // imagine que isso é o tempo de uma chamada ao banco
            TimeUnit.SECONDS.sleep(5);
            if (totalIngressos == 0) {
                System.out.println("Acabaram os ingressos");
                return;
            }
            cliente.totalIngressosComprados += 1;
            this.totalIngressos -= 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(totalIngressos + " ingressos disponiveis");
            lock.unlock();
        }
    }

    public int getTotalIngressos() {
        return totalIngressos;
    }

}
