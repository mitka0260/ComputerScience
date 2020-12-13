/*
для проврки является число простым есть программа Factors139
это алгоритм хорош для малых n

Для больших чисел:
РЕШЕТО ЭРАСТОСФЕНА
создаём boolean-массив, где true для простого, false - для сложного числа

Computes the number of primes less than or equal to n using
the Sieve of Eratosthenes.

 */

public class PrimeSieve {
    //напишет сколько есть простых чисел <=n

    //для 25: 2, 3, 5, 7, 11, 13, 17, 19, 23

    public static void main(String[] args) {
        int n = 25; //Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            isPrime[i] = true;  //все пока признаны простыми числами

        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= n / i; j++)    //если нет множителей < n/i, то и бОльших множителей не будет
                    isPrime[i * j] = false;         //мы не ищем делители, а умножаем число на j. Результат будет кратен j = число сложное
            }
        }

        int primes = 0;
        for (int i = 2; i <=n; i++)
            if (isPrime[i])     //каждое true в массиве означает простое число
                primes++;
        System.out.println(primes);

    }

}