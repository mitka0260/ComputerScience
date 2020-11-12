/*
пьяная черепаха - броуновское движение
каждый поворот - в случайном направлении
 */

public class DrunkenTurtle {
    public static void main(String[] args) {
        int trials = 1000;
        double step = 0.01;
        Turtle turtle = new Turtle(0.5, 0.5, 0.0);
        for (int t = 0; t < trials; t++) {
            turtle.turnLeft(StdRandom.uniform(0.0, 360.0));
            turtle.goForward(step);
        }

    }
}
