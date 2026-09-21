package EVA2_2_LISTA_SIMPLE;

public class main {
    public static void main(String[] args) {
        
    }
    public static class Nodo{
        //Dos atributos
        //int valor;
        private int valor; 
        //Referencia al siguiente nodo
        private Nodo siguiente;
        //constructores
        public Nodo(){
            this.siguiente = null; //Esto es muy importante, MARCA EL FINAL DE LA LISTA
        }
        public Nodo(int valor){// Poner el valor a guardar, al momento de crear el nodo
            this.valor = valor;
            this.siguiente = null;
        }
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public Nodo getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
    
    
}
