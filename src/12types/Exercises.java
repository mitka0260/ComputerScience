public class Exercises {
    public static void main(String[] args) {

	int a = 2;
	int b = 5;
	int t;
        System.out.print("a = " + a);	
        System.out.print("   b = " + b);	
        System.out.println("   t = " + "not defined yet");	
        System.out.println();	
	t = a;
        System.out.println("t = a");
        System.out.println(a + " " + b + " " + t);
        System.out.println();
	b=t;
        System.out.println("b = t");
        System.out.println(a + " " + b + " " + t);
        System.out.println();	
	a=b;
        System.out.println("a = b");
        System.out.println(a + " " + b + " " + t);
        System.out.println();	



	for (int c = 1; c < 360; c++) { //in degrees
	double d = Math.toRadians(c); //converting values to radians 
	double e = Math.cos(d) * Math.cos(d) + Math.sin(d)*Math.sin(d); // не всегда равно 1 - округление?
	System.out.println(e);	
	}

    }
}
