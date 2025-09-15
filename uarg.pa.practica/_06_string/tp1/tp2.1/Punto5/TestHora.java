public class TestHora {
    public static void main(String[] args) {
        Hora h1 = new Hora(12,21,32);
        Hora h2 = new Hora(26, 63, 70);

        System.out.println("Hora 1: " + h1.mostrarHora());
        System.out.println("Hora 2: " + h2.mostrarHora());

        h1.setHora(17);
        h1.setMinutos(15);
        h1.setSegundos(10);

        System.out.println("Hora 1 modificada: " + h1.mostrarHora());
        System.out.println("Hora 1 en minutos: " + h1.getHoraenMinutos());
    }
}