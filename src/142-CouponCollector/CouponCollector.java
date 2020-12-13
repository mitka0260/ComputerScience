public class CouponCollector {

//skolko kart nuzno perevernut 4toby otkray kak minimum po odnoj karte kazdoj masti

	public static void main(String[] args) {

		/*
		создали массив длиной 1000 - все false. 1000 видов карт.
		 */
		int n = Integer.parseInt(args[0]);
		boolean[] isCollected = new boolean[n];  //создаётся массив длинной n, состоит из true-false
		int count = 0;		//сколько карт всего перевенули (часть открытых уже была открыта и тогда получается "холостое" открытие
		int distinct = 0;	//кол-во открытых типов карт

		while (distinct < n) {
			int r = (int)(Math.random()*n); //генерирует числа от 0 до n-1 - от 0 до 999
			count++;						//каждая итерация цикла - это +1 переворачивание карты

			if (!isCollected[r]) {			//если в случайной ячейке false, то значит раньше мы эту ячейку ещё не открывали
				distinct++;	//это значение всегда равно кол-ву true в массиве (если в ячейке был false, значит открыли ещё разновидность карты и тогда кол-во открытых карт ++
				isCollected[r] = true; //если раньше эта карта не встречалась, то присваивается значение true
			}
		}
		System.out.println(count);
	}
}
