public class Factors {
    public static void main(String[] args) {

        /*разложение n на простые множители
         */

        long n = 48;

        for (long factor = 2; factor <= n / factor; factor++) {

            //проверка потенциального множителя
            while (n % factor == 0) {
                n = n / factor;
                System.out.print(factor + " ");
            }    //любой множитель n должен быть больше factor

        }
        if (n > 1) System.out.print(n);
        System.out.println();

    }
}
