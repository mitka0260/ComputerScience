public class Ex2118byMe {

    public static void main(String[] args) {

        boolean[][] array = readBoolean2D();

        // array.length - кол-во строк
        // array[1].length) - кол-во столбцов в первой строке
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                StdOut.print(array[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static boolean[][] readBoolean2D() {
        StdOut.println("Введите кол-во строк и столбцов двумерного массива, затем необходимо кол-во true и false");

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
