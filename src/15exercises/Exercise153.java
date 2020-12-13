public class Exercise153 {

	//java Exercise153 3

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int sum = 0;

		for (int j = 0; j<n; j++) {
			int value = StdIn.readInt();
			sum = sum + value;
		}

		System.out.println("Average is " + sum/n);		

	}
}