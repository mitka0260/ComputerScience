public class HistFromArrayByMyself {

    public static void main(String[] args) {

        /*
        графика:
        по умолчанию координаты от 0 до 1
        размер холста по умполчанию 512х512
        StdDraw.setCanvasSize(1024, 1024);
        setXscale(double x0, double x1) - от и до
        setYscale
        setPenRadius (double radius
         */


        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setXscale(0.0, 1.0);    //default
        StdDraw.setYscale(0.0, 1.0);    //default
        StdDraw.setPenRadius(0.02);     //default 0.002
        StdDraw.point(0.3, 0.5);
        StdDraw.line(0.01, 0.01, 0.99, 0.99);


/*      StdDraw.clear();
        for (int i = 0; i < 3; i++)
            StdDraw.filledRectangle(i, 0.1, 0.05, 0.10);
        StdDraw.show();
        StdDraw.pause(10);

 */
    }
}