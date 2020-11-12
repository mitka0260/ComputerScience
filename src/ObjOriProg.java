import java.awt.*;

import static java.lang.Character.toUpperCase;

public class ObjOriProg {

    //STRING, COLOR, PICTURE, IN, OUT

    public static void main(String[] args) {
        String s = new String("Hello World");   //слово "new" вызовает конструктор для создания объекта
        char c = s.charAt(4);                   //вызов метода экземпляра, работающего с хранящимся в нём значением
        StdOut.print(c + " ");
        c = toUpperCase(s.charAt(4));
        StdOut.println(c);

        String t = new String("autoexec.bat");
        int dot = t.indexOf(".");
        String base = t.substring(0, dot);
        String extension = t.substring(dot + 1, t.length());
        StdOut.println("Name is " + base + "       extension is " + extension);
        StdOut.println();

        StdOut.println(isPotentialGene("ATGCGCCTGCGTCTGTACTAG"));
        StdOut.println(isPotentialGene("ATGCGCTGCGTCTGTACTAG"));

        //albersSquares();
        StdOut.println();

        Color c1 = new Color(232, 232, 232);
        Color c2 = new Color(0, 0, 0);
        StdOut.println("Два цвета совместимы - " + areCompatible(c1, c2));

        Color c3 = new Color(9, 90, 166);
        Color c4 = new Color(232, 232, 232);
        StdOut.println("Два цвета совместимы - " + areCompatible(c3, c4));

        Color c5 = new Color(9, 90, 166);
        Color c6 = new Color(0, 0, 0);
        StdOut.println("Два цвета совместимы - " + areCompatible(c5, c6));

        //работа с PICTURE - преобразование в чёрно-белую фотку
        StdOut.println();
        Picture picture = new Picture("MG_3821_big.JPG");       //создаёт изображение используя этот файл
        for (int col = 0; col < picture.width(); col++) {
            for (int row = 0; row < picture.height(); row++) {
                Color color = picture.get(col, row);        //get - возвращает цвет пикселя
                Color gray = toGray(color);
                picture.set(col, row, gray);                //присваивает пикселю цвет
            }
        }
        picture.show();

        //масштабиррование фотографии SCALE
        //часть пикселей просто стирается (при уменьшении)
        //или берётся один пиксель в центре и вокргу него создаются того же цвыета пиксели (при увеличении)
        Picture source = new Picture("MG_3821_big.JPG");    //создаёт изображение используя этот файл
        int w = source.width() / 3;     //размеры приёмника
        int h = source.height() / 3;    //чтобы увеличить изображение, надо умножить на 3
        Picture target = new Picture(w, h);                 //создаёт пустое изображние w*h
        for (int colT = 0; colT < w; colT++) {      //colT, rowT - координаты пикселя приёмника
            for (int rowT = 0; rowT < h; rowT++) {
                int colS = colT * source.width() / w;   //colS, rowS - координаты пикселя источника
                int rowS = rowT * source.height() / h;
                target.set(colT, rowT, source.get(colS, rowS));
            }
        }
        //source.show();
        //target.show();

        fade();
    }

    //превращение одного изображения в другое
    //эффект растворения FADE
    //используется линейная интерполяция
    public static void fade() {
        Picture source = new Picture("Dmitri.JPG"); //оба изображение должны иметь = ширину и высоту
        Picture target = new Picture("Alisa.JPG");
        int n = 200;  //количество изображений
        int width = source.width();
        int height = source.height();
        Picture picture = new Picture(width, height);
        for (int i = 0; i <= n; i++) {
            for (int col = 0; col < width; col++) {
                for (int row = 0; row < height; row++) {
                    Color c1 = source.get(col, row);
                    Color c2 = target.get(col, row);
                    double alpha = (double) i / n;
                    Color color = blend(c1, c2, alpha);
                    picture.set(col, row, color);
                }
            }
            picture.show();
        }
    }

    public static Color blend(Color c1, Color c2, double alpha) {
        double r = (1 - alpha) * c1.getRed() + alpha * c2.getRed();
        double g = (1 - alpha) * c1.getGreen() + alpha * c2.getGreen();
        double b = (1 - alpha) * c1.getBlue() + alpha * c2.getBlue();
        return new Color((int) r, (int) g, (int) b);

    }

    //ЭТО ПРИМЕР РАБОТЫ СО STRING
    //проверка, может ли цепочка быть геном
    public static boolean isPotentialGene(String dna) {
        if (dna.length() % 3 != 0) //длина кратна трём
            return false;
        if (!dna.startsWith("ATG")) //должна начинаться с такой последовательности
            return false;
        for (int i = 3; i < dna.length() - 3; i++) {
            if (i % 3 == 0) {
                String codon = dna.substring(i, i + 3);
                if (codon.equals("TAA"))    //эти последовательности стоп-кодонов могут быть только в конце
                    return false;
                if (codon.equals("TAG"))
                    return false;
                if (codon.equals("TGA"))
                    return false;
            }
        }
        if (dna.endsWith("TGA"))
            return true;
        if (dna.endsWith("TAG"))
            return true;
        if (dna.endsWith("TGA"))
            return true;

        return false;
    }

    //работа с типом данных COLOR
    public static void albersSquares() {
        int r1 = 9;     //или Integer.parseInt(args[0]);
        int g1 = 90;
        int b1 = 166;
        Color c1 = new Color(r1, g1, b1); //синий

        int r2 = 100;
        int g2 = 100;
        int b2 = 100;
        Color c2 = new Color(r2, g2, b2); //серый цвет

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.25, 0.5, 0.2); //координаты центра квадрата (слева 0,25 и по высоте посередине) + диаметр

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.25, 0.5, 0.1);

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.75, 0.5, 0.2);

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.75, 0.5, 0.1);

        StdDraw.setPenColor(Color.black);
        StdDraw.text(0.5, 0.73, "Albers Squares");

        Color red = new Color(255, 0, 0);
        StdDraw.setPenColor(red);
        StdDraw.filledSquare(0.1, 0.9, 0.05);
        StdDraw.setPenColor(Color.red);
        StdDraw.text(0.1, 0.8, "red");

        Color green = new Color(0, 255, 0);
        StdDraw.setPenColor(green);
        StdDraw.filledSquare(0.2, 0.9, 0.05);
        StdDraw.setPenColor(Color.green);
        StdDraw.text(0.2, 0.8, "green");

        Color blue = new Color(0, 0, 255);
        StdDraw.setPenColor(blue);
        StdDraw.filledSquare(0.3, 0.9, 0.05);
        StdDraw.setPenColor(Color.blue);
        StdDraw.text(0.3, 0.8, "blue");

        Color bookBlue = new Color(9, 90, 166);
        StdDraw.setPenColor(bookBlue);
        StdDraw.filledSquare(0.4, 0.9, 0.05);
        StdDraw.setPenColor(bookBlue);
        StdDraw.text(0.4, 0.8, "bookBlue");

        Color black = new Color(0, 0, 0);
        StdDraw.setPenColor(black);
        StdDraw.filledSquare(0.5, 0.9, 0.05);
        StdDraw.setPenColor(black);
        StdDraw.text(0.5, 0.8, "black");

        Color darkGrey = new Color(100, 100, 100);
        StdDraw.setPenColor(darkGrey);
        StdDraw.filledSquare(0.6, 0.9, 0.05);
        StdDraw.setPenColor(darkGrey);
        StdDraw.text(0.6, 0.8, "dark grey");

        Color white = new Color(255, 255, 255);
        StdDraw.setPenColor(white);
        StdDraw.filledSquare(0.7, 0.9, 0.05);
        StdDraw.setPenColor(black);
        StdDraw.text(0.7, 0.8, "white");

        Color yellow = new Color(255, 255, 0);
        StdDraw.setPenColor(yellow);
        StdDraw.filledSquare(0.8, 0.9, 0.05);
        StdDraw.setPenColor(yellow);
        StdDraw.text(0.8, 0.8, "yellow");

        Color pompadour = new Color(255, 0, 255);
        StdDraw.setPenColor(pompadour);
        StdDraw.filledSquare(0.9, 0.9, 0.05);
        StdDraw.setPenColor(pompadour);
        StdDraw.text(0.9, 0.8, "pompadour");
    }

    //чтобы текст был виден на фоне, их яркости должны различаться минимум на 128
    public static boolean areCompatible(Color a, Color b) {
        return Math.abs(intensity(a) - intensity(b)) >= 128.0;
    }

    //яркость - чувствительность глаза в красному, зелёному и сиинему
    //Y = 0.299r + 0.587g + 0.114b
    //сумма коэфициентов = 1
    //все значения цветов = от 0 до 255
    public static double intensity(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return 0.299 * r + 0.587 * g + 0.114 * b;
    }

    //если r=g=r, то это к-л оттенок серого цвета (от чёрного все 0 - до белого все 255)
    //чтобы преобразовать фото в чёрно-белую, можно каждый цвет преобразовать в r=g=b=его монохромная яркость
    public static Color toGray(Color color) {
        int y = (int) Math.round(intensity(color));
        Color gray = new Color(y, y, y);
        return gray;
    }

}
