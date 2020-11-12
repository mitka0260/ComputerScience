public class ArrayEquals214 {

    public static boolean eq(int[] e, int[] f) {
        if (e.length != f.length) return false;

        for (int i = 0; i < e.length; i++) {
            if (e[i] != f[i]) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] a = {3, 1, 5, 8};
        int[] b = {3, 1, 5, 8, 9};
        int[] c = {3, 1, 5, 9};
        int[] d = {3, 1, 5, 8};

        StdOut.println(eq(a, a));
        StdOut.println(eq(a, b));
        StdOut.println(eq(a, c));
        StdOut.println(eq(a, d));

    }

}
