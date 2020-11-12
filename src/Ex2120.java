/*
На основе фрагментов кода, приведенных в этом разделе и в разделе 1.4,
разработайте программу, которая получает целое число n как аргумент командной
строки и выводит n наборов из пяти карт, разделенных пустыми строками. Карты
сдаются из перетасованной колоды, по одной на строку. При выводе используются
названия карт (например, Асе of Clubs).
 */

public class Ex2120 {

    public static void main(String[] args) {
        int n = 3; //StdIn.readInt();
        for (int i = 0; i < n; i++) {
            String[] deck = initDeck();
            shuffle(deck);
            printDeck(deck);
        }
    }

    public static String[] initDeck() {
        String[] SUIT = {"пика", "черва", "крести", "буби"};
        String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз"};
        String[] deck = new String[SUIT.length * RANK.length];
        for (int i = 0; i < SUIT.length; i++) {
            for (int j = 0; j < RANK.length; j++) {
                deck[RANK.length * i + j] = RANK[j] + " " + SUIT[i];
            }
        }
        return deck;
    }

    public static void printDeck(String[] a) {
        for (int i = 0; i < 5; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static String[] shuffle(String[] b) {
        String temp;
        for (int i = 0; i < b.length; i++) {
            temp = b[i];
            int j = b.length - (int) (Math.random() * (b.length - 1));
            b[i] = b[j];
            b[j] = temp;
        }
        return b;
    }
}
