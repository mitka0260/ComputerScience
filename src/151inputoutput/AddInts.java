public class AddInts {

	//java AddInts 4

	public static void main(String[] args) {

		int n = 4; //Integer.parseInt(args[0]);
		System.out.println("Введите " + n + " целых чисел через пробел");
		int sum = 0;
		for (int i = 0; i<n; i++) {
			int value = StdIn.readInt();
			sum = sum + value;
		}
		StdOut.println("Sum is " + sum);

	}
}