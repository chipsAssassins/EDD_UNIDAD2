public class main {
    public static void main(String[] args) {
        imprimirCiclo(5);
        imprimirRecu(5);
    }
    public static void imprimirCiclo (int numero ){
        for (int i = numero; i <= 1; i --){
            System.out.println(i + "-");
        }
        System.out.println("");
    }
    public static void imprimirRecu(int numero) {
        //Resuelve una parte del problema
        System.out.print(numero + "-");
        //Se llama a si mismo
        if(numero > 1){ 
        imprimirRecu(numero-1);
        }
        //Detener la recursividad
        
    }
}
