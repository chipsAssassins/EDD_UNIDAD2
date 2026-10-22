package Eva2_6_TiposGenericos;

public class main {
    public static void main(String[] args) {
        Ejemplo <ListaDoble> prueba = new Ejemplo<ListaDoble>();
        ListaDoble lista = new ListaDoble();
    }
}
class ListaDoble {}

class Ejemplo<T>{
    private T dato;
    public Ejemplo(){

    }
    Public Ejemplo(T dato){
        this.dato = dato;
    }
    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }

}
