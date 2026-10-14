package EVA2_2_LISTA_SIMPLE;
public class main {
    public static void main(String[] args) {
        Listasimple lista = new Listasimple();
        /*long ini, fin, tiempo;
        ini = System.nanoTime(); // Tomamos la hora antes de empezar a ejecutar el código
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime(); // toma la hora después de ejecutar el código
        tiempo = fin - ini;
        System.out.println("Tiempo de ejecución: " + tiempo + " ns");
        System.out.println("Longitud de la lista: " + lista.longitud());*/
        System.out.println("Tamaño de la lista: "+ lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
    
        System.out.println("Tamaño de la lista: " + lista.longitud());
        System.out.println("Valor en la posición 1: " + lista.valorEn(1));
        System.out.println("Posición del valor 500: " + lista.encontrarValor(500));
        lista.imprimir();
        System.out.println("");
        lista.insertarEn(500, 0);
        lista.imprimir();
        System.out.println("");
        lista.borrarEn(3);
        System.out.println("");
        lista.imprimir();
        System.out.println("Tamaño de la lista (método 2): " + lista.longitud2());
        lista.imprimirInv();
    }
    
                                        //throws

    }

