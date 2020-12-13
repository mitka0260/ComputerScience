public class TwentyQuestions {

	public static void main(String[] args) {

/*
программа генерирует число и предлагает мне его угадать
*/

		int secret = 1 + (int)(Math.random()*1000);
		StdOut.println("I'm thinking about a number between 1 and 1000");
		int guess = 0;

		while (guess!=secret) {
			StdOut.print("What's is your guess? ");
			guess = StdIn.readInt();
			if (guess==secret) StdOut.println("You win!");
			if (guess<secret) StdOut.println("Too low ");
			if (guess>secret) StdOut.println("Too high ");
		}

	}
}