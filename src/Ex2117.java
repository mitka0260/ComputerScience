public class Ex2117 {

    public static void main(String[] args) {
        String[] wordsInitial = {"1", "2", "3", "4", "5", "6", "7"};
        StdOut.print("Изначальный массив: ");
        for (int i = 0; i < wordsInitial.length; i++)
            StdOut.print(wordsInitial[i] + " ");

        /*результат заносится в новый массив, первоначальный массив остаётся неизменным*/
        String[] wordsReversed = reverse(wordsInitial);

        StdOut.println();
        StdOut.print("Изначальный массив после вызова метода, который создал новый массив: ");
        for (int i = 0; i < wordsInitial.length; i++)
            StdOut.print(wordsInitial[i] + " ");

        StdOut.println();
        StdOut.print("Изменённый ДРУГОЙ массив: ");
        for (int i = 0; i < wordsReversed.length; i++)
            StdOut.print(wordsReversed[i] + " ");

        reverseInplace(wordsInitial);

        StdOut.println();
        StdOut.print("долждно быть наоборот от изначального");
        for (int i = 0; i < wordsInitial.length; i++)
            StdOut.print(wordsInitial[i] + " ");

        StdOut.println();
        StdOut.print("Должден остаться нетронутым ");
        for (int i = 0; i < wordsReversed.length; i++)
            StdOut.print(wordsReversed[i] + " ");

    }

    public static String[] reverse(String[] a) {
        String[] c = new String[a.length];
        for (int i = 0; i <= a.length / 2; i++) {
            c[i] = a[a.length - 1 - i];
            c[a.length - 1 - i] = a[i];
        }
        return c;
    }

    public static String[] reverseInplace(String[] b) {
        String temp;
        for (int i = 0; i < b.length; i++) {
            temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = b[i];
        }
        return b;
    }
}
