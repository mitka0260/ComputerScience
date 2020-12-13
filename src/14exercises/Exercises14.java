public class Exercises14 {
    public static void main(String[] args) {


        int[] a = new int[1000];
        for (int i = 0; i < 1000; i++)
            a[i] = i;
//	System.out.println(a[1000]);	//такого элемента нет, индексы элементов массива = от 0 до 999 = всего 1000шт


        int n = 1000;
        //int[] b = new int[n*n*n*n];		//длинна массива выходит за пределы int
        //System.out.print(b.length);	//NegativeArraySizeException

        //переставим значения в массиве - такой метод может называться swap
        int[] c = new int[20];
        int temp;
        for (int i = 0; i < 20; i++) {
            c[i] = i + 1;
            System.out.print(c[i] + " ");
        }
        System.out.print("\nIn reversed order: ");

        for (int j = 0; j < 20 / 2; j++) {
            temp = c[j];
            c[j] = c[c.length - 1 - j];
            c[c.length - 1 - j] = temp;
        }
        for (int j = 0; j < 20; j++)
            System.out.print(c[j] + " ");

//ex147
        System.out.println();
        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            d[i] = 9 - i;
            System.out.print(d[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
            //System.out.print(a[i] + " ");
        }
        for (int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");


        //ex148 - Fibonacci
        System.out.print("\nFibonacci: 0 ");
        n = 10;
        int[] e = new int[n];
        e[0] = 1;
        e[1] = 1;
        for (int i = 2; i < n; i++) {
            e[i] = e[i - 1] + e[i - 2]; //следующий элемент массива = сумме двух предыдущих
        }
        for (int i = 0; i < n; i++)
            System.out.print(e[i] + " ");

        System.out.println();
        //ex149
        int[] f = {1, 2, 3};
        int[] g = {1, 2, 3};
        System.out.println(f == g);
        //ответ false, так как true будет только если оба массива будут ссылаться на то же место в памяти
        //а здесь это два РАЗНЫХ массива с одинаковыми значениями
        //чтобы сравнить массивы, надо сравнивать каждые их элементы между собой ПЕРЕБОРОМ


//транспонирование-копирование матриц
        // create n-by-n matrix
        System.out.println("Initial matrix: ");
        n = 10;
        int[][] h = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h[i][j] = n*i + j;
                System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        // transpose in-place
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                temp = h[i][j];
                h[i][j] = h[j][i];
                h[j][i] = temp;
            }
        }

        // print out transposed matrix
        System.out.println("\nAfter: ");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", h[i][j]);
            }
            System.out.println();
        }

    }
}
