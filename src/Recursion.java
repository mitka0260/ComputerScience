public class Recursion {

    //рекурсия - это замаскированный цикл

    public static void main(String[] args) {
/*        int n = 1;
        for (int i = 1; i < 6; i++)
            n = n * i;
        StdOut.println("5! = " + n);
        StdOut.println("5! через рекурсию = " + factorial(5));
        StdOut.println();
        StdOut.println("гармоническое число для 20 = " + harmonic(20));
        StdOut.println();
        StdOut.println("НОД для 1440 и 408 = " + gcdEuclid(1440, 408));
        StdOut.println();
        StdOut.println("Ханойские башки для 3 дисков = ");
        TowersOfHanoi(2, true); //для 3 дисков, true для left обозначает,что программа перемещает диски на левый стержень
        StdOut.println();
        //draw(3, 0.5, 0.5, 0.5);
        StdOut.println();
        StdOut.println(fibonacci(20, 10));
        StdOut.println();
        StdOut.print(fibonacci(0) + " ");
        StdOut.print(fibonacci(1) + " ");
        StdOut.print(fibonacci(2) + " ");
        StdOut.print(fibonacci(3) + " ");
        StdOut.print(fibonacci(4) + " ");
        StdOut.print(fibonacci(5) + " ");
        StdOut.print(fibonacci(6) + " ");
        StdOut.print(fibonacci(7) + " ");
        StdOut.print(fibonacci(8) + " ");
        StdOut.print(fibonacci(9) + " ");
        StdOut.print(fibonacci(10) + " ");
        StdOut.print("                   " + fibonacci(11));
        StdOut.println();
        StdOut.println(lcs("GGCACCACG", "ACGGCGGATACG"));
        StdOut.println();
        StdOut.println("Упражнения");
        StdOut.println(factorial(35));  //нельзя запускать с отрицательнеым значением
        StdOut.println(factorial(37));
        StdOut.println();
        StdOut.println(logFact(5)); */
        StdOut.println();
        ex233(6);
        StdOut.println();
        StdOut.println();
        StdOut.println(ex234(6));
    }

/*    public static long factorial(int n) {
        if (n < 0) {
            StdOut.println("нельзя вычислить факториал отрицательного числа");
            return 0;
        }
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static double harmonic(int n) {
        if (n == 1)
            return 1.0;
        return harmonic(n - 1) + 1.0 / n;
    }

    public static int gcdEuclid(int p, int q) {
        if (q == 0)
            return p;
        return gcdEuclid(q, p % q);
    }

    public static void TowersOfHanoi(int n, boolean left) {
        if (n == 0)
            return;
        TowersOfHanoi(n - 1, !left);
        if (left)
            StdOut.println(n + " left");
        else
            StdOut.println(n + " right");
        TowersOfHanoi(n - 1, !left);
    }

    public static void drawH(double x, double y, double size) {

        // compute the coordinates of the 4 tips of the H
        double x0 = x - size / 2;
        double x1 = x + size / 2;
        double y0 = y - size / 2;
        double y1 = y + size / 2;

        // draw the 3 line segments of the H
        StdDraw.line(x0, y0, x0, y1);    // left  vertical segment of the H
        StdDraw.line(x1, y0, x1, y1);    // right vertical segment of the H
        StdDraw.line(x0, y, x1, y);    // connect the two vertical segments of the H
    }

    // plot an order n H-tree, centered on (x, y) of the given side length
    public static void draw(int n, double x, double y, double size) {
        if (n == 0) return;
        drawH(x, y, size);

        // compute x- and y-coordinates of the 4 half-size H-trees
        double x0 = x - size / 2;
        double x1 = x + size / 2;
        double y0 = y - size / 2;
        double y1 = y + size / 2;

        // recursively draw 4 half-size H-trees of order n-1
        draw(n - 1, x0, y0, size / 2);    // lower left  H-tree
        draw(n - 1, x0, y1, size / 2);    // upper left  H-tree
        draw(n - 1, x1, y0, size / 2);    // lower right H-tree
        draw(n - 1, x1, y1, size / 2);    // upper right H-tree
    }

    //сначала вычисляет весь ряд чисел фибоначчи, и выводит нужное из них
    public static int fibonacci(int n, int m) {
        int array[] = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; i++)
            array[i] = array[i - 1] + array[i - 2];
        for (int i = 0; i < n; i++)
            StdOut.print(array[i] + " ");
        StdOut.println();
        return (array[m - 1]);
    }

    //ряд фибоначчи рекурсией
    //алгоритм не вычисляет все члены много раз, если уже вычислено, то программа возвращает уже полученное число
    private static int[] f = new int[92];

    public static int fibonacci(int n) {
        f[0] = 0;
        f[1] = 1;

        if (n == 0) {
            f[n] = 0;
            return 0;
        }
        if (n == 1) {
            f[n] = 1;
            return 1;
        }
        if (f[n] > 0) return f[n];
        f[n] = fibonacci(n - 1) + fibonacci(n - 2);
        StdOut.print(f[n] + " ");
        return f[n];
    }

//    задача на сходство подстроки
//    степень сходства строк
//    найдём длинну и саму общую для двух строк подстроку
//    longest common subsequence LCS
//    если из двух строк удалить к-л символы но так, чтобы осталасьб общая для них ПОДСТРОКА
//    GGCACCACG
//    ACGGCGGATACG

//    GGCAACG

    public static String lcs(String s, String t) {  //заданные строки
        int m = s.length(), n = t.length();         //длины этих строк 9 и 12
        int[][] opt = new int[m + 1][n + 1];        //10 х 13, индексы
        for (int i = m - 1; i >= 0; i--)
            for (int j = n - 1; j >= 0; j--)
                if (s.charAt(i) == t.charAt(j))
                    opt[i][j] = opt[i + 1][j + 1] + 1;
                else
                    opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);

        //for (int i = 0; i < opt.length; i++) {
        //    for (int j = 0; j < opt[1].length; j++) {
        //        StdOut.print(opt[i][j] + " ");
        //    }
        //    StdOut.println();
        //}

        String lcs = "";
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                lcs += s.charAt(i);
                i++;
                j++;
                //StdOut.print(lcs + " ");
            } else if (opt[i + 1][j] >= opt[i][j + 1]) i++;
            else j++;
        }
        StdOut.println();
        return lcs;
    }

    public static double logFact(int a) {
        if (a == 1)
            return 0;
        return logFact(a - 1) + Math.log(a);
    }
*/

    //НАДО ПОНЯТЬ КАК ОНО РАБОТАЕТ
    public static void ex233(int n) {
        if (n <= 0)
            return;
        StdOut.print(n + " ");
        ex233(n - 2);
        ex233(n - 3);
        StdOut.print(n + " ");
    }

    //НАДО ПОНЯТЬ КАК ОНО РАБОТАЕТ
    public static String ex234(int n) {
        if (n <= 0) return " hello ";
        return ex234(n - 3) + n + ex234(n - 2) + n;
    }
}
