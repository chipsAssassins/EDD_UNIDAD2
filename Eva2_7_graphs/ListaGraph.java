package Eva2_7_graphs;
import Eva2_7_graphs.Nodo.Nodos;

public class ListaGraph {
    private Nodos inicio;
    private Nodos fin;
    public int longitud ;
    
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
     public void vaciarLista(){
        inicio = null;
        fin = null;
    }

}
