public class TriangleTest {

    public static boolean areTriangular(double a, double b, double c) {
        boolean value = a < b + c && b < a + c && c < a + b;
        return value;
    }

    public static void main(String[] args) {
        System.out.println("The values could be a triangle: " + areTriangular(3.0, 4.0, 6.9));
    }
}
