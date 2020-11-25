public class Exercises2 {
    public static void main(String[] args) {

//<>
/*	System.out.println();
	System.out.println("Упражнение 1.3.23");
	System.out.println("Программа о разорении-выигрише игрока с использованием 2хwhile или 2хfor");

        int stake  = 50;    // gambler's stating bankroll исходная сумма
        int goal   = 250;    // gambler's desired bankroll выигрыш - желаемая сумма
        int trials = 1000;    // number of trials to perform кол-во опытов

        int bets = 0;        // total number of bets made кол-во ставок
        int wins = 0;        // total number of games won кол-во побед

        // repeat trials times проведение одного опыта
        for (int t = 0; t < trials; t++) {
*/
/*	Эту часть надо заменить на for
            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) { //моделирование одной ставки
                bets++;				//кол-во ставок возрастает на 1
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }					     //сумма достигает 0 (разорение) или goal (победа)
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
*/

/*		int cash = stake;
		for (int i = 0; cash > 0 && cash < goal; i++) {
			bets++;
        	        if (Math.random() < 0.5) cash++;     // win $1
	                else                     cash--;     // lose $1
		}
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
*/

/*	System.out.println();
	System.out.println("Упражнение 1.3.27");
	System.out.println("каждый простой множитель выводится только один раз");

	long n = 45;

	for (long factor = 2; factor<=n/factor; factor++) {

		boolean g = false;

		//проверка потенциального множителя
		while (n%factor==0) {
			n = n/factor;
			g = true;
//			System.out.print(factor + " ");
		}	//любой множитель n должен быть больше factor

		if (g) System.out.print(factor + " ");

	}
	if (n>1) System.out.print(n);
	System.out.println();
*/


/*	System.out.println();
	System.out.println("Упражнение 1.3.29");
	System.out.println("рисуем шахматную доску");
*/
/*	int n = 10;
//здесь выводятся неверно сверху вниз - должны чередоваться * и пробелы, а у меня * под звёздочкой
	for (int i = 0; i<n; i++) {
		for (int j = 0; j<n; j++) {
			if (j%2==0)	System.out.print("*");
			else		System.out.print(" ");
		} System.out.println();
	}

*/

/*        int N = 10;

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (y % 2 == 0) {
                    if (x % 2 == 0) {System.out.print("*");}
                    else {System.out.print(" ");
                    }
                }
                else {
                    if (x % 2 == 0) {System.out.print(" ");}
                    else {System.out.print("*");}
                }
            }
            System.out.println();
        }
*/

/*	System.out.println();
	System.out.println("Упражнение 1.3.30");
	System.out.println("находим НОД по алгоритму евклида");
//если х больше у, то если х делится на у, то НОД х и у равен у;
//в противном случае НОД х и у равен НОД х % у и у

	int x = 1071;
	int y = 462;
	//x > y чтобы не мучиться

	if (x%y==0) { System.out.println(y); }

	while (y!=0) {
		if (x>y)
			x = x-y;
		else
			y = y - x;
	}
	System.out.println(x);
*/

/*	System.out.println();
	System.out.println("Упражнение 1.3.31");
	System.out.println();

	int N = 10;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int x = i;
                int y = j;

                while (x % y != 0) {
                    if (x < y) {
                        int tmp = x;
                        x = y;
                        y = tmp;
                    }

                    x = x % y;
                }

                if (y == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
*/


        System.out.println("Упражнение 1.3.32");

        int k = 10;

        int power = 0;
        if (Math.abs(k) != 1 && k != 0)
        {
            while (Math.pow(k, power) < Long.MAX_VALUE)
            {
                long result = (long)Math.pow(k, power);

                if (result > 0)
                    System.out.println (result);

                power++;
            }
        }
        else
            System.out.println(k);





    }
}
