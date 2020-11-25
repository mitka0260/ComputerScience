public class Array {
	public static void main(String[] args) {

		int n = 10;
		double[] a = new double[n];
		for (int i = 0; i<10; i++) {
			a[i] = i;
			System.out.print((int)a[i] + " ");
		}

		System.out.println();
		System.out.println();

		//случайные числа
		for (int i=0; i<10; i++) {
			a[i] = Math.random();
			System.out.printf("%6.3f", a[i]);
		}

		System.out.println();
		System.out.println();

		//определю максимальное значение в последнем массиве
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i<a.length; i++)
			if (a[i]>max) max = a[i];
		System.out.println("max value = " + max);

		System.out.println();
		System.out.println();

		//обратная перестановка элементов массива
		for (int i = 0; i<a.length/2; i++) {
			double temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}

		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);

		System.out.println();
		System.out.println();

		//Чем Java автоматически заполняет массив - нулями для чисел, false для boolean, null для string
		double[] b = new double[10];
		for (int i = 0; i<b.length; i++)
			System.out.println(b[i]);

		System.out.println();
		System.out.println();

		//массив можно заполнить при его объявлении
		//тогда слова new НЕ ОБЯЗАТЕЛЬНО
		String[] SUITS = {"буби", "крести", "пика", "черви" };
		String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз" };
		int c = (int) (Math.random()*RANKS.length);
		int d = (int) (Math.random()*SUITS.length);
		System.out.println(RANKS[c] + " " + SUITS[d]);

		System.out.println();
		System.out.println();



		//создаю новый массив для целой колоды и заполняю его во время во время выполнения
		String[] deck = new String[RANKS.length*SUITS.length];

		for (int i=0; i<RANKS.length; i++) {
			for (int j = 0; j<SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " " + SUITS[j];
				System.out.print(deck[SUITS.length*i + j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println();

	}
}
