public class RandomInt {

    //программа на преобразование типов
    //random герерирует число от 0.0 включительно до 1.0 не включительно

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);    //аргумент командной строки преобразуется в int
        System.out.println(n);
        double r = Math.random();            //случайное число от 0.0 до 1.0 типа double
        System.out.println(r);
        int value = (int) (r * n);            //объявляется целое value, результат преобразуется в int (командой в скобках)
        System.out.println(value);


    }
}
