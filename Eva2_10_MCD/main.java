package Eva2_10_MCD;

public class main {
        public static void main(String[] args) {
        System.out.println(mcdRecu(48, 18));
    }
    public static int mcdRecu(int a, int b) {
    if (b == 0 ){
        return a ;
    }else {
        return mcdRecu(b, a % b);
    }
}
}
