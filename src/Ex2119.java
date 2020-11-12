public class Ex2119 {

/*
2.1.19.
Напишите статический метод histogram (), который получает в качестве аргументов массив а[ ] с элементами int и
целое число m и возвращает массив длины m, каждый i-й элемент которого содержит количество вхождений целого числа i
в массив а[].
Если предположить, что все значения в а[] лежат в диапазоне от 0 до m-1,
сумма значений в возвращенном массиве должна быть равна а.length.
 */

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2, 5, 1, 6, 4, 1, 2};

        int[] b = histogram(array, 7);

        StdOut.println("Сколько раз встречается каждое значение в изначальном массиве:");
        StdOut.println("0 1 2 3 4 5 6");
        StdOut.println("-------------");
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            StdOut.print(b[i] + " ");
            sum = sum + b[i];
        }

        StdOut.println(" раз");
        StdOut.print("Сумма значений в массиве = " + sum);
    }

    public static int[] histogram(int[] a, int m) {
        int[] hist = new int[m];
        for (int i = 0; i < a.length; i++) {
            //hist[a[i]]++;
            hist[a[i]] = hist[a[i]] + 1;
        }
        StdOut.println();
        return hist;
    }
}
