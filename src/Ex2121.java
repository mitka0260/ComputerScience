/*
Напишите статический метод multiply(), который получает в качестве
аргументов две квадратные матрицы и вычисляет их произведение (обе матрицы
имеют одинаковую размерность).

Дополнительное задание: сделайте так, чтобы
ваша программа работала в любых ситуациях, когда количество столбцов в первой
матрице равно количеству строк во второй матрице.
 */

public class Ex2121 {

    public static void main(String[] args) {
        double[][] a = {
                {0.70, 0.20, 0.10},
                {0.30, 0.60, 0.10},
                {0.50, 0.10, 0.40}
        };

        double[][] b = {
                {0.80, 0.30, 0.50},
                {0.10, 0.40, 0.10},
                {0.10, 0.30, 0.40}
        };

        double[][] c = multiply(a, b);
        displayMatrix(c);
        StdOut.println();

        double[][] d = {
                {.10, .20},
                {.30, .40},
                {.50, .60},
                {.70, .80}
        };

        double[][] e = {
                {.10, .20, .30, .40, .50, .60, .70, .80, .90},
                {.15, .25, .35, .45, .55, .65, .75, .85, .95}
        };

        double[][] f = multiply(d, e);

        displayMatrix(f);
    }

    public static double[][] multiply(double[][] a, double[][] b) {

        int i = a.length; //3 строки
        int j = b.length; //3 строки
        int k = b[0].length; //3 столбца

        double[][] c = new double[i][k];

        for (int l = 0; l < i; l++) {
            for (int m = 0; m < k; m++) {
                for (int n = 0; n < j; n++)
                    c[l][m] += a[l][n] * b[n][m];
            }
        }
        return c;
    }

    public static void displayMatrix(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                StdOut.printf("%5.2f", a[i][j]);
            }
            StdOut.println();
        }
    }

}
