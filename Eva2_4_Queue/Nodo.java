package Eva2_4_Queue;

public class Nodo {
      public static void main(String[] args) {
        
    }
        public static class Nodos {
        //Dos atributos
        //int valor;
        private int valor; 
        //Referencia al siguiente nodo
        private Nodos siguiente;
        //constructores
        private Nodos anterior;
        public Nodos(){
            this.siguiente = null; //Esto es muy importante, MARCA EL FINAL DE LA LISTA
            this.anterior = null;
        }
        public Nodos(int valor){// Poner el valor a guardar, al momento de crear el nodo
            this.valor = valor;
            this.siguiente = null;
            this.anterior = null;
        }
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public Nodos getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodos siguiente) {
            this.siguiente = siguiente;
        }
        public Nodos getAnterior() {
            return anterior;
        }
        public void setAnterior(Nodos anterior) {
            this.anterior = anterior;
        }

    }
}
