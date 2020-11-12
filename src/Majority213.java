public class Majority213 {

    public static boolean majority(boolean[] x) {
        int i = 0;
        for (int j = 0; j < x.length; j++) {
            if (x[j] == true) i = i + 1;
        }
        if (i >= 2) return true;
        else return false;
    }


    public static void main(String[] args) {
        boolean[] a = {false, false, true};

        boolean value = majority(a);
        StdOut.println(value);
    }
}
