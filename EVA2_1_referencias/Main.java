package EVA2_1_referencias;

class Main {
     public static void main(String[] args) {

        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        System.out.println("inicio 0 "+ inicio);
        System.out.println("inicio.valor = "+ inicio.valor);
        System.out.println("inicio. otro = " + inicio.otro);
        //Crea lista de objetos
        inicio.otro = new Ejemplo();
        inicio. otro.valor = 200;// segundo objeto
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor = 300; // tercer objeto
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.valor = 400; // cuarto objeto
        
        Ejemplo sig = inicio;
        while(sig != null){
            System.out.println("sig.valor = " + sig.valor);
            sig = sig.otro;
        }
    }

    static class Ejemplo{
        int valor;
        Ejemplo otro;
    }
}