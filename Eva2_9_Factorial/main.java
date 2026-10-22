package Eva2_9_Factorial;

public class main {
    public static void main(String[] args) {
        System.out.println(factorialCiclo(5));
        
    }
    public static int factorialCiclo(int valor) {
    int resu = 1;
    for (int i = 1; i <= valor ; i++){
            resu *=i;
    }
    return resu;
    }
    public static int imprimirRecu(int numero) {
    if (numero == 0 ){
        return 1 ;
    }else {
        return numero * imprimirRecu(numero -1);
    }
}
}

