package EVA2_2_LISTA_SIMPLE;

import EVA2_2_LISTA_SIMPLE.Nodo.Nodos;

public class Listasimple {
    private Nodos    inicio;

    public Listasimple(){
        inicio = null; //al crear la lista se crea vacia
    }
    // Siempre se agrefan al final de la lista 
    public void agregar(int valor){
        Nodos nuevo = new Nodos(valor);//creamos nodo para el valor a insertar
        //y luego ??
        if (inicio == null){ //lista vacia?
            inicio = nuevo;

        } else{
            Nodos   temp = inicio;
            while (temp.getSiguiente() != null) { 
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);// concto de nuevo al final de la lista
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
