public class Transition {

	//java Transition < tinyG.txt

	public static void main(String[] args) {

		int n = StdIn.readInt();	//кол-во страниц
		int[][] counts = new int[n][n];	//кол-во ссылок с i на j
		int[] outDegrees = new int[n];	//кол-во ссылок с i куда угодно

		while ( !StdIn.isEmpty() ) {
			int i = StdIn.readInt();
			int j = StdIn.readInt();
			outDegrees[i]++;
			counts[i][j]++;
		}

		StdOut.println(n + " " + n);
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				double p = 0.9*counts[i][j]/outDegrees[i] + 0.1/n;
				StdOut.printf("%8.5f", p);
			}
			StdOut.println();
		}

	}
}