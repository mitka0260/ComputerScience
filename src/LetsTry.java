public class LetsTry {
    public static void main(String[] args) {
        int a = 0;
        int[] array = new int[40];
        for (int i = 0; i < 40; i++) {
            a = StdRandom.uniform(20);
            array[i] = a;
            StdOut.print(a + " ");
        }

        int[] hist = new int[19];
        for (int i = 0; i < array.length; i++) {
            //hist[a[i]]++;
            hist[array[i]] = hist[array[i]] + 1;
        }

        StdOut.println();
        for (int i = 0; i < hist.length; i++)
            StdOut.print(hist[i] + " ");
    }
}
