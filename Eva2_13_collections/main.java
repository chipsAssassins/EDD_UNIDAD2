package Eva2_13_collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class main {
public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("Elementos en la lista: " + list);
        System.out.println("Tamaño de la lista: " + list.size());

        list.clear();
        System.out.println("Elementos en la lista después de clear(): " + list);
System.out.println("-------------------------");
        //ARRAYLIst
        //Trabaja con arreglos dinámicos, es decir, su tamaño puede cambiar durante la ejecución del programa. Se utiliza el método add() para agregar elementos y remove() para eliminar elementos.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hola");
        arrayList.add("");
        arrayList.add("Mundo");
        arrayList.add("!!!");

        System.out.println("Elementos en el ArrayList: " + arrayList);
        System.out.println("Tamaño del ArrayList: " + arrayList.size());


System.out.println("-------------------------");
        //QUEUE
        //Se utiliza para almacenar elementos de manera temporal, se utiliza el método add() para agregar elementos y poll() para eliminar el primer elemento agregado.

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}