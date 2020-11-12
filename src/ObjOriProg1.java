import java.awt.*;

public class ObjOriProg1 {

    public static void main(String[] args) {        //in1.txt in2.txt out.txt
        //"http://finance.yahoo.com/q?s=goog" goog.html
        //https://finance.yahoo.com/quote/goog?ltr=1
        //https://www.eestipank.ee/valuutakursid/export/html/latest

        Out out = new Out(args[args.length - 1]);   //указание в какой файл выводить
        for (int i = 0; i < args.length - 1; i++) {
            In in = new In(args[i]);    //создаёт поток ввода из файла
            String s = in.readAll();
            out.println(s);             //учитываются все пробемы и enter'ы
        }
        String[] array = {"in1.txt", "in2.txt", "out1.txt"};
        inOut(array);
        rubPrice();

        //SPLIT
        //разбиваю файл csv по столбцам по запятым
        String name = "DJIA";
        int n = 4;                  //кол-во полей
        String delimiter = ",";

        Out[] out1 = new Out[n];
        for (int i = 0; i < n; i++)
            out1[i] = new Out(name + i + ".txt");

        In in1 = new In(name + ".csv");
        while (in1.hasNextLine()) {
            String line = in1.readLine();
            String[] fields = line.split(delimiter);
            for (int i = 0; i < n; i++)
                out1[i].println(fields[i]);
        }

        //Draw draw = new Draw();
        //draw.circle(0.5, 0.5, 0.2);

        //filledPic(30, 150, 190);
        //albersSquares(0, 0, 255, 0, 255, 0, 255, 0, 0);
        grayHist();
        //reverse();
        //RGB();

    }

    public static void inOut(String[] args) {
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
        }
    }

    public static void rubPrice() {
        double price = priceOf("RUB");
        StdOut.println(price);
    }

    public static double priceOf(String symbol) {
        String html = readHTML(symbol);
        int p = html.indexOf("RUB", 0);
        int from = html.indexOf("<td>", p);
        String price = html.substring(from + 4, from + 11);
        return Double.parseDouble(price);
    }

    public static String readHTML(String symbol) {
        In page = new In("https://www.eestipank.ee/valuutakursid/export/html/latest");
        return page.readAll();
    }

    public static void filledPic(int r, int g, int b) {
        int width = 256;
        int height = 256;
        Color col = new Color(r, g, b);
        Picture pic = new Picture(width, height);
        for (int colT = 0; colT < width; colT++) {
            for (int rowT = 0; rowT < height; rowT++) {
                pic.set(colT, rowT, col);
            }
        }
        pic.show();
    }

    public static void albersSquares(int r1, int g1, int b1, int r2, int g2, int b2, int r3, int g3, int b3) {
        Color c1 = new Color(r1, g1, b1); //blue
        Color c2 = new Color(r2, g2, b2); //green
        Color c3 = new Color(r3, g3, b3); //red

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.2, 0.3, 0.1);
        StdDraw.filledSquare(0.2, 0.8, 0.1);

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.5, 0.3, 0.1);
        StdDraw.filledSquare(0.5, 0.8, 0.1);

        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.8, 0.3, 0.1);
        StdDraw.filledSquare(0.8, 0.8, 0.1);

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.2, 0.3, 0.05);
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.2, 0.8, 0.05);

        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.5, 0.3, 0.05);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.5, 0.8, 0.05);

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.8, 0.3, 0.05);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.8, 0.8, 0.05);
    }

    public static void grayHist() {
        Picture pic = new Picture("gray.jpg");
        int[] gray = new int[256];

        for (int col = 0; col < pic.width(); col++) {
            for (int row = 0; row < pic.height(); row++) {
                Color color = pic.get(col, row);
                int r = color.getRed();
                gray[r] = gray[r] + 1;
            }
        }

        double[] grayForHist = new double[256];
        for (int i = 0; i < grayForHist.length; i++) {
            grayForHist[i] = (double) gray[i];
        }
        StdDraw.setYscale(0, 30000);
        StdStats.plotBars(grayForHist);

    }

    public static void reverse() {
        Picture reversePic = new Picture("Dmitri.JPG");  //760x1000
        for (int col = 0; col < reversePic.width(); col++) {
            for (int row = 1; row < reversePic.height() / 2; row++) {
                Color colorUp = reversePic.get(col, row);
                Color colorDown = reversePic.get(col, reversePic.height() - row);
                reversePic.set(col, row, colorDown);
                reversePic.set(col, reversePic.height() - row, colorUp);
            }
        }
        reversePic.show();
    }

    public static void RGB() {
        Picture redPic = new Picture("Dmitri.JPG");
        Picture greenPic = new Picture("Dmitri.JPG");
        Picture bluePic = new Picture("Dmitri.JPG");
        for (int col = 0; col < redPic.width(); col++) {
            for (int row = 0; row < redPic.height(); row++) {
                Color red = redPic.get(col, row);
                Color red1 = new Color(red.getRed(), 0, 0);
                redPic.set(col, row, red1);

                Color green = greenPic.get(col, row);
                Color green1 = new Color(0, green.getGreen(), 0);
                greenPic.set(col, row, green1);

                Color blue = bluePic.get(col, row);
                Color blue1 = new Color(0, 0, blue.getBlue());
                bluePic.set(col, row, blue1);
            }
        }
        redPic.show();
        greenPic.show();
        bluePic.show();
    }

}

