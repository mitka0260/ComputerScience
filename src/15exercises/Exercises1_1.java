public class Exercises1_1 {

	//java Exercises1 < data.txt

	public static void main(String[] args) {

		int max = (int)Double.NEGATIVE_INFINITY;
		int min = (int)Double.POSITIVE_INFINITY;

		while ( !StdIn.isEmpty() ) {
			int value = StdIn.readInt();

				if (value<=0)
					System.out.println("The programm processes only positive values");
				else {
					if (value>max) max = value;
					if (value<min) min = value;
				}
		}

		System.out.println(max + " " + min);

	}
}