public class HistFromArrayByMyself {

    public static void main(String[] args) {

//        StdDraw.setCanvasSize(1024, 1024);  //default 512x512
//        StdDraw.setXscale(0.0, 1.0);    //default 0...1
//        StdDraw.setYscale(0.0, 1.0);    //default 0...1
//        StdDraw.setPenRadius(0.005);     //default 0.002 = 1/500 default width = 250 dots per 512px in line will be as line
//        StdDraw.point(0.3, 0.5);
//        StdDraw.line(0.01, 0.01, 0.99, 0.99);
//        StdDraw.filledRectangle(0.1, 0.1, 0.02, 0.04);    //координаты середины, 1/2ширины, 1/2высоты

        /*
        circle
        filledCircle
        square
        filledSquare
        rectangle
        filledRectangle
        (filled)polygon (double[] x, double[] y)    //массив точек, соединённых линиями

        text(x, y, String s)
        setFont (Font font)
        setPenColor(Color color) //см раздел 3.1 (можно так StdDraw.GRAY)

        StdDraw.enableDoubleBuffering();    //вывод изображения идёт на теневой холст в памяти
        отрисовка
        StdDraw.show(); //перенос сразу всего изображения с теневого холста на экран

        Анимация:
        1) очистка теневого холста clear(); //можно задать(Color color) для заполнения фона этим цветом
        2) рисование на теневом холсте
        3) вывод изображения на экран show();
        4) пауза    pause(миллисекунд);
         */

//        double[] freq = new double[5];
//        freq[0] = 0.273;
//        freq[1] = 0.266;
//        freq[2] = 0.146;
//        freq[3] = 0.247;
//        freq[4] = 0.068;
//        StdDraw.clear();
//        StdDraw.setXscale(-10.0, 10.0);    //default 0...1
//        StdDraw.setYscale(0.0, 1.0);    //default 0...1
//        //for (int i = 0; i < freq.length; i++)
//            //StdDraw.filledRectangle(i, freq[i], 0.25, freq[i]);
//        //StdDraw.show();
//        //StdDraw.pause(10);

        int[] rnd = new int[1000];
        for (int i = 0; i < rnd.length; i++) {
            int temp = (int) (Math.random() * 1000);
            rnd[temp]++;
        }


        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setXscale(0, 1000);    //default 0...1
        StdDraw.setYscale(0, 20);    //default 0...1
        for (int i = 0; i < rnd.length; i++) {
            StdDraw.filledRectangle(i, rnd[i], 5, rnd[i]);
        }

    }
}