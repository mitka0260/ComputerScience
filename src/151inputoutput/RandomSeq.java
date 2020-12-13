public class RandomSeq {

    //java RandomSeq 10 > data.txt

    public static void main(String[] args) {

        // command-line argument
        int n = Integer.parseInt(args[0]);

        // generate and print n numbers between 0 and 1
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }
}