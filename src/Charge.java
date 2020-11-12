public class Charge {
    //определяем свой тип данных Charge для закона Кулона
    //тип данных реализуется в классе
    //электрический потенциал в данной точке = k*q / r
    //k = 8.99 * 10(9) Н*м2 / Кл2

    //метод toString возвращет строковое представление заряда

    //переменные экземпляров
    //конструкторы
    //методы экземпляров

    //модификаторы уровня доступа/видимости public, private, final
    //public - доступ со стороны клиентского кода
    //private -
    //final - значение не может изменяться после инициализации

    //объявляется в первых строках кода, НЕ В МЕТОДЕ main
    private final double rx, ry;    //позиция заряда на плоскости
    private final double q;         //величина заряда
    //имеют разные значения для каждого объекта Charge!!!
    //это переменные экземпляра

    //конструктор создаёт объект "заряженная частица" + представляет ссылку на него - может быть перегруженным
    //конструктор НИЧЕГО не возвращает (точнее, возвращает ссылку на созданный объект)
    //инициализирует переменные экземпляра значениями, переданными  клиентом в качестве аргументов
    public Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }

    //метод potentialAt() возвращает потенциал в точке (x,y)
    public double potentialAt(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    //метод toString возвращет строковое представление заряда
    public String toString() {
        return q + " at " + "(" + rx + ", " + ry + ")";
    }

    //здесь этот меод нужен только для тестирования
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);     //проверяемая точка
        double y = Double.parseDouble(args[1]);
        Charge c1 = new Charge(0.51, 0.63, 21.3);
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        StdOut.println(c1);
        StdOut.println(c2);
        double v1 = c1.potentialAt(x, y);
        double v2 = c2.potentialAt(x, y);
        StdOut.printf("%.2e\n", (v1 + v2));
    }

    /*
    Создаётся два объекта charge. Теперь надо узнать потенциал, который появляется от этих зарядов в точке (x, y)
     */

}
