//3.2.2
public class Stopwatch {

    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis(); //когда вызывается создание объекта, сохраняется время создания
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();  //возвращает long текущее значение времени в миллисекундах (кол-во миллисекунд от 1.01.1970)
        return (now - start) / 1000.0;  //разница во времени между началом и окончанием времени секундомера
    }

    public static void main(String[] args) {

        //программа считает одно и тоже но по-разному sqrt vs pow - и показывает сколько времени ушло на каждое вычисление

        int n = 100000000;
        Stopwatch timer1 = new Stopwatch(); //создаётся объект - начинается отсчёт времени
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++)
            sum1 += Math.sqrt(i);
        double time1 = timer1.elapsedTime();    //elapsedTime возвращает, сколько времени проработал секундомер
        StdOut.printf("%e (%.2f seconds)\n", sum1, time1);

        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++)
            sum2 += Math.pow(i, 0.5);
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum2, time2);
    }

}
