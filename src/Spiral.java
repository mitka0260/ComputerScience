/*
3.2.5
логарифмическая спираль

та же черепаха, только после каждого перемещения длина шага уменьшается

*/

public class Spiral {
    public static void main(String[] args) {
        int n = 6;
        double decay = 1.01; //насколько уменьшается шаг 1.0 ... 1.000004 или n=1140 и 1.00004
        double angle = 360.0 / n;
        double step = Math.sin(Math.toRadians(angle / 2));
        Turtle turtle = new Turtle(0.5, 0, angle / 2);

        for (int i = 0; i < 10 * 360 / angle; i++) {    //черепаха делает 10 полных оборотов
            step /= decay;
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }
    }
}
