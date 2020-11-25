public class Exercises1 {
	public static void main(String[] args) {

//<>
/*	System.out.println("Упражнение 1.3.1");
	//пишет equal если все три числа равны
	int a = 3;
	int b = 2;
	int c = 2;
	if ((a==b) && (b==c))	System.out.println("equal");
	else			System.out.println("not equal");
	System.out.println();
*/

/*	System.out.println("Упражнение 1.3.2");
	//более надёжное решение квадратного уравнения

	double a = 1;
	double b = -10;
	double c = 21;
	double discriminant = b*b - 4.0*a*c;

	if (discriminant > 0.0) {
		double x1 = (-b+Math.sqrt(discriminant))/(2*a);
		double x2 = (-b-Math.sqrt(discriminant))/(2*a);
		System.out.println(x1 + "; " + x2);
	}
	else if (discriminant == 0.0) {
		double x3 = -b/(2*a);
		System.out.println("только один корень " + x3);
	}
	else
		System.out.println("нет корней ");
*/
/*	System.out.println("Упражнение 1.3.3");
	int a = 10;
	int b = 4;
	int c = 10;
	if (a>b) c = 0; else c=100;
	System.out.println(c);
*/

/*	System.out.println("Упражнение 1.3.4");
	//проверка, что оба x и y находятся между 0 и 1
	double x = 0.3;
	double y = 0.9;
	if (x>0.0 && x<1.0) {
		if (y>0.0 && y<1.0)
		System.out.println("true");
		else System.out.println("false");
	}
	else System.out.println("false");
*/

/*	System.out.println("Упражнение 1.3.5");
//	бросается кубик. Всё грани выпадают с вероятностью 1/8, а грань "6" с вероятностью 3/8
	double r;
	int roll;

	r = Math.random();
	if	(r<1.0/8.0)	roll = 1;
	else if	(r<2.0/8.0)	roll = 2;
	else if	(r<3.0/8.0)	roll = 3;
	else if	(r<4.0/8.0)	roll = 4;
	else if (r<5.0/8.0)	roll = 5;
	else			roll = 6;
	System.out.println(roll);
*/

//	System.out.println("Упражнение 1.3.6");
		//Совершенствую упражнение 1.2.25
/*
	Охлаждение под действием ветра.
	Для заданной температуры Т (по шкале Фаренгейта) и скорости ветра v (в милях в час) Национальная метеорологическая служба вычисляет фактическую температуру (охлаждение под действием ветра)
	по формуле: w = 35.74 + 0.6215T + (0.4275Т — 35.75) (v в степени 0.16).
	Напишите программу, которая получает два числа типа double temperature и velocity в аргументах командной строки и выводит величину охлаждения. Для вычисления a в степени b используйте Math.pow(a, b).
	Примечание: формула недействительна, если абсолютное значение Т больше 50 или если v больше 120 или меньше 3 (предполагается, что полученные значения лежат в этом диапазоне).
*/

/*      double t = 25;
        double v = 10;
	double w;

	if (t<50) {
		if (v<120 && v>3) {
	        	w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		        System.out.println("Temperature = " + t);
		        System.out.println("Wind speed  = " + v);
		        System.out.println("Wind chill  = " + w);
		}
		else 	System.out.println("формула не работает");
	}
	else 	System.out.println("формула не работает");
*/

/*	System.out.println("Упражнение 1.3.7");
	int i;
	int j;
*/
/*	for (i=0, j=0; i<10; i++) {
		j += i;
		System.out.println(j);
	}
	System.out.println();
	System.out.println(j); //45
*/
/*	for (i=0, j=1; i<10; i++) {
		j += j;
		System.out.println(j);
	}
	System.out.println();
	System.out.println(j); //1024
*/
/*	for (j=0; j<10; j++) {
		j += j;
		System.out.println(j);
	}
	System.out.println();
	System.out.println(j);  //15
*/
/*	for (i=0, j=0; i<10; i++) {
		j += j++;
		System.out.println(j);
	}
	System.out.println();
	System.out.println(j);  //0
*/

/*	System.out.println("Упражнение 1.3.8");
//	1st 2nd 3rd 4st - ставит правильные окочания числительных везде
        int n = 50 ;

        for (int i = 1; i <= n; i++) {
            System.out.print(i);

            // ends in 11 through 20 -> use "th" as suffix
            if (i % 100 >= 11 && i % 100 <= 20) {
                System.out.print("th");
            }

            // otherwise if ends in { 1, 2, 3 } -> use { "st", "nd", "rd" }  as suffix
            else if (i % 10 == 1) System.out.print("st");
            else if (i % 10 == 2) System.out.print("nd");
            else if (i % 10 == 3) System.out.print("rd");

            // otherwise use "th" as suffix
            else                  System.out.print("th");

            System.out.println(" Hello");
        }
*/

/*	System.out.println("Упражнение 1.3.9");
	//выводит целые числа по 5 чисел на одной строке
	int j = 2000;
        for (int i = 1000; i <= j; i++) {
		if (i%5==0) System.out.println();
		System.out.print(i + " ");
	}
*/

		// print integers from 1000 to 2000, 5 per line
/*      int START = 1000;
        int END   = 2000;
        int PER_LINE = 5;
        for (int i = START; i <= END; i++) {
            System.out.print(i + " ");
            if ((i + 1) % PER_LINE == 0) System.out.println();
        }
        System.out.println();
*/

/*	System.out.println("Упражнение 1.3.10");
//	генерирует случайные числа и выводит их среднее
	int n = 20;
	double b;
	double c = 0;
	for (int i = 0; i<n; i++) {
		b = Math.random();
		System.out.print(b + " ");
		c = c + b;
	}
	System.out.println();
	System.out.println("average = " + c/n);
*/

/*	System.out.println("Упражнение 1.3.12");
	System.out.println();
	System.out.println("log n \tn \tn log n \tn^2 \tn^3");
	for (long i = 16; i<=2048; i=i*2) {
		System.out.print((int)Math.log(i));
		System.out.print('\t');
		System.out.print(i);
		System.out.print('\t');
		System.out.print((int)(i*Math.log(i)));
		System.out.print('\t');
		System.out.print(i*i);
		System.out.print('\t');
		System.out.print(i*i*i);
		System.out.println();
	}
*/
/*	System.out.println("Упражнение 1.3.13");
	int n = 123456789;
	int m = 0;
	while (n != 0) {
		m = (10*m)+(n%10);
		n = n/10;
	}
	System.out.println(m);  //выводит то же число только в обратном порядке

        // reverse again using string concatenation
        String s = "";
        while (m != 0) {
            int digit = m % 10;
            s = s + digit;
            m = m / 10;
        }
        System.out.println(s);
*/

/*	System.out.println("Упражнение 1.3.14");
	//выводит последовательность Фибоначчи
	//следующее число = сумме двух предыдущих
	int f = 0, g = 1;
	for (int i = 0; i<=15; i++) {
//		System.out.print(f);
		f = f + g; 		System.out.print(f + " ");
		g = f - g;		System.out.println(g);
	}
*/

/*	System.out.println("Упражнение 1.3.15");
		for (int i = 0; i<999; i++); {
			System.out.println("Hello"); //выедет только один раз, т.к. после for стоит ";"
		}
*/

/*	System.out.println("Упражнение 1.3.16");
	//выводит все + степени 2, меньшие или равные n
	int n = 256;
	int m;
	for (int i = 0; ; i++) {
		m = (int)Math.pow(2,i);
		if (m>n) {
			System.out.println("дальше степень 2 больше n");
			break;
		}
		System.out.println(m);
	}
*/

/*	System.out.println("Упражнение 1.3.18");
	System.out.println();
	int n = 1000000;
	double sum = 0.0;

	System.out.println("Pi = " + Math.PI);
	System.out.println("Pi*Pi/6 = " + Math.PI*Math.PI/6);
	System.out.println();

	for (int i = 1; i<=n; i++) {
		sum = sum + (1/(1.0*i*i));		//1.0 обязательно для преобразования типов
	}
	System.out.println("Pi*Pi/6 = " + sum); 	//эта сумма стремится к Pi*Pi/6
	System.out.println("Pi = " + Math.sqrt(sum*6.0));	//Вычисленное значение Пи по этой формуле
*/

/*	System.out.println();
	System.out.println("Упражнение 1.3.19");
	System.out.println("Вычисление квадратного корня методом Ньютона");
//	не стал выполнять - это просто скопированный код
//	goes into an infinite loop if the input is negative

        // read in the command-line argument
//      double c = Double.parseDouble(args[0]);
	double c = 0.4;
        double epsilon = 1.0e-15;  // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) { //Math.abs нужен если c < 1
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println("квадратный корень из " + c + " = " + t);
*/





/*
На основе программы Binary создайте программу Кагу, которая получает два целых числа i и к в аргументах командной строки и преобразует i в систему счисления с основанием к. Предполагается, что i — целое число с типом данных Java long, а к — целое число в диапазоне от 2 до 16. В системах счисления с основанием больше 10 для представления цифр, соответствующих десятичным значениям с 11 до 16, используйте буквы A-F.
*/
/*	System.out.println();
	System.out.println("Упражнение 1.3.21");
	System.out.println("Запись числа в двоичном формате");

	int n = 19;

	//set power to the largest power of 2 that is <= n
	int power = 1;
	while (power <= n/2) {	//выполняется пока это условие верно
		power=2*power;	//выполняется это действие
	}
//	System.out.println(power); //это самая высокое число, близкое к n, но не бОльшее его

	//check for presence of powers of 2 in n, from largest to smallest
	while (power>0) {

		//power is not present in n
		if (n<power)	{System.out.print(0);}

		//power is present in n, so subtract power from n
		else		{System.out.print(1); n=n-power;}

		// next smallest power of 2
		power = power/2;
	}
	System.out.println();
	System.out.println();
*/

/*	System.out.println("Запись числа в формате от 2 до 16");

        //Print base-k representation of i.
        long i = 1234;
        int k = 16;

	System.out.print("Число " + i + " в системе " + k + " записывается как ");

        int v = 1;

        while (v <= i/k)
            v = k*v;
        // Now v is the largest power of k <= i.

        long n = i;
        while (v > 0) {
            //Cast out powers of k in decreasing order.
            if (n < v) {
                System.out.print("0");
            }
            else {
                int digit = (int)(n / v);
                if (digit > 9) {
                    char charDigit = (char)('a' + (digit - 10));
                    System.out.print(charDigit);
                }
                else
			System.out.print(digit);
                n = n - v*digit;
            }

            v = v/k;
        }

        System.out.println();
*/

		System.out.println();
		System.out.println("Упражнение 1.3.22");
		System.out.println("Запись целого числа в двоичном формате в string");

/*	int n = 5;

	String s = "";
	int power = 1;
	while (power <= n/2) power = power * 2;
	while (power > 0) {
		if (n<power)	{	s=s+0;	}
		else		{	s = s + 1; n = n - power; }
		power = power/2;
	}
	System.out.print(s);
*/

/*      int n = 16;

        // repeatedly divide by two, and form the remainders backwards
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
*/






	}
}
