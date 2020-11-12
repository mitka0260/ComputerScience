/*
3.2.8
хранение информации о клиенте в финансовой организации
имя, кол-во видов акций
обозначения акций
кол-во акций каждого вида
сколько денег есть на счету

брокер покупает и продаёт акции + отчитывается
 */
/*
public class StockAccount {
    private final String name;  //имя владельца
    private double cash;        //остаток денег
    private int n;              //кол-во видов акций
    private int[] shares;       //биржевые кодовые изображения - параллельные массивы
    private String[] stocks;    //кол-во акций каждого вида

    private StockAccount(String filename) {
        In in = new In(filename);
        name = in.readLine();
        cash = in.readDouble();
        n = in.readInt();
        shares = new int[n];
        stocks = new String[n];
        for (int i = 0; i < n; i++) {
            shares[i] = in.readInt();
            stocks[i] = in.readString();
        }
    }

    public void printReport() { //создание портфеля акций
        StdOut.println(name);
        double total = cash;
        for (int i = 0; i < n; i++) {
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += amount * price;
            StdOut.printf("%4d %5s ", amount, stocks[i]);
            StdOut.printf("%9.2f %11.2f\n", price, amount * price);
        }
        StdOut.printf("%21s %10.2f\n", "Cash: ", cash);
        StdOut.printf("%21s %10.2f\n", "Total:", total);
    }

    public static void main(String[] args) {
        StockAccount account = new StockAccount(args[0]);
        account.printReport();
    }

}
*/
