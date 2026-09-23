package EVA2_2_LISTA_SIMPLE;
public class main {
    public static void main(String[] args) {
        Listasimple lista = new Listasimple();
        long ini, fin, tiempo;
        ini = System.nanoTime(); // Tomamos la hora antes de empezar a ejecutar el código
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime(); // toma la hora después de ejecutar el código
        tiempo = fin - ini;
        System.out.println("Tiempo de ejecución: " + tiempo + " ns");
    }
}

