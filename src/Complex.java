/*
3.2.6

комплексные числа
x + iy
i = корень(-1)
x - действительная часть
y - мнимая часть
i - воображаемое число
i^2 = -1
сложение: (х + iy) + (v + iw) = (х + v) + i(y + w)
умножение: (x + iy) * (v + iw) = (xv * yw) + i(yv + xw)
модуль: |x + iy | = корень[x^2+ y^2]
действительная часть: Re(x + iy ) = x
мнимая часть: Im(x + iy)= у
это всё - алгебраическое/декартово представление
 */

public class Complex {

    private final double re;    //действ часть
    private final double im;    //мнимая часть
    //эти переменные final - задаются заничения при создании объекта и не меняются в течение всей жизни объекта

    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    public Complex plus(Complex b) {
        double real = re + b.re;
        double imag = im + b.im;
        return new Complex(real, imag); //метод создаёт новый объект Complex и возвращает ссылку на него!!!
    }

    /*
    Плохо: смешение статитеского метода и методы экземпляров
    public static Complex plus (Complex a, Complex b) {
        return new Complex (a.re + b.re, a.im + b.im);
    }
    тогда вызов будет:
    z = Complex.plus(Complex.times(z, z), z0)
     */

    public Complex times(Complex b) {
        double real = re * b.re - im * b.im;
        double imag = re * b.im + im * b.re;
        return new Complex(real, imag);
    }

    public double abs() {
        return Math.sqrt(re * re + im * im);
    }

    public double re() {
        return re;
    }

    public double im() {
        return im;
    }

    public String toString() {
        return re + " + " + im + "i";
    }

    public static void main(String[] args) {
        Complex z0 = new Complex(1.0, 1.0);
        Complex z = z0;
        z = z.times(z).plus(z0);        //Обращение к переменным экземпляров того же типа !!!!!!!!!!!!!!!!!!
        StdOut.println(z);              //z=z*z + z0 = (1+i)^2 + (1+i) = (1 + 2i - 1) + (1-i) = 1+3i
        z = z.times(z).plus(z0);        //z=z*z + z0 = (1+3i) * (1+3i) + (1 + i) = (1 + 6i - 9) + (1 + i) = -7 + 7i
        StdOut.println(z);              //УДОБНО, т.к не надо выдумывать имена для промежуточных значений
        /*
        идёт обращение к значениям двух объектов - один в аргументе, другой используется для вызова метода
        a.plus(b) - обращение к переменным а: просто re и im
        для обращения к переменным b надо писать b.re и b.im
        z.times(z.plus(z0)) = z * (z + z0)
         */
    }
}
