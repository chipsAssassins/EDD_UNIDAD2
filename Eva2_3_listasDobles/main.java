package Eva2_3_listasDobles;
public class main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println();
        lista.imprimirInv();  
    }
}