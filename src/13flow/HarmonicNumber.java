public class HarmonicNumber {

    public static void main(String[] args) {

        //summa 1/1 + 1/2 + 1/3 + ... + 1/n


        int n = 20;
        double sum = 0.0;
        for (int a = 1; a <= n; a++) {
            sum = sum + 1.0 / a;
        }
        System.out.println(sum);

    }
}