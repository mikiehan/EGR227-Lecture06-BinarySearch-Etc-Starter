package recursion2;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides more example on recursion
 * Created by mhan on 2/2/2017.
 */
public class RecursionWithHelper {

    public static void main(String[] args) {
        System.out.println(primeFactors(54));
        System.out.println(primeFactorsWithRecursion(54));
    }

    //primeFactors with iteration
    //Need to return the list of primes which are the factor of n
    //ex) primeFactor(54) should return [2, 3, 3, 3]
    //ex) primeFactor(24) should return [2, 2, 2, 3]
    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    //primeFactors with recursion
    public static List<Integer> primeFactorsWithRecursion(int n) {
        return primeFactorsHelper(n,2);
    }

    //a private helper to recursive approach
    private static List<Integer> primeFactorsHelper(int n, int f) {
        return null; //Overwrite this code
    }

}
