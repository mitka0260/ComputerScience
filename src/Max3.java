public class Max3 {

    public static int maxF(int[] a) {
        //return Math.max(arg1, Math.max(arg2, arg3)); //проще
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static double maxF(double[] b) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) max = b[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
            StdOut.print(a[i] + " ");
        }
        
        int value = maxF(a);
        StdOut.println();
        StdOut.println(value);
        StdOut.println();
        double[] b = {2.3, 4.5, 1.2};
        StdOut.println(maxF(b));
    }
}
