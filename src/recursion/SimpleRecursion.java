package recursion;

import java.util.Scanner;

/**
 * Provides example of recursion
 * Created by mhan on 2/2/2017.
 */
public class SimpleRecursion {

    public static void main(String[] args){
        System.out.println(factorial(10));
        System.out.println(factorialWithRecursion(10));

    }

    /**
     * factorial with iteration
     */
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n ; i++){
            fact *= i;
        }
        return fact;
    }

    /**
     * Implement factorial with recursion
     */
    public static int factorialWithRecursion(int n){
        return -1; //overwrite this code
    }

    /**
     * calculates sum of fractions with iteration
     */
    public static double fractionSum(int n){
        double sum = 0;
        for(int i = 1 ; i <= n ; i++)
            sum += (double) 1/i;
        return sum;
    }

    /**
     * Implement calculating sum of fractions with recursion
     */
    public static double fractionSumWithRecursion(int n){
        return -1;
    }

    // iterative method that produces an output line of exactly n stars
    public static void writeStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // recursive method that produces an output line of exactly n stars
    public static void writeStarsWithRecursion(int n) {
        //Write your code here
    }
}
