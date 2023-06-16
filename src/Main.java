// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Evento eventoPrincipal = new Evento(2);

        Cliente c1 = new Cliente("joao", eventoPrincipal);
        Cliente c2 = new Cliente("pedro", eventoPrincipal);
        Cliente c3 = new Cliente("marcelo", eventoPrincipal);
        Cliente c4 = new Cliente("thiago", eventoPrincipal);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}