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
            nuevo.setSiguiente(fin);
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
    public void imprimirInv(){

        for (int i = longitud() - 1; i >= 0; i--) { // esta parte de aqui se mueve desde el ultimo nodo hasta el primero
        Nodos temp = fin;
        for (int j = 0; j < i; j++) {// y esto de aqui imprime el valor de los nodos dada la posicion i 
            temp = temp.getAnterior();
        }
        System.out.print("[" + temp.getValor() + "] ");
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
}
