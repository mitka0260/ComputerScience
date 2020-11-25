public class Exercises1_ {
    public static void main(String[] args) {

	boolean a=true;
	boolean b=true;
	boolean c;	
	c = (!(a&&b)&&(a||b))||((a&&b)||!(a||b));
	System.out.println(c);
	System.out.println();

	a=true;
	b=false;
	c = (!(a&&b)&&(a||b))||((a&&b)||!(a||b));
	System.out.println(c);
	System.out.println();

	a=false;
	b=true;
	c = (!(a&&b)&&(a||b))||((a&&b)||!(a||b));
	System.out.println(c);
	System.out.println();

	a=false;
	b=false;
	c = (!(a&&b)&&(a||b))||((a&&b)||!(a||b));
	System.out.println(c);
	System.out.println();



	System.out.println(2+"bc"); //2bc 
	System.out.println(2+3+"bc"); //5bc
	System.out.println((2+3)+"bc"); //5bc
	System.out.println("bc"+(2+3)); //bc5
	System.out.println("bc"+2+3); //bc23
	System.out.println();


	System.out.println('b');
	System.out.println('b' + 'c');
	System.out.println((char)('a'+4));
	System.out.println();


	int d = 2147483647;
	System.out.println(d);
	int e = Integer.MAX_VALUE;	//max значение для int
	System.out.println(e);
	System.out.println(e+1);
	System.out.println(2-e);
	System.out.println(-2-e);
	System.out.println(2*e);
	System.out.println(4*e);
	System.out.println();

	System.out.println("Exercise 1.2.11");
	double f = 3.14159;
	System.out.println(f);
	System.out.println(f+1);
	System.out.println(8/(int)f);
	System.out.println(8/f);
	System.out.println((int)(8/f));
	System.out.println();

	System.out.println("Exercise 1.2.13");
	boolean g;
	g = Math.sqrt(2)*Math.sqrt(2) == 2;
	System.out.println(Math.sqrt(2)*Math.sqrt(2));
	System.out.println(g);
	System.out.println();

	System.out.println("Exercise 1.2.14");
	int j = 10;
	int k = 3;
	System.out.println(j/k);
	System.out.println(j%k);
	boolean l;
	l = (j%k == 0);
	System.out.println(l);
	System.out.println();

    }
}
