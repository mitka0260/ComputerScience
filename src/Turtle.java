//3.2.4
//рисование правильного многоуольника с n сторонами

//НЕ НАДО ВЫЧИСЛЯТЬ КООРДИНАТЫ КАЖДОЙ ВЕРШИНЫ!!!!
//это программа может вычислить координаты сама

public class Turtle {

    private double x, y;
    private double angle;

    public Turtle(double x0, double y0, double a0) {
        x = x0;
        y = y0;
        angle = a0;
    }

    public void turnLeft(double delta) {    //поворот на дельта градусов против часовой стрелки
        angle += delta;
    }

    public void goForward(double step) {
        double oldx = x, oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.line(oldx, oldy, x, y);
    }

    public static void main(String[] args) {
        int n = 4;                  //при больших n получается окружность
        double angle = 360.0 / n; //получится 120.0
        double step = Math.sin(Math.toRadians(angle / 2));  //sin(2.09) = 0.8660 = корень(3)/2

        Turtle turtle = new Turtle(0.5, 0.0, angle / 2);    //создаётся курсор/черепаха в точке (0.5, 0.0) и повёрнут на угол angle/2 против часовой стрелки от оси х.
        for (int i = 0; i < n; i++) {
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }
    }


}
