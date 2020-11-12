public class Ex2114 {

    public static void main(String[] args) {
        int account = 1154234731;
        StdOut.println(account);

        int[] digits = new int[11];
        for (int i = 9; i >= 0; i--) {
            digits[9 - i] = account / (int) Math.pow(10, i);
            account = account - digits[9 - i] * (int) Math.pow(10, i);
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                sum += digits[i];
            else
                sum += 2 * digits[i] / 10 + 2 * digits[i] % 10;
        }
        digits[10] = sum;
        for (int i = 0; i < 11; i++) {
            StdOut.print(digits[i]);
        }
    }

}
