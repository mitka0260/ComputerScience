//счётчик - машина для голосования

public class Counter implements Comparable<Counter> {

    private final String name;
    private final int maxCount;
    private int count;          //private - нельзя изменить извне - гарантия, что подсчёт голосов будет верный

    public Counter(String id, int max) {
        name = id;
        maxCount = max;
        count = 0;
    }

    public void increment() {   //гарантия, что с числом может произойти только 1 операция +1
        if (count < maxCount)
            count++;
    }

    public int value() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
    }

    // compare two Counter objects based on their count
    public int compareTo(Counter that) {
        if (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else return 0;
    }

    public static void main(String[] args) {
        int n = 6; //Integer.parseInt(args[0];
        int trials = 600000;

        // create n counters
        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++)
            hits[i] = new Counter(i + "", trials);

        // increment trials counters at random
        for (int t = 0; t < trials; t++)
            hits[StdRandom.uniform(n)].increment();

        for (int i = 0; i < n; i++)
            StdOut.println(hits[i]);
    }

}
