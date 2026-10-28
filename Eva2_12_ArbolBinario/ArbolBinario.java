package Eva2_12_ArbolBinario;

public class ArbolBinario {

    private Nodos root;

    public ArbolBinario() {
        root = null;
    }

    public void agregar(int valor) {
        if (root == null) {
            root = new Nodos(valor);
        } else {
            agregarRecu(root, valor);
        }
    }

    private void agregarRecu(Nodos actual, int valor) {
        if (valor > actual.getValor()) {            // derecha
            if (actual.getDerecha() != null) {
                agregarRecu(actual.getDerecha(), valor);
            } else {
                actual.setDerecha(new Nodos(valor));
            }
        } else if (valor < actual.getValor()) {     // izquierda
            if (actual.getIzquierda() != null) {
                agregarRecu(actual.getIzquierda(), valor);
            } else {
                actual.setIzquierda(new Nodos(valor));
            }
        }
        // si es igual, está repetido y no se agrega
    }

    public void preOrder() {
        preOrderRecu(root);
        System.out.println();
    }

    private void preOrderRecu(Nodos actual) {
        if (actual != null) {
            System.out.print(actual.getValor() + ", ");
            preOrderRecu(actual.getIzquierda());
            preOrderRecu(actual.getDerecha());
        }
    }
        public void inOrder() {
            inOrderRecu(root);
            System.out.println();
        }

        private void inOrderRecu(Nodos actual) {
            if (actual != null) {
                inOrderRecu(actual.getIzquierda());
                System.out.print(actual.getValor() + ", ");
                inOrderRecu(actual.getDerecha());
            }
        }

        public void postOrder() {
            postOrderRecu(root);
            System.out.println();
        }

        private void postOrderRecu(Nodos actual) {
            if (actual != null) {
                postOrderRecu(actual.getIzquierda());
                postOrderRecu(actual.getDerecha());
                System.out.print(actual.getValor() + ", ");
            }
}
}
/*
package Eva2_12_ArbolBinario;
import Eva2_12_ArbolBinario.Nodo.Nodos;

public class ArbolBinario {
    
    private Nodos root;
    public ArbolBinario(){
        root = null;
    }
    
 public void agregar(int valor){
     if(root == null){
         root = new Nodos(valor);
     }else {
         agregarRecu(root,valor);
     }
     
 }
    //METODO RECURSIBO PARA AGREGAR UN NODO 
 private void agregarRecu(Nodos actual, int valor ){
     if(valor > actual.getValor()){// A LA DERECHA
     if(actual.getIzquierda() != null){//ocupado
         agregarRecu(actual.getDerecha(), valor);
     }else{//disponible
            actual.setDerecha(new Nodos(valor));
    }
     }else if(valor < actual.getValor()){//A LA IZQUIERDA
         agregarRecu(actual.getIzquierda(), valor);
     }else{//disponible
            actual.setIzquierda(new Nodos(valor));
         
     }//ELSE -----> EL VALOR ESTA RPETIDO
 }
  public void preOrder(){
        preOrderRecu(root);
        System.out.println();
    }
    private void preOrderRecu(Nodos actual){
        if(actual != null){
            System.out.print(actual.getValor() + ", ");
            preOrderRecu(actual.getIzquierda());
            preOrderRecu(actual.getDerecha());
        }
    }
}
*/