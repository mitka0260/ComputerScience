public class Ex2116 {

    public static void main(String[] args) {
        double[] array = {2.0, 3.1, 8.6, 9.3, 6.0, 1.1};

        for (int i = 0; i < array.length; i++)
            StdOut.print(array[i] + " ");
        StdOut.println();

        double[] scaledArray = new double[array.length];
        scaledArray = scale(array);
        for (int i = 0; i < scaledArray.length; i++)
            StdOut.printf("%6.3f", scaledArray[i]);
    }

    public static double maxValue(double[] arrayMax) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < arrayMax.length; i++) {
            if (arrayMax[i] > max)
                max = arrayMax[i];
        }
        return max;
    }

    public static double minValue(double[] arrayMin) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arrayMin.length; i++) {
            if (arrayMin[i] < min)
                min = arrayMin[i];
        }
        return min;
    }

    public static double[] scale(double[] arrayForScale) {

        double max;
        max = maxValue(arrayForScale);
        StdOut.println("max value = " + max);

        double min;
        min = minValue(arrayForScale);
        StdOut.println("min value = " + min);

        for (int i = 0; i < arrayForScale.length; i++) {
            arrayForScale[i] = (arrayForScale[i] - min) / (max - min);
        }
        return arrayForScale;
    }
}
