//3.2.3
//see also 2.2.6

/*
данные - целые числа от 0 до n-1
класс считает сколько раз встречается каждое число и рисует столбец, высота которого пропорциональна относит. частоте
 */

public class Histogram {

    private final double[] freq;
    private double max;

    public Histogram(int n) {
        freq = new double[n];
    }

    public void addDataPoint(int i) {
        freq[i]++;          //0.0 - 1.0 - 2.0
        if (freq[i] > max)  //сразу вычисляет макс значение (надо только для масштабирования Y-оси)
            max = freq[i];
    }

    public void draw() {
        StdDraw.setYscale(0, max);
        StdStats.plotBars(freq);
    }

    //это решение задачи по подкидыванию монетки - сколько раз выпадет орёл/решка???
    //бросаем 50 раз 1000000 попыток
    public static void main(String[] args) {
        int n = 50;
        int trials = 100000;
        Histogram histogram = new Histogram(n + 1); //создали массив double[51]
        StdDraw.setCanvasSize(500, 200);
        for (int t = 0; t < trials; t++)
            histogram.addDataPoint(binomial(n));  //binomial - сколько раз из 50 выпал орёл
        histogram.draw();
    }

    // number of heads when flipping n fair coins
    // or call binomial(n, 0.5)
    public static int binomial(int n) {
        int heads = 0;
        for (int i = 0; i < n; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads++;                        //сколько раз из 50 выпал орёл
            }
        }
        return heads;
    }

}
