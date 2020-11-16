public class Square implements Function
        //это подпись = обязанность реализовать абстрактные методы интерфейса
{

    public double evaluate(double x) {
        return x * x;
    }

    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++)
            y[i] = f.evaluate(a + delta * i);
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static double integrate(Function f, double a, double b, int n) {
        double delta = (b - a) / n;
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += delta * f.evaluate(a + delta*(i+0.5));
        return sum;
    }

    public static void main(String[] args) {
        //интерфейс относится к ссылочным типам
        //переменная f1 типа Function
        //Square - объект, который является экземпляром класса, который реализует интерфейс

        Function f1 = new Square();
        System.out.println(f1.evaluate(2));

        /* Переменная интерфейсного типа может использоваться для вызова только тех методов, которые объявлены в интерфейсе
        Когда переменная интерфейсного типа используется для вызова метода, объявленного в интерфейсе, Java знает, какой метод нужно вызвать, потому что
        знает тип вызывающего объекта. Например, выражение f1.evaluate() вызовет метод evaluate(), определенный в классе Square
        */

        plot(f1, -0.6, 0.6, 50);
        System.out.println(integrate(f1, 0, 10, 1000));


        System.out.println(integrate(x->x*x, 0, 10, 1000));
        /*
        x->x*x - это ЛЯМБДА-выражение
        при такой записи не надо определять класс square
         */
    }


}
