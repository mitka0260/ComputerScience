public class PowersOfTwo {
    public static void main(String[] args) {

        //значения степеней 2
        int a = 0;
        while (a < 31) {
            System.out.println("2 в степени " + a + " = " + (int) Math.pow(2, a));
            a = a + 1;

            //здесь надо бы проверить, чтобы получившееся значение не превышало Integer.MAX_VALUE == 2 в степени 31 - 1

        }
    }
}
