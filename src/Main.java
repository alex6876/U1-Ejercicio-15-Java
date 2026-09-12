public class Main {
    public static void main(String[] args) {
        TanqueDeAgua agua = new TanqueDeAgua(1000,500);
        agua.consumir(250);
        agua.llenar(568);
        agua.mostrar();
    }
}