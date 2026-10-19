package Eva2_3_listasDobles;
import Eva2_3_listasDobles.Nodo.Nodos;

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
    //imprimir en orden inverso
    public void imprimirInv(){
        
        for (int i = longitud() - 1; i >= 0; i--) { // esta parte de aqui se mueve desde el ultimo nodo hasta el primero
        Nodos temp = inicio;
        for (int j = 0; j < i; j++) {// y esto de aqui imprime el valor de los nodos dada la posicion i 
            temp = temp.getSiguiente();
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


public int encontrarValor(int valor) {
    Nodos temp = inicio; //temp es una copia temporal del inicio de la lista sireve para no mover el  lo anoto pq me confundia que era temp 
    int posicion = 0;
    while (temp != null) {
        if (temp.getValor() == valor) {
            return posicion; // Valor encontrado, retornar la posición
        }
        temp = temp.getSiguiente();
        posicion++;
    }
    // tenia un throw new IllegalArgumentException("Valor " + valor + " no encontrado en la lista"); pero no en necesario dado que no es un error como tal, 
    // sino que el valor no se encuentra en la lista, por lo que es mejor retornar -1 para indicar que no se encontró el valor.
    System.out.println("Valor " + valor + " no encontrado en la lista"); // Valor no encontrado
    return -1; // Valor no encontrado
    
}

public void insertarEn(int valor, int posicion) {
    // Validar posición
    if (posicion < 0 || posicion > longitud()) {
        throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
    }
    
    Nodos nuevo = new Nodos(valor);
    
    if (posicion == 0) { // Insertar al inicio
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        if (fin == null) { // Si la lista estaba vacía, actualizar fin
            fin = nuevo;
        }
    } else if (posicion == longitud()) { // Insertar al final
        fin.setSiguiente(nuevo);
        fin = nuevo;
    } else { // Insertar en medio
        Nodos temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        nuevo.setSiguiente(temp.getSiguiente());
        temp.setSiguiente(nuevo);
        }
    }

public void borrarEn(int posicion){
    //primero validamos la posicion
    if (posicion <0 || posicion >= longitud()){
        throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
    } else if (posicion == 0) { 
        inicio = inicio.getSiguiente();
        if (inicio == null) { // Si la lista queda vacía, actualizar fin
            fin = null;
        }
    } else {
        Nodos temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
        
        if (temp.getSiguiente() == null) { // Si se borró el último nodo, actualizar fin
            fin = temp;
        }
    }
}
}
