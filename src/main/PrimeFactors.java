package main;
import java.util.*;

public class PrimeFactors {
    public static void main (String[] args) {
        int n = (args.length == 1? Integer.parseInt(args[0]) : 30);

        for (int primeFactor : returnPrimeFactors(n))
            System.out.print(Integer.toString(primeFactor) + " ");
    }


    // method recursively returns prime factors of a given number n
    public static ArrayList<Integer> returnPrimeFactors (int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int divisor = n;

        // check to see whether or not n is prime
        while(divisor > 2) {
            divisor--;
            // if it's not, generate prime factorization for n and add to list
            if (n % divisor == 0) {
                primeFactors.remove(Integer.valueOf(n));
                primeFactors.add(divisor);
                primeFactors.add(n / divisor);
                ArrayList<Integer> newPrimes = new ArrayList<>();
                ArrayList<Integer> toBeRemoved = new ArrayList<>(); // non-primes

                for (int prime : primeFactors)
                    if (newPrimes.addAll(returnPrimeFactors(prime)))
                        toBeRemoved.add(prime);

                primeFactors.addAll(newPrimes);
                primeFactors.removeAll(toBeRemoved);
                Collections.sort(primeFactors);
                return primeFactors;
            }
        }
        Collections.sort(primeFactors);
        return primeFactors;
    }
}
