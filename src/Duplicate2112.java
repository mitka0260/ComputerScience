public class Duplicate2112 {

    public static String duplicate(String s) {
        String t = s + s;
        return t;
    }

    public static void main(String[] args) {
        String s = "Hello";
        s = duplicate(s);
        StdOut.println(s);
        String t = "Bye";
        t = duplicate(duplicate(duplicate(t)));
        StdOut.println(t);
        StdOut.print(s + t);

    }

}
