public class Quadratic {

    //при запуске программы задаю аргументы - это string
    //программа преобразует их в double
    //при выводе программа опять преобразует их в string

    public static void main(String[] args) {

        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);

        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);

        double x = 10.0;
        double y = 3.141;
        System.out.println(x % y);


    }
}
