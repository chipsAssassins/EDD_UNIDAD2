package Eva2_12_ArbolBinario;

public class Nodos {
    private int valor;
    private Nodos derecha;
    private Nodos izquierda;

    public Nodos() {
    }

    public Nodos(int valor) {
        this.valor = valor;
    }

    public int getValor() { return valor; }
    public void setValor(int valor) { this.valor = valor; }

    public Nodos getDerecha() { return derecha; }
    public void setDerecha(Nodos derecha) { this.derecha = derecha; }

    public Nodos getIzquierda() { return izquierda; }
    public void setIzquierda(Nodos izquierda) { this.izquierda = izquierda; }
}