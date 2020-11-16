/*
3.3.3

вроде знаю, что такоен вектор - не буду писать

здесь - вектор в n-мерном пространстве

х = (0,3,4,0), у = (0, -3, 1, -4)
х + у = (0, 0, 5, -4)
Зх = (0, 9, 12, 0)
х • у = -5
|х| = 5
х/|х| = (0, 3/5, 4/5, 0)
 */

public class Vector {

    private final double[] coords;  //это и есть вектор = координаты в виде массива, представление данных в виде массива

    public Vector(double[] a) {
        coords = new double[a.length];  //защищённая копия - для НЕИЗМЕНЯЕМОСТИ исходного массива
        for (int i = 0; i < a.length; i++)
            coords[i] = a[i];
    }

    public Vector plus(Vector that) //сложение
    {
        double[] result = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            result[i] = this.coords[i] + that.coords[i];
        return new Vector(result);
    }

    public Vector scale(double alpha)   //масштабирование
    {
        double[] result = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            result[i] = alpha * coords[i];
        return new Vector(result);
    }

    public double dot(Vector that)  //скалярное произведение
    {
        double sum = 0.0;
        for (int i = 0; i < coords.length; i++)
            sum += this.coords[i] * that.coords[i];
        return sum;
    }

    public double magnitude()   //длина вектора
    {
        return Math.sqrt(this.dot(this));
    }

    public Vector direction()   //направление (получается единичный вектор)
    {
        return this.scale(1 / this.magnitude());
    }

    public double cartesian(int i)  //i-ая координата
    {
        return coords[i];
    }

    public static void toString(Vector a)
    {
        for (int i = 0; i < a.coords.length; i++)
            System.out.print(a.coords[i] + " ");
    }

    public static void main(String[] args) {
        double[] a = {0, 3, 4, 0};
        Vector a1 = new Vector(a);
        double[] b = {0, -3, 1, -4};
        Vector b1 = new Vector(b);
        toString(a1.plus(b1));
        System.out.println();
        toString(a1.scale(3));
        System.out.println();
        System.out.println(a1.dot(b1));
        System.out.println(a1.magnitude());
        toString(a1.direction());
    }

    /*
    х + у = (0, 0, 5, -4)
    Зх = (0, 9, 12, 0)
    х • у = -5
    |х| = 5
    х/|х| = (0, 3/5, 4/5, 0)
     */


}
