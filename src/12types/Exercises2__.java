/*
это длины трёх сторон треугольника. Прогрмма проверяет, не является ли одна из сторона равной или блинне суммы двух других.
Если равна или больше, то это не могут быть длины сторон треугольника
*/

public class Exercises2__ {
    public static void main(String[] args) {

        System.out.println("Exercise 1.2.15");
        int a = 3;
        int b = 4;
        int c = 5;
        boolean d;

        d = (a < (b + c));
        d = d && (b < (a + c));
        d = d && (c < (a + b));
        System.out.println(d);
        System.out.println();

        System.out.println("Exercise 1.2.17");
        int e = 1;
        System.out.println(e);
        e = e + e; //2
        System.out.println(e);
        e = e + e; //4
        System.out.println(e);
        e = e + e; //8
        System.out.println(e);
        System.out.println();

        boolean f = true;
        System.out.println(f);
        f = !f;        //false
        System.out.println(f);
        f = !f;        //true
        System.out.println(f);
        f = !f;        //false
        System.out.println(f);
        System.out.println();

        int g = 2;
        System.out.println(g); //2
        g = g * g;
        System.out.println(g);  //4
        g = g * g;
        System.out.println(g);  //16
        g = g * g;
        System.out.println(g);    //256
        System.out.println();


        System.out.println("Exercise 1.2.19");
        //выводит случайное число между h и i
        //пример с сайта geeksforgeeks
        int i = 3;
        int h = 15;
        int j;
        int range = i - h + 1;
        for (int k = 0; k < 100; k++) {
            j = (int) (Math.random() * range) + h;
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Exercise 1.2.23");
        //программа проверяет чтобы введёный месяц и день были в промежутке между 20.03 до 20.06
        int month = 5;
        int day = 31;
        boolean isSpring = (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >= 1 && day <= 30)
                || (month == 5 && day >= 1 && day <= 31)
                || (month == 6 && day >= 1 && day <= 20);
        System.out.println(isSpring);
        System.out.println();

        System.out.println("Exercise 1.2.34 - Sorting");
        int k = 33;
        int l = 50;
        int m = 17;
        int min = Math.min(k, Math.min(l, m));
        int max = Math.max(k, Math.max(l, m));
        int median = k + l + m - min - max;
        System.out.println(min);
        System.out.println(median);
        System.out.println(max);
    }

}
