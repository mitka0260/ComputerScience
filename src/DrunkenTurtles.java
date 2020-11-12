/*
много пьяных черепах - броуновское движение
каждый поворот - в случайном направлении
 */

public class DrunkenTurtles {

    public static void main(String[] args) {
        int n = 20;
        int trials = 1000;
        double step = 0.005;
        Turtle[] turtles = new Turtle[n];
        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniform(0.0, 0.1);
            double y = StdRandom.uniform(0.0, 1.0);
            turtles[i] = new Turtle(x, y, 0.0);
        }

        for (int t = 0; t < trials; t++) {
            for (int i = 0; i < n; i++) {
                turtles[i].turnLeft(StdRandom.uniform(0.0, 360.0));
                turtles[i].goForward(step);
            }
        }

    }
}
