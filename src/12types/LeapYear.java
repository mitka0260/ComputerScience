public class LeapYear {

	//программа на тип boolean - логический оператор
	//проверка года на високосность

    public static void main(String[] args) {
	
	int year = Integer.parseInt(args[0]);
	boolean isLeapYear;
	isLeapYear = (year%4 == 0);
	isLeapYear = isLeapYear && (year%100 != 0);
	isLeapYear = isLeapYear || (year%400 ==0);

	System.out.println(isLeapYear);
	System.out.println();

    }
}
