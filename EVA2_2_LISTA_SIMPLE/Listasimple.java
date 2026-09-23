package EVA2_2_LISTA_SIMPLE;

import EVA2_2_LISTA_SIMPLE.Nodo.Nodos;

public class Listasimple {
    private Nodos inicio;
    private Nodos fin;

    public Listasimple(){
        inicio = null; //al crear la lista se crea vacia
        fin = null;
    }
    // Siempre se agrefan al final de la lista 
    public void agregar(int valor){
        Nodos nuevo = new Nodos(valor);//creamos nodo para el valor a insertar
        //y luego ??
        if (inicio == null){ //lista vacia?
            inicio = nuevo;
            fin = nuevo;
        } else{
            /*Nodos   temp = inicio;
            while (temp.getSiguiente() != null) { 
                temp = temp.getSiguiente();*/ // ya no necesitamos recorrer la lista, ya tenemos el fin
            Nodos temp = fin; // ya tenemos el fin, no necesitamos recorrer la lista
            temp.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    public void imprimir(){
        Nodos  temp = inicio;
        while (temp != null) {
            System.out.print("["+ temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
    }
}
