package Eva2_5_Stack;

public class main{
    public static void main(String[] args) {
        MyStack lista = new MyStack();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.imprimir();
        System.out.println();
        lista.push(14);
        lista.imprimir();
        System.out.println();
        lista.push(15);
        lista.imprimir();
        lista.pop();
        System.out.println();
        lista.imprimir();
    }
}