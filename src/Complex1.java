/*
3.3.1
тригонометрическое представление в полярных координатах

Инкапсуляция - отделение клиентов от реализаций за счет сокрытия информации
Преимущество: чтобы использовать тип данных, вам не обязательно знать, как он реализован

• Чтобы сделать возможным модульное программирование
• Чтобы упростить отладку
• Чтобы сделать код программы более понятным

private - воплощение поддержки инкапсуляции, другой класс не сможет общаться с этой переменной




 *  ADT for complex numbers using polar representation.
 *
 *  % java Complex
 *  a = 5.0 + 6.0i
 *  b = -2.0000000000000004 + 2.9999999999999996i
 *  c = -27.999999999999996 + 2.9999999999999876i


 */

public final class Complex1 {
    private double r;        // distance
    private double theta;    // angle

    // constructor that takes in rectangular coordinates
    public Complex1(double re, double im) {
        r     = Math.sqrt(re*re + im*im);
        theta = Math.atan2(im, re);
    }

    // accessor methods
    public double re() { return r * Math.cos(theta); }
    public double im() { return r * Math.sin(theta); }

    // return a string representation of this complex number
    public String toString()  {
        return re() + " + " + im() + "i";
    }

    // return this Complex number plus b
    public Complex1 plus(Complex1 b) {
        Complex1 a = this;
        double re = a.r * Math.cos(a.theta) + b.r * Math.cos(b.theta);
        double im = a.r * Math.sin(a.theta) + b.r * Math.sin(b.theta);
        return new Complex1(re, im);
    }

    // return this Complex number times b
    public Complex1 times(Complex1 b) {
        Complex1 a = this;
        Complex1 c = new Complex1(0, 0);
        c.r = a.r * b.r;                // can't make r and theta final
        c.theta = a.theta + b.theta;    // because of these two statements
        return c;
    }

    // return the magnitude / absolute value of this complex number
    public double abs() { return r; }

    // sample client for testing - calculates roots of unity
    public static void main(String[] args) {
        Complex1 a = new Complex1(5.0, 6.0);
        StdOut.println("a = " + a);

        Complex1 b = new Complex1(-2.0, 3.0);
        StdOut.println("b = " + b);

        Complex1 c = b.times(a);
        StdOut.println("c = " + c);

        Complex1 z0 = new Complex1(1.0, 1.0);
        Complex1 z = z0;
        z = z.times(z).plus(z0);
        z = z.times(z).plus(z0);
        StdOut.println(z);
    }

}
