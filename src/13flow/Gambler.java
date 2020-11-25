public class Gambler {
    public static void main(String[] args) {

//<>

	int stake = 50;		//исходная сумма
	int goal = 250;		//выигрыш - желаемая сумма
	int trials = 100;	//кол-во опытов
	int bets = 0;		//кол-во ставок
	int wins = 0;		//кол-во побед

	for (int t = 0; t<trials; t++) {	//проведение одного опыта
		int cash = stake;
		while (cash>0 && cash<goal) {	//моделирование одной ставки
						bets++;			//игрок делает ставки по 1
			if (Math.random()<0.5)	cash++;
			else			cash--;
		}	//сумма достигает 0 (разорение) или goal (победа)
		if (cash == goal) wins++;
	}
	System.out.println(100*wins/trials+"% wins");
	System.out.println("Avg # bets: " + bets/trials);
	
    }
}
