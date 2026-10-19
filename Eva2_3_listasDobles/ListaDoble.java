package Eva2_3_listasDobles;

import Eva2_3_listasDobles.Nodo.Nodos;

public class ListaDoble {
    private Nodos inicio;
    private Nodos fin;

    public ListaDoble(){
        inicio = null;
        fin = null;
    }
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
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }
    public int valorEn(int posicion ) {
        //excepción
        //validar posicion 
        posicion = posicion - 1; // Ajustar la posición para que sea cero-indexada
        if (posicion < -1 || posicion >= longitud()) {
            throw new IndexOutOfBoundsException("Posición inválida: " + (posicion + 1));
        }
        Nodos temp = inicio;
        for (int i = -1; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }

    public void imprimir(){
        Nodos  temp = inicio;
        while (temp != null) {
            System.out.print("["+ temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
    }
    
    public void imprimirInv(){
    Nodos temp = fin;
    while (temp != null) {
        System.out.print("[" + temp.getValor() + "] ");
        temp = temp.getAnterior();
    }
    System.out.println();

    
    }

    
    public int longitud(){
        Nodos temp = inicio;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    //longitud o(1)
    public int longitud2(){
       return this.longitud();
    }
    public boolean listaVacia(){
         if (inicio == null){ 
            return true;
         }else 
            return false;

        }
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }
    //Insertar en 
    public void InsertarEn(int posicion, int valor){
        if (posicion < 0 || posicion > this.longitud()) {
            System.out.println("Posición inválida");
            return;
        }
        Nodos nuevo = new Nodos(valor);
        if (posicion == 0) {
            nuevo.setSiguiente(inicio);
            if (inicio != null) {
                inicio.setAnterior(nuevo);
            }
            inicio = nuevo;
            if (fin == null) {
                fin = nuevo;
            }
        } else if (posicion == this.longitud()) {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        } else {
            Nodos temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            Nodos anterior = temp.getAnterior();
            anterior.setSiguiente(nuevo);
            nuevo.setAnterior(anterior);
            nuevo.setSiguiente(temp);
            temp.setAnterior(nuevo);
        }

    }
    //Eliminar en
    public void EliminarEn(int posicion){
        if (posicion < 0 || posicion >= this.longitud()) {
            System.out.println("Posición inválida");
            return;
        }
        Nodos temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        Nodos anterior = temp.getAnterior();
        Nodos siguiente = temp.getSiguiente();
        if (anterior != null) {
            anterior.setSiguiente(siguiente);
        } else {
            inicio = siguiente;
        }
        if (siguiente != null) {
            siguiente.setAnterior(anterior);
        } else {
            fin = anterior;
        }
    }
}

