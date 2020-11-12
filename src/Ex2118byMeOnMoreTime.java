public class Ex2118byMeOnMoreTime {

    public static void main(String[] args) {
        boolean[][] array = readBoolean2D();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                StdOut.print(array[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static boolean[][] readBoolean2D() {

        int M = StdIn.readInt();
        int N = StdIn.readInt();

        boolean[][] a = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = StdIn.readBoolean();
            }
        }
        return a;
    }
}
