public class TwoDimArrays {

    public static void main(String[] args) {

        //m - строки
        //n - столбцы


        //это тоже самое что внизу = инициализация + заполнили нулями

        int m = 5, n = 4;

        double[][] a = new double[m][n];    //double[][] a;         a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i * j;
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
/*
2-х мерные массивы - это одномерный массив (столбец), каждый элемент которого - одномерный массив=строка
a[i] - это вся строка i, то есть
a[][j] - это не столбец, для столбца такого обозначения НЕТУ

инициализация двумерного массива:
double[][] a = {
	{1, 2, 3, 4},
	{4, 7, 4, 4}
};
*/

        //суммирование матриц
        double[][] sum1 = {{0.70, 0.20, 0.10}, {0.30, 0.60, 0.10}, {0.50, 0.10, 0.40}};
        double[][] sum2 = {{0.20, 0.30, 0.50}, {0.10, 0.20, 0.10}, {0.10, 0.30, 0.40}};

        n = 3;
        double[][] sum = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = sum1[i][j] + sum2[i][j];
                System.out.printf("%5.2f", sum[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        //умножение матриц - элемент [i][j] = скалярному произведению строки a[i][] на столбец b[][j]
        double[][] mult = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    mult[i][j] += sum1[i][k] * sum2[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5.2f", mult[i][j]);
            }
            System.out.println();
        }



    }
}
