package Eva2_11_fibonacci;

public class main {
        public static void main(String[] args) {
        System.out.println(fibonacciRecu(10));

    }
    public static int fibonacciRecu(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecu(n - 1) + fibonacciRecu(n - 2);
        }
    }
}
